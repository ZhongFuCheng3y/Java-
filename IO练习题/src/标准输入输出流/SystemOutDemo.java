package 标准输入输出流;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.PrintStream;

/**
 *  标准输入输出流
 *      System类中的两个成员变量:
 *        1:  public static final InputStream in "标准输入流"
 *        2:  public static final PrintStream out "标准输出流"
 *
 *  InputStream is = System.in;
 *  PrintStream ps = System.out;
 */
/*
    我们知道了,输出语句实际上就是IO流操作,把数据输出在控制台上.
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        System.out.println("helloWorld");

        //获取标准输出流对象
        PrintStream ps = System.out;
        ps.println("helloWorld");


    }

}
