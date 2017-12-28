package Date_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 2016/9/19.
 */
/*
    Date:
        表示特定的瞬间,精确到毫秒

    构造方法:
        1:Date():根据当前默认猫喵纸创建日期对象
        2:Date(long date):根据指定的毫秒值创建日期对象

    方法:
        public long getTime():获取时间,以毫秒为单位  --从Date得到一个毫秒值
        public void setTime(long time):设置时间----把一个毫秒值转换为Date

    转换:
        Date --- String(格式化)
            public final String format(Date date)

        String --- Date(解析)
            public Date parse(String source)

        DateFormat:
            可以进行日期和字符串的格式化和解析,但由于是抽象类,所以只能用具体实现类SimpleDateFormat

    SimpleDateFormat构造方法:
        SimpleDateFormat():默认模式
        SimpleDateFormat(String Pattern):给定的模式
        年  y
        月  M
        日  d
        时  H
        分  m
        秒  s


 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        //创建格式化对象,给定模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        //调用方法,得到一个字符串
        String s = sdf.format(d);
        System.out.println(s);

        //----------------------------------------------------------------------

        //把一个字符串解析成Date对象
        String str = "2008-08-08 12:12:12";

        //创建解析字符串对象并给定模式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);

    }
}
