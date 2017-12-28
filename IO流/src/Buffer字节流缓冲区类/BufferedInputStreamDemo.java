package Buffer字节流缓冲区类;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    读取a.txt的数据
    步骤:
        1:封装数据源
        2:将读取的数据显式在控制台上
        3:关闭资源
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));

        //读取数据,用数组的方式
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //释放资源
        bis.close();
    }
}
