package 字节流复制操作;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    复制F:\电影【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi到E盘

    步骤:
        1:封装数据源
        2:封装目的地
        3:读取数据源的数据写到目的地--使用数组的方式读写
        4:关闭资源

 */
public class CopyMp4 {
    public static void main(String[] args) throws IOException {

        //封装数据源
        FileInputStream fis = new FileInputStream("F:\\电影\\【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("E:\\【电影家园dy1234.net下载】阳光灿烂的日子.CD1.avi");

        //读取数据源的数据写到目的地--采用数组的方式
        byte[] bytes = new byte[1024];
        int len = 0;

        while((len = fis.read(bytes))!=-1) {
            fos.write(bytes,0,len);
        }

        //关闭资源
        fis.close();
        fos.close();

    }
}
