package 查找某目录下的文件;

import java.io.File;

/**
 * Created by asd on 2016/9/7.
 */
/*
    把E:盘目录下所有java结尾的文件的绝对路径输出在控制台

    分析:
        1:封装目录
        2:获取该目录下的所有文件/文件夹的File数组
        3:遍历该数组,拿到每一个File对象
        4:判断该对象是否是文件夹
            是:回到第二步
            不是:继续判断是否是以.java结尾
                是:输出绝对路径
                不是:不理

 */
public class FilePathDemo {

    public static void main(String[] args) {
        //封装目录
        /**
         * 直接以盘符作为目录,调用方法会抛出空指针异常
         * 原因:
         *      查看文件的权限不够
         */
        File file = new File("E:\\java刘意");
        System.out.println(file);
        getPath(file);
    }

    private static void getPath(File f) {
        //获取目录下文件/文件夹所有的File数组
        File[] fileArray = f.listFiles();

        //遍历数组,拿到每个File对象
        for (File file1 : fileArray) {
            //判断对象是否是文件夹
            if (file1.isDirectory()) {
                getPath(file1);
            } else {
                //继续判断是否以.java结尾
                if (file1.getName().endsWith(".java")) {
                    System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }
}
