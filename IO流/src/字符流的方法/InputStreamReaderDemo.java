package 字符流的方法;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader读取方法:
 * int read():一次读取一个字符
 * int read(char[] chars):一次读取一个字符数组
 */

public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //创建对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"));

        //一次读取一个字符
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }

        //一次读取一个字符数组
        //char[] chars = new char[1024];
        //int len = 0;
        //while((len = isr.read(chars)) != -1) {
        //    System.out.println(new String(chars,0,len));
        //}

        //释放资源
        isr.close();



    }
}
