package 查找某目录下是否存在某文件;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    判断E盘目录下有否有后缀是.txt的文件,如果有,就输出文件名称
    步骤:
        1:封装e盘目录
        2:获取该目录下的文件/文件夹的File数组
        3:遍历File数组,得到每一个File对象
        4:判断File对象是否是文件
            是:
                继续判断是否以.txt结尾
                    是:输出文件名称
                    否:不理
            否:
               不理
 */
public class FileDemo {
    public static void main(String[] args) {

        //封装e盘目录
        File file = new File("e:\\");

        //获取该目录下的文件/文件夹的File数组
        File[] fileArray = file.listFiles();

        //遍历File数组,得到每一个File对象
        for(File f : fileArray) {

            //判断File对象是否是文件
            if(f.isFile()) {
                //判断是否以.txt结尾
                if(f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());
                }

            }
        }
    }
}
