package 复制单级文件夹;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        我们要负责一个单级文件夹到别的盘符上
    分析:
        1:封装源目录
        2:封装目的地
        3:拿到源目录下的File数组
        4:遍历File数组,获得每个File对象
        5:拿到File对象对应文件的名字
        6:新创建一个File对象,路径是盘符+拿到的名字
        7:复制操作--前file作为数据源,后file作为目的地,

 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //封装源目录
        File file = new File("D:\\IO练习题\\demo");

        //封装目的地
        File file1 = new File("f:\\text");
        //如果文件夹不存在,就创建一个
        if(!file1.exists()){
            file1.mkdir();
        }

        //拿到源目录下的File数组
        File[] files = file.listFiles();

        //遍历File数组,获取每个File对象
        for (File file2 : files) {
            String name = file2.getName();
            File file3 = new File(file1, name);
            copyFile(file2, file3);
        }
    }

    private static void copyFile(File src, File dest) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //每次读写一个字节数据
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        //关闭资源
        bis.close();
        bos.close();
    }
}
