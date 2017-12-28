package Buffer字符流缓冲区类;

/**
 * Created by asd on 2016/9/8.
 */
/*
    字符流为了高效读写,也提供了对应的字符缓冲区流
    1:BufferedWriter
    2:BufferedReader
 */
/*
    BufferedWriter:字符缓冲输出流
    1:将文本文件写入字符输出流,缓冲各个字符,从而提高单个字符,数组,字符串的高效读写
    2:缓冲区大小一般我们使用默认的就足够了
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter(Writer out)
 * 创建对象:
 *      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
 *      new FileOutputStream("a.txt")
 * 我们知道,FileWriter是OutputStreamWriter + 编码表
 * 所以:
 *      BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt")
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        //创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //写数据
        bw.write("hello");
        bw.write("world");
        bw.write("java");
        bw.write("ni hao a ");
        bw.flush();

        //关闭资源
        bw.close();

    }
}
