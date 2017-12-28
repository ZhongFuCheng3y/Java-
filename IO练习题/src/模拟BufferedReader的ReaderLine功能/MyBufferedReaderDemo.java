package 模拟BufferedReader的ReaderLine功能;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asd on 2016/9/10.
 */
/*
    需求:
        用Reader模拟BufferedReader的readLine()功能
        readLine():一次读取一行,根据换行符判断是否结束
    思路:
        1:测试MyBufferedReader的时候，把它当作BufferedReader一样的使用
 */
public class MyBufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        MyBufferedReader mbr = new MyBufferedReader(new FileReader("o.txt"));

        String line = null;
        while((line = mbr.readLine())!=null) {
            System.out.println(line);
        }

        mbr.close();
    }


}
