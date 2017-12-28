package 随机访问流;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by asd on 2016/9/11.
 */

/*
    随机访问流:
        1:不属于流,是Object类的子类
        2:融合了InputStream和OutputStream的功能
        3:支持对文件的随机访问的读取和写入

    public RandomAccessFile(String name, String mode)
        第一个参数是文件路径,第二个参数是操作文件的模式

    模式有4种,最常用是"rw", 这种方式可以写数据和读数据

    文件指针是以字节为单位的
        例如:100,指针的位置就是4
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {

        write();
        read();
    }

    private static void read() throws IOException {

        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf1.txt", "rw");

        //读取数据
        int i  = raf.readInt();
        System.out.println(i);
        System.out.println(raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println(raf.getFilePointer());



    }

    private static void write() throws IOException {

        //创建随机访问流对象
        RandomAccessFile raf = new RandomAccessFile("raf1.txt", "rw");

        raf.writeInt(100);
        raf.writeChar('a');


    }


}
