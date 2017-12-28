package 集合与IO的操作;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asd on 2016/9/8.
 */
/*
    需求:
        我有一个文本文件存储了一些名字,现在我们随机拿到某个人的名字
    分析:
        1:封装数据源--文本文件--BufferReader
        2:元素是String,我们用一个容器来装,ArrayList
        3:封装目的地--ArrayList
        4:读取文件的数据,写到ArrayList中
        5:随机产生一个索引,根据索引拿到名称
        6:随机产生数字的范围就是ArrayList的size
 */
public class GetName {
    public static void main(String[] args) throws IOException {
        //封装数据源
        BufferedReader br = new BufferedReader(new FileReader("PersonName.txt"));

        //封装目的地
        ArrayList<String> list = new ArrayList<>();

        //读取文件的数据,加入到集合中
        String line = null;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        //关闭资源
        br.close();

        //随机产生一个索引
        Random random = new Random();
        int index = random.nextInt(list.size());

        //根据索引拿到名称
        String s = list.get(index);
        System.out.println("你就是那个倒霉的人:" + s);




    }
}
