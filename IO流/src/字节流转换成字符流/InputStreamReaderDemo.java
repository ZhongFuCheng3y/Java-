package 字节流转换成字符流;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader(InputStream is):用默认的编码表读取数据
 * InputStreamReader(InputStream is, String charsetName):用指定的编码读取数据
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //创建对象
        //InputStreamReaderDemo isr = new InputStreamReaderDemo(new FileInputStream("fox.txt"));

        //使用UTF-8试试
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"),"UTF-8");

        //读取数据
        /**
         * 一次读取一个字节
         */
        int by = 0;
        while ((by = isr.read()) != -1) {
            System.out.println((char)by);
        }

        //释放资源
        isr.close();
    }
}
