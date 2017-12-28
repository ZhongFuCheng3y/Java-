package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * 这是一个猜字的小游戏
 */
/*
    步骤:
        1:产生一个随机数字
        2:定义一个统计变量
        3:键盘录入数据,直到你猜中数字
 */
public class NumberGame {
    private NumberGame() {

    }

    public static void start() {
        //产生一个 0 ~ 100 随机数字
        Random random = new Random();
        int number = random.nextInt(100);

        //定义一个统计变量
        int count = 0;

        //键盘录入数据,直到猜中数字
        System.out.println("你要输入0-100的数字:");
        while (true) {
            //键盘录入数字,并获取该数字

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            if (i > number) {
                System.out.println("你猜的数字" + i + "大了");
                count++;
            } else if (i < number) {
                System.out.println("你猜的数字" + i + "小了");
                ++count;
            } else {
                System.out.println("你猜对了!!" + "你猜了" + ++count + "次数");
                break;
            }
        }

    }
}
