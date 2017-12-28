package 字节流转换成字符流;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换成字符流
 * OutptuStreamWriter(OutputStream out, String charsetName):根据指定编码把字节数据转化成字符流
 */
/*
    要点:
       1:字符流 = 字节流 + 编码表
       2:你用什么编码写,就应该用什么编码读
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象

        // 这里只传入了一个参数,所以是使用默认的编码表,也就是GBK
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fox.txt"));

        //使用UTF-8试试
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("fox.txt"),"UTF-8");

        //写数据
        osw1.write("中国");

        //关闭资源
        osw1.close();
    }

}
