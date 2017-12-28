package FileInputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*
    字节输入流操作步骤:
        1:创建字节输入流对象
        2:调用read()读取数据,并把数据输出在控制台上
        3:关闭资源
 */

import java.io.FileInputStream;
import java.io.IOException;

/**
 *  读取方式:
 *       1:int read():一次读取一个字节
 *       2:int read(Byte[] b):一次读取一个字节数组
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");

        //调用read()方法读取数据
        /**
         *  1:由于read()方法一次只读取一个字节,所以我们用while循环改进
         *  2:read()方法返回值是int类型,我们要转换成char类型--如果是中文,会无法识别,中文是两个字节来构成的,它一个一个拆开了.
         *  3:读取的数据如果是-1,那么说明已经读到文件的末尾了.
         */
        int by = 0;
        while((by = fis.read())!= -1) {
            System.out.println((char)by);
        }

        //关闭资源
        fis.close();
    }
}
