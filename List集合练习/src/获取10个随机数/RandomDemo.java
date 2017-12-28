package 获取10个随机数;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        获取10个0~20的随机数
    分析:
        1:创建Random对象
        2:创建一个集合对象
        3:定义一个统计变量
        4:判断统计变量是否小于10
        5:产生随机数
            判断集合是否有这个元素
                  有:不搭理
                  没有:添加

        6:遍历集合

 */
public class RandomDemo {

    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();

        //创建一个集合对象
        ArrayList<Integer> integers = new ArrayList<>();

        //定义一个统计变量
        int count = 0;
        while (count < 10) {
            int number = random.nextInt(20);
            if (!integers.contains(number)) {
                integers.add(number);
                count++;
            }
        }

        //遍历集合
        for (Integer integer : integers) {
            System.out.println(integer);

        }
    }
}
