package 分割功能;

import java.util.Scanner;

/**
 * Created by asd on 2016/10/19.
 */
/*
    分割功能:
        String类的public String[] split(String regex)
        根据给定正则表达式的匹配拆分字符串

    举例:
        百合网，世纪佳缘,珍爱网,QQ
  		搜索好友
  			性别：女
  			范围："18-24"

  		age>=18 && age<=24
 */
/*
    步骤:
        1:定义一个年龄搜索范围
        2:定义规则
        3:调用方法,拆分字符串
        4:获取拆分后字符串的数组
        5:判断值是否在返回内
 */
public class Demo1 {
    public static void main(String[] args) {

        //定义年龄范围
        String ages = "18-24";

        //定义规则
        String regex = "-";

        //调用方法,拆分字符串
        String[] strings = ages.split(regex);

        //获取拆分后的字符串的数组
        int start = Integer.parseInt(strings[0]);
        int end = Integer.parseInt(strings[1]);

        //键盘录入年龄
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的年龄:");
        int age = scanner.nextInt();

        //判断值是否在返回内

        if (age >= start && age <= end) {
            System.out.println("你就是我要找的人");
        } else {
            System.out.println("你的年龄不对啊");
        }


    }
}
