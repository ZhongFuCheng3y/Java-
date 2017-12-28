package 打印流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by asd on 2016/9/11.
 */
/*
    可以操作任意的类型:
        1:跟基本流的write()方法不一样,write()需要指定数据类型
        2:打印流提供了print()和println(),不需要指定数据类型

    自动刷新:
        1:在创建对象的时候,多了一个参数,true,就可以实现自动刷新了.
        2:它是要println(),printf(),format()的其中一个方法时才能完成自动刷新.-----print()不可以
        3:基本代码:
            PrintWriter pw = new PrintWriter(new FileWriter("o.txt",true));

     println()等价于:
        bw.write()
        bw.newLine()
        bw.flush()
 */
public class PrintWriterDemo2 {

    public static void main(String[] args) throws IOException {

        //创建打印流对象,能够实现自动刷新的.
        PrintWriter pw = new PrintWriter(new FileWriter("o.txt"));

        //下面演示能够操作任意的类型
        pw.println("hello");
        pw.println('a');
        pw.println(100);

        //关闭资源
        pw.close();
    }


}
