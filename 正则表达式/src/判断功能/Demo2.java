package 判断功能;

import java.util.Scanner;

/**
 * Created by asd on 2016/10/19.
 */
/*
    需求:
        校验邮箱
    步骤:
        1:键盘录入邮箱
        2:定义邮箱规则
            1517806580@qq.com
 			liuyi@163.com
  			linqingxia@126.com
  			fengqingyang@sina.com.cn
  			fqy@itcast.cn
  	    3:调用功能,判断
 	* 	4:输出结果
 	*
 */
public class Demo2 {
    public static void main(String[] args) {

        //键盘录入邮箱
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的邮箱:");
        String email = scanner.nextLine();

        //定义邮箱规则
        String regex = "\\w+@\\w{2,6}(\\.\\w{2,3})+";

        //调用功能
        boolean flag = email.matches(regex);

        System.out.println("flag:" + flag);

    }
}
