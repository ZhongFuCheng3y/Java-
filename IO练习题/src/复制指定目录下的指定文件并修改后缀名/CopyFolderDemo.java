package 复制指定目录下的指定文件并修改后缀名;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        1:指定的文件是：.java文件。
        2:指定的后缀名是：.jad
        3:指定的目录是：jad
    分析:
        1:封装源目录
        2:封装目的地
        3:获取源目录下的File[]
        4:遍历File[]得到每一个File对象
        5:判断对象的名称是否带有.java
             是:
                1:复制文件到目的地,目的地的路径要新创建一个File对象
                2:复制完,我们就可以改名了(因为新的.
             不是:
                不理


 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //封装源目录
        File file = new File("java");


        //封装目的地
        File file1 = new File("d:\\这是我复制出来的");

        //如果目录不存在,我就创建一个
        if (!file1.exists()) {
            file1.mkdir();
        }

        //获取源目录下的File[]
        File[] files = file.listFiles();

        //遍历File[]得到每一个File对象
        for (File file2 : files) {
            String name = file2.getName();
            if (name.endsWith(".java")) {
                //复制文件
                File file3 = new File(file1, name);
                copyFile(file2, file3);

                //我们要拼接名字,从而创建File对象,然后改名
                /**
                 * 这里我们也是在目的地目录下改名,
                 * file3是目的地 目录
                 * file4是目的地 目录
                 */
                String newName = name + ".jad";
                File file4 = new File(file1,newName);
                file3.renameTo(file4);

            }
        }
    }



    private static void copyFile(File file2, File file3) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));

        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file3));

        //每次读写一个字节数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //关闭资源
        bos.close();
        bis.close();
    }
}
