package Buffer字节流缓冲区类;

/**
 * Created by asd on 2016/9/7.
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStreamDemo
 *      BufferedOutputStreamDemo(OutputStream)
 * BufferedInputStream
 *      BufferedInputStream(InputStream)
 */
/*
    原因:
        定义数组的方式读写数据已经满足不了我们了
    解决:
        为了提高性能,java提供了带缓冲区的字节类

    要点:
        1:构造方法可以指定缓冲区大小,但我们一般不用,因为默认的缓冲区大小已经足够了
        2:为什么构造方法不传入一个具体的文件或文件路径,而是传入一个OutputStream对象呢?
            因为字节缓冲区流仅仅提供缓冲区,为高效而设计的,但是,真正的读写操作还是依靠基本的流对象.
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个BufferedOutputStream对象---高效字节流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("a.txt"));

        //写数据
        bufferedOutputStream.write("hello".getBytes());

        //关闭资源
        bufferedOutputStream.close();
    }
}
