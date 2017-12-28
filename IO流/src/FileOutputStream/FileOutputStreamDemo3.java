package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    如何实现数据换行:
        1:不同系统针对不同的换行符号是不同的
            1:windows:\r\n
            2:linux:\n
            3:mac:\r
        2:常见的高级笔记本是可以识别任意的换行符号的,但是windows自带的不行,只识别\r\n

    如何实现数据的追加写入:
        1:用构造方法带第二个参数是true的情况即可

 */
public class FileOutputStreamDemo3 {

    public static void main(String[] args) throws IOException {

        //创建字节输出流对象
        //带第二个参数true,说明就可以向文件追加内容
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        //写数据
        for(int i=0; i<10; i++) {
            fos.write(("hello" + i).getBytes());
            fos.write("\r\n".getBytes());
        }

        //关闭资源
        fos.close();
    }
}
