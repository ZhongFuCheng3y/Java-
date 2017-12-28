package FileOutputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*

     需求:
        我们要往文本文件输入一句话
     分析:
        1:输入文本文件一句话,我们应该采用的是字符流,但是只输入1句,我们决定采用字节流
        2:往文本文件输入,我们可以想到File
        3:最后我们在API发现:FileOutputStream
 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  构造方法:
 *          FileOutputStream(File file)
 *          FileOutputStream(String name)
 */
/*
    字节输出流操作步骤:
        1:创建字节输出流对象
        2:写数据
        3:释放资源
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /**
         * 创建字节输出流对象做了几件事
         *      1:调用系统功能去创建文件
         *      2:创建fos对象
         *      3:把fos对象指向这个文件
         */

        //写数据
        fos.write("hello,IO".getBytes());
        fos.write("java".getBytes());

        //关闭资源
        fos.close();
    }
}
