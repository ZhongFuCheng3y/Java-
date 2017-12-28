package 字节流读写文件有4种方式;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    字节流复制文件有4种方式:
        1:基本字节流--每次读写一个字节数据
        2:基本字节流--每次读写一个字节数组
        3:缓冲字节流--每次读写一个字节数据
        4:缓冲字节流--每次读写一个字节数组
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        String src = "a.txt";
        String dest = "qqqqq.txt";
       // method(src,dest);
        //method1(src,dest);
       // method2(src,dest);
          method3(src,dest);
    }

    private static void method3(String src, String dest) throws IOException {
        //封装数据源
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dest));

        //Buffered每次读写一个字节数组
        byte[] bytes = new byte[1024];
        int len =0;
        while((len = br.read(bytes))!=-1) {
            bw.write(bytes,0,len);
        }

        //关闭资源
        bw.close();
        br.close();
    }

    private static void method2(String src, String dest) throws IOException {
        //封装数据源
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dest));

        //Buffered每次读写一个字节
        int ch = 0;
        while((ch = br.read()) != -1){
            bw.write(ch);
        }

        //关闭资源
        br.close();
        bw.close();
    }

    private static void method1(String src, String dest) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream(src);

        //封装目的地
        FileOutputStream fos = new FileOutputStream(dest);

        //每次读写一个字节数据
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //关闭资源
        fis.close();
        fos.close();
    }

    private static void method(String src, String dest) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream(src);

        //封装目的地
        FileOutputStream fos = new FileOutputStream(dest);

        //每次读写一个字节
        int ch = 0;
        while((ch = fis.read())!= -1) {
            fos.write(ch);
        }

        //关闭资源
        fos.close();
        fis.close();
    }
}
