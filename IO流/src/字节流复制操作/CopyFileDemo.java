package 字节流复制操作;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    把fos.txt复制到d盘下
    分析:
        1:数据源---fos.txt--读取数据---FileInputStream
        2:目的地---d:\fos.txt--写出数据--FileOutputStream
    为什么我们这次复制中文没有问题呢?
        1:我们上一次读取一个字节数据,就转化成字符数据,然后输出在控制台上
        2:这一次我读取一个数据,就写一个数据,没有做任何转换
        3:它会自己自动做转换
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream fis = new FileInputStream("fos.txt");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("d:\\fos.txt");

        //复制数据
        int by = 0;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }

        //释放资源
        fos.close();
        fis.close();
    }

}
