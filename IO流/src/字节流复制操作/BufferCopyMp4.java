package 字节流复制操作;

import java.io.*;

/**
 * Created by asd on 2016/9/7.
 */
/*
    利用高效字节流把F:\电影\【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi  复制到当前目录下

    步骤:
        1:封装数据源
        2:封装目的地
        3:读取数据源的内容写到目的地上--使用数组和一个一次的方式
        4:关闭资源
 */
public class BufferCopyMp4 {
    public static void main(String[] args) throws IOException {
        //method1("F:\\电影\\【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi", "a.avi");
        method2("F:\\电影\\【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi", "a.avi");
    }

    private static void method2(String src, String dest) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //将数据源读到的内容写入目的地--使用数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }

        //关闭资源
        bis.close();
        bos.close();
    }

    private static void method1(String src, String dest) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //封装目的地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //读取数据源的内容,写到目的地上,使用一个一次的方式
        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        //关闭资源
        bis.close();
        bos.close();

    }


}
