package 合并流;

/**
 * Created by asd on 2016/9/11.
 */
/*
    以前
        1:一个文件复制到另一个文件
    现在
        2:两个文件合起来,复制到另外一个文件
 */

/*
    需求:
        把a.txt和o.txt的内容复制到Copy.java中
 */

import java.io.*;

/**
 *  SequenceInputStream(InputStream s1 , InputStream s2)
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("a.txt");

        InputStream inputStream1 = new FileInputStream("o.txt");

        //创建合并流对象
        SequenceInputStream sis = new SequenceInputStream(inputStream1, inputStream);

        //创建缓冲字节流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));

        //读写的操作跟以前是一样的.
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = sis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);

        }

        //关闭资源
        bos.close();
        sis.close();

    }
}
