package 标准输入输出流;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by asd on 2016/9/11.
 */

/*
    转换流的应用--把标准输出流转换成字符缓冲流
    分析:
        1:BufferedWriter是一个字符缓冲流
        2:PrintStream ps = System.out是一个字节流---也就是标准输出流
        3:我们需要用到转换流 ----OutStreamWriter
        4:OutputStream os = ps;  ----多态,可以直接把ps传入转换流.
        5:代码
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 */
public class SystemOutDemo2 {

    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //写数据
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("world");
        bw.flush();

        //关闭资源
        bw.close();
    }
}
