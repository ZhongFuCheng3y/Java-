package 打印流;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *  打印流:
 *      字节打印流: PrintStream
 *      字符打印流: PrintWriter
 *  特点:
 *      1:只有写数据的,没有读取数据的,只能操作目的地,不能操作数据源
 *      2:可以操作任意类型的数据
 *      3:如果启动了自动刷新,就能够自动刷新
 *      4:该流是可以直接操作文本文件的.
 */
/*
    哪些流对象是可以直接操作文本文件的呢?
        1:FileInputStream
        2:FileOutputStream
        3:FileReader
        4:FileWriter
        5:PrintStream
        6:PrintWriter
        7:看API,查流对象的构造方法,如果同时有File类型和String类型的,一般来说就是可以直接操作文件的.
 */

/*
    流:
        基本流:
            就是能够直接读写文件的.
        高级流:
            在基本流基础提供了一些其他的功能
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {
        //PrintWriter是作为Writer的子类来使用的.
        PrintWriter pw = new PrintWriter("o.txt");

        pw.write("hello");
        pw.write("world");
        pw.write("java");

        //关闭资源
        pw.close();
    }
}
