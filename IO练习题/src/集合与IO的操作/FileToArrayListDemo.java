package 集合与IO的操作;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        从文本文件中读取数据,写到集合中,并遍历集合.
    分析:
        1:数据源是一个文本文件--BufferedReader
        2:目的地是一个集合
        3:每拿到文本文件的一个数据,就写到集合中

 */
public class FileToArrayListDemo {


    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //封装目的地--集合
        ArrayList<String> list = new ArrayList<>();

        //取出文本文件的数据,写到集合中
        String line = null;
        while((line = br.readLine())!=null) {
            list.add(line);
        }

        //关闭资源
        br.close();

        //遍历集合
        for(String s : list) {
            System.out.println(s);
        }
    }
}
