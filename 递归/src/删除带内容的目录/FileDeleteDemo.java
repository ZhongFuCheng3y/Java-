package 删除带内容的目录;

import java.io.File;

/**
 * Created by asd on 2016/9/7.
 */
/*
    需求:
        递归带删除带内容的目录
    分析:
        1:封装目录
        2:获取该目录下的所有文件/文件夹的File数组
        3:遍历该File数组,得到每一个File对象
        4:判断该File对象是否是文件夹
            是:回到2
            不是:删除
 */
public class FileDeleteDemo {

    public static void main(String[] args) {
        //封装目录
        File file = new File("demo");

        //为删除带内容的目录创建一个方法,用递归来做
        deleteMkdir(file);
    }

    private static void deleteMkdir(File f) {

        //获取该目录下的所有文件/文件下的File数组
        File[] fileArray = f.listFiles();

        /**
         * 下面的循环只删除了文件,没有删除文件夹
         */
        //遍历该File数组,得到每一个File对象
        for (File file1 : fileArray) {
            if (file1.isDirectory()){
                deleteMkdir(file1);
            }else {
                file1.delete();
            }
        }
        /**
         * 这里才删文件夹,把传入的参数看成是单级目录来理解
         */
        f.delete();
    }
}
