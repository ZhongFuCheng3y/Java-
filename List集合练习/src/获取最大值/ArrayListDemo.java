package 获取最大值;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
    分析:
        1:键盘录入数据
        2:将数据添加到集合中
        3:判断数据是否为0
        4:将集合转变成数组
            a:首先要有一个数组容器
            b:toArray()
        5:将数组排序
        6:取出数组最后一个元素
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建一个集合对象
        ArrayList<Integer> integers = new ArrayList<>();

        //键盘录入数据
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入数据:");
            int i = scanner.nextInt();

            //添加数据到集合中
            integers.add(i);

            //判断输入的元素是否为0
            if (i == 0) {
                break;
            }

        }

        //将集合转换成数组
            //a:数组容器
        Integer[] integers1 = new Integer[integers.size()];

            //b:toArray()
        integers.toArray(integers1);

        //对数组进行排序
        Arrays.sort(integers1);

        //取出数组最后一个元素
        System.out.println("您输入最大的值是:"+ integers1[integers1.length-1]);




    }
}
