package 判断功能;

/**
 * Created by asd on 2016/10/19.
 */

import java.util.Scanner;

/**
 * String类的public boolean matches(String regex)
 * <p>
 * 需求:
 * 判断手机号码是否满足要求?
 */
/*

     :定义手机号码的规则
     * 			13436975980
     * 			13688886868
     * 			13866668888
     * 			13456789012
     * 			13123456789
     * 			18912345678
     * 			18886867878
     * 			18638833883
    步骤:
        1:键盘录入手机号码
        2:定义手机规则
        3:调用功能判断
        4:输出结果
 */
public class Demo {

    public static void main(String[] args) {
        //键盘录入手机号码
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的手机号码:");
        String phone = scanner.nextLine();

        //定义手机规则
        String regex = "1[38]\\d{9}";

        //调用功能,判断
        boolean flag = phone.matches(regex);

        //输出结果
        System.out.println("flag:" + flag);
    }
}
