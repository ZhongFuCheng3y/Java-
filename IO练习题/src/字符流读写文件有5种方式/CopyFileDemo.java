package 字符流读写文件有5种方式;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.*;

/**
 * 只要是windows自带笔记本能读得懂的文件,我们都能用字符流来操作
 */
/*
    我们总结一下有多少种方式读写字符文件
        1:缓冲流读写一行数据
        2:缓冲流读写一个字符数组数据
        3:缓冲流读写一个字符数据
        4:基本流读写一个字符数组数据
        5:基本流读写一个字符数据
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String src = "a.txt";
        String dest = "b.txt";
        //method1(scr,dest);
        //method2(src,dest);
        method3(src,dest);
        //method4(src,dest);
        //method5(src,dest);

    }

    private static void method5(String src, String dest) throws IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));

        //封装目的地
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(dest));

        //一次读写一个字符数组
        char[] chars = new char[1024];
        int len = 0;
        while((len=isr.read(chars))!= -1){
            isw.write(chars,0,len);
            isw.flush();
        }

        //关闭资源
        isw.close();
        isr.close();
    }

    private static void method4(String src, String dest) throws IOException {
        //封装数据源
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));

        //封装目的地
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(dest));

        //基本流一次读写一个字符
        int ch = 0;
        while((ch = isr.read())!=-1) {
            isw.write(ch);
            isw.flush();
        }
        //关闭资源
        isw.close();
        isr.close();
    }

    private static void method3(String src, String dest) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader(src));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //一次读取一个字符
        int ch = 0;
        while((ch = br.read()) !=-1) {
            bw.write(ch);
            bw.flush();
        }

        //关闭资源
        bw.close();
        br.close();
    }

    private static void method2(String src, String dest) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader(src));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //每次读写一个字符数组数据
        char[] chars = new char[1024];
        int len = 0;
        while((len = br.read(chars))!=-1){
            bw.write(chars,0,len);
            bw.flush();
        }
        //关闭资源
        bw.close();
        br.close();

    }

    private static void method1(String src, String dest) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader(src));

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //每次读写一行数据
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
