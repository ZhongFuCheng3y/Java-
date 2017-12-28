package Buffer字符流缓冲区类;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.*;

/**
 * 字符缓冲流的特殊方法:
 *    BufferedWriterDemo:
 *          public void newLine():根据系统来决定换行符
 *    BufferedReader:
 *          public String readLine():一次读取一行数据
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
       writer();
       read();
    }

    private static void read() throws IOException {
        //创建字符缓冲流对象---输入--读数据
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        //读取数据,我们采用一行一行读取,这是BufferReader特有的方法
        String line = null;
        while((line = br.readLine())!= null) {
            System.out.println(line);
        }
    }

    private static void writer() throws IOException{
        //创建字符缓冲流对象---输出--写数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //写数据
        for(int i=0; i<10; i++) {
            bw.write("hello" + i);
            bw.newLine();
            bw.flush();
        }

        //关闭资源
        bw.close();

    }

}
