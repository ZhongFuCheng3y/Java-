package 字符流复制操作;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedCopyFile2 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("qqq.txt"));

        //运用BufferedWriter和BufferedReader特有的方法
        String line = null;
        while((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();

        }
        //关闭资源
        bw.close();
        br.close();

    }
}
