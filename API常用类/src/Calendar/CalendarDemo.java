package Calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/20.
 */
/*
    Calendar:
        它为特定瞬间与一组诸如YEAR、MONTH、DAY_OF_MONTH、HOUR等日历字段之间的转换提供了一些方法
        并为操作日历字段(获取下星期的日期)提供了一些方法

    public int get(int field):返回给指定日历字段的值,日历类中的每个日期字段都是静态的成员变量,而且是int类型
    public void add(int field, int amount):根据给定的日历字段和对应的时间,来对当前的日历进行操作
    public final void set(int year, int month, int date):设置当前时间的年月日

 */
/*
    需求:
        获取任意一年的二月有多少天
    分析:
        1:键盘录入任意的年份
        2:设置日历对象的年月日
            年:输入的那一年
            月:2月------从0开始,其实就是三月
            日:1日
        3:把时间往前推一天,就是2月的最后一天
        4:输出即可
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //获取Calendar对象
        Calendar calendar = Calendar.getInstance();

        System.out.println("随便输入一年:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        calendar.set(year, 2, 1);

        //对日期字符进行操作
        calendar.add(Calendar.DATE, -1);

        System.out.println(calendar.get(Calendar.DATE));

    }
}
