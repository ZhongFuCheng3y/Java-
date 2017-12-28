package 自定义异常;

import java.util.Scanner;

/**
 * Created by asd on 2016/9/6.
 */
/*
    这是一个测试类
 */
public class StudentDemo {
    public static void main(String[] args) {

        //键盘录入成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生的成绩:");

        int score = sc.nextInt();

        Teacher t = new Teacher();

        try {
            t.check(score);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
