package FileOutputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*
    步骤:
        1:创建字节输出流对象
        2:调用write()方法
        3:关闭资源

 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * write()方法:
 * 1:public void write(int b):写一个字节
 * 2:public void write(byte[] b):写一个字节数组
 * 3:public void write(byte[] b, int off, int len):写一个字节数组的一部分
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //调用write()方法
        fos.write(97);//---底层是二进制数据,通过记事本打开,找到97对应的值是a

        //public void write(byte[] b):写一个字节数组
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes);

        //public void write(byte[] b,int off, int len):写一个数组的一部分
        fos.write(bytes, 0, 2);

        //释放资源
        fos.close();

    }
}
