package Character;

/**
 * Created by asd on 2016/9/19.
 */
/*
    Character类在对象包装了一个基本类型,char值
    此类提供了几种方法,确定字符的类别(小写子母,大写字母,等等)并将字符从大写转换成小写

 */

import java.util.Scanner;

/**
 * 构造方法:
 * Character(char value)
 * <p>
 * 判断方法:
 * public static boolean isUpperCase(char ch)
 * public static boolean isLowerCase(char ch)
 * public static boolean isDigit(char ch)
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 * <p>
 * 转换:
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 */
/*
    需求:
         统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
    分析:
        1:键盘录入一个字符串
        2:定义三个统计变量
        3:将字符串转换成字符数组
        4:遍历字符数组,判断字符是大小写还是数字
        5:输出统计变量

 */
public class CharacterDemo {

    public static void main(String[] args) {
        //键盘录入字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String s = scanner.nextLine();

        //定义三个统计变量
        int number = 0;
        int low = 0;
        int upper = 0;


        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                number++;
            } else if (Character.isUpperCase(chars[i])) {
                upper++;
            } else if (Character.isLowerCase(chars[i])) {
                low++;
            }
        }

        //输出三个统计变量
        System.out.println("数字:"+number);
        System.out.println("大写:"+upper);
        System.out.println("小写:" + low);
    }
}
