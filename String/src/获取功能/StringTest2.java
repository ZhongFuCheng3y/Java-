package 获取功能;

/**
 * Created by asd on 2016/9/18.
 */
/*
    需求:
        统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数

    分析:
        1:定义三个变量,分别计算它们出现的次数
        2:遍历字符串,判断是什么元素
        3:变量++
 */

public class StringTest2 {
    public static void main(String[] args) {
        String s = "fsdafs22MMM";

        int number = 0;
        int zifu = 0;
        int daxie = 0;

        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            if (ss >= '0' && ss <= '9') {
                number++;
            } else if (ss >= 'a' && ss <= 'z') {
                zifu++;
            } else if (ss >= 'A' && ss <= 'Z') {
                daxie++;
            }else{
                System.out.println("你写的是什么");

            }

        }

        System.out.println("大写:"+daxie);
        System.out.println("小写:"+zifu);
        System.out.println("数字:"+number);

    }
}
