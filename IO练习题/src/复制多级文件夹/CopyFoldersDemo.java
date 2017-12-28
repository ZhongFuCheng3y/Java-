package 复制多级文件夹;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        将项目目录下的demos多级文件复制到e盘
    分析:
        1:封装数据源
        2:封装目的地
        3:判断目录是文件还是文件夹
            文件:
                直接复制
            文件夹:
                1:创建文件夹
                2:获取文件夹下的File[]
                3:遍历File[],获取每个File对象
                4:判断File对象是文件还是文件夹(也就是第三步)

    要把文件复制到另一个路径
        1:首先我们先要在有目的地路径--也就是File对象
    比如:
        在c:\\a.txt复制到d盘的根目录
        首先要在d盘有d:\\a.txt路径




 */
public class CopyFoldersDemo {

    public static void main(String[] args) throws IOException {
        //封装数据源
        File file = new File("demos");

        //封装目的地
        File file1 = new File("f:\\");


        CopyFolders1(file, file1);


    }

    private static void CopyFolders1(File src, File dest) throws IOException {

        //是文件夹
        if (src.isDirectory()) {

            //我们要在目的地也创建一个文件夹
            File newFile = new File(dest, src.getName());
            newFile.mkdir();

            //获取src下的File[],遍历File[],获取每一个File对象
            File[] fileArray = src.listFiles();
            for (File file : fileArray) {
                CopyFolders1(file, newFile);
            }
        } else {
            //是文件
            File file = new File(dest, src.getName());
            copyFile2(src, file);

        }


    }

    //因为不是有各种各样的文件,所以我们用字节流
    private static void copyFile2(File src, File file) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));

        //每次读取一个字节数组
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //关闭资源
        bis.close();
        bos.close();
    }


}
