package StringBuffer练习;

import java.util.Scanner;

/**
 * Created by asd on 2016/9/19.
 */
/*
    需求:
        对字符串进行反转
    分析:
        1:我们可以使用String进行反转
            只要把String倒着遍历就可以了
        2:我们也可以用StringBuffer来完成功能
            调用reverse()
        3:显然StringBuffer更简单
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        //键盘录入数据1
        Scanner scanner = new Scanner(System.in);
        System.out.println("请你输入一个字符串:");
        String s = scanner.nextLine();

        String ss = fanzhuan(s);
        System.out.println(ss);
    }

    private static String fanzhuan(String s) {

        return new StringBuffer(s).reverse().toString();
    }

}
