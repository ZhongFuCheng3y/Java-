package Date_DateFormat.计算你来到这个世界有多少天;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/20.
 */
/*
    分析:
        1:键盘录入你的出生日期
        2:将字符串转换成日期
        3:通过日期获得毫秒值
        4:用当前的毫秒值-你出生的毫秒值
        5:换算成天数
 */
public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的出生日期");
        String s = scanner.nextLine();

        //将字符串转换成日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = sdf.parse(s);

        //获取日期的毫秒值
        long myTime = dd.getTime();

        long nowTime = System.currentTimeMillis();

        long time = nowTime - myTime;

        long day = time / 1000 / 60 / 60 / 24;
        System.out.println(day);

    }
}
