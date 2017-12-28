package 字符流复制操作;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedCopyFile {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("zzz.txt"));

        //将数据源读到的数据写入目的地
        /**
         * 使用数组的方式
         */
        char[] chars = new char[1024];
        int len = 0;
        while((len = br.read(chars)) !=-1) {
            bw.write(chars,0,len);
            bw.flush();
        }
        //关闭资源
        bw.close();
        br.close();
    }
}
