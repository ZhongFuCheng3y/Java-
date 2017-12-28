package 字符流的方法;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * public void write(int c):写一个字符
 * public void write(char[] char):写一个字符数组
 * public void write(char[] char,int off, int len):写一个字符数组的一部分
 * public void write(String):写一个字符串
 * public void write(String str, int off, int len):写一个字符串的一部分
 */
/*
    close()和flush()的区别:
        1:close()关闭流对象,但是先刷新一次缓冲区,关闭之后,流对象就不可以使用了.
        2:flush()仅仅刷新缓冲区,刷新之后,流对象还是可以使用的.
 */
/*
    writer()数据时,如果我们不刷新一下,数据写不进去
        1: 文件中数据存储的基本单位是字节
        2: 1个字符 = 2个字节
        3: 我们可以想象,一个字节是可以进去的,但是写入字符时,它就卡住了.需要我们flush()一下
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fox.txt"));

        //写一个字符
        //osw.write(97);

        //写一个字符数组
        char[] chars = {97, 98, 99};
        osw.write(chars);

        //写一个字符数组的一部分
        // osw.write(chars,0,2);

        //写一个字符串
        // osw.write("Nice好");

        //写一个字符串的一部分
        //osw.write("String",0,2);

        //关闭资源
        osw.close();

    }

}
