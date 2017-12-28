package 字节流复制操作;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    E:\java刘意\day24\code\等待唤醒机制思路图解.bmp复制到f盘
    步骤:
        1:封装数据源
        2:封装目的地
        3:读取数据源的数据写到目的地----使用数组的方式
        4:关闭资源
 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("E:\\java刘意\\day24\\code\\等待唤醒机制思路图解.bmp");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("f:\\aa.bmp");

        //读取数据源的数据写到目的地--使用数组

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        //关闭资源
        fis.close();
        fos.close();

    }
}
