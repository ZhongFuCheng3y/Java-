package 字符流复制操作;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        把当前目录下fox.txt复制到当前目录下aaa.txt
    分析:
        1:封装数据源
        2:封装目的地
        3:读取数据源的数据写入目的地
        4:关闭资源
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"));

        //封装目的地
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa.txt"));

        //读取数据源的数据写到目的地
        char[] chars = new char[1024];
        int len = 0;
        while((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
            osw.flush();
        }

        //关闭资源
        osw.close();
        isr.close();
    }
}
