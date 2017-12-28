package Buffer字符流缓冲区类;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        //创建字符缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        //读取数据--使用数组的方式
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        br.close();


    }
}
