package StringBuffer练习;

import java.util.Scanner;

/**
 * Created by asd on 2016/9/19.
 */
/*
    需求:
        判断一个字符串是否是对称字符串
        例如"abc"不是对称字符串，"aba"、"abba"、"aaa"、"mnanm"是对称字符串
    分析:
        1:我们可以遍历String,用最后一个字符和最前面的一个字符比较
        2:我们也可以使用StringBuffer的反转功能,只要反转后和字符是相同的,那么就是对称字符串
 */
public class StringBuffer3 {
    public static void main(String[] args) {
        //键盘录入数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入数据:");
        String s = scanner.nextLine();

        Boolean b = isSame(s);
        System.out.println(b);
    }

    private static boolean isSame(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }

}
