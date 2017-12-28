package 集合与IO的操作;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        把ArrayList集合中的字符串存储到文本文件中
    分析:

        1:文本文件---字符流
        2:遍历集合,取到每一个元素,把元素写到文件中

 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //封装ArrayList中的数据
        //ArrayList集合中的元素就是数据源
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("o.txt"));

        //遍历集合,取到每个元素,把元素写到文件中
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //关闭资源
        bw.close();


    }
}
