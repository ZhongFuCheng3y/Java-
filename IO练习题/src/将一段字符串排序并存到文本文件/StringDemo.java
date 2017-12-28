package 将一段字符串排序并存到文本文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by asd on 2016/9/9.
 */
/*
 * 已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”
 * 请编写程序读取数据内容，把数据排序后写入ss.txt中。
 */
/*
    分析:
        1:把字符串转换成字符数组
        2:字符数组排序
        3:字符数组转成字符串
                String ss = new String("chars");
        4:创建BufferedWriter对象写数据
 */
public class StringDemo {
    public static void main(String[] args) throws IOException {

        //把字符串转成字符数组
        String s = "hcexfgijkamdnoqrzstuvwybpl";
        char[] chars = s.toCharArray();

        //字符数组排序
        Arrays.sort(chars);

        //字符数组转换成字符串
        String ss = new String(chars);
        System.out.println(ss);

        //创建BufferedWriter对象
        BufferedWriter bw  = new BufferedWriter(new FileWriter("ttt.txt"));

        bw.write(ss);
        bw.newLine();
        bw.flush();

        //关闭资源
        bw.close();

    }
}
