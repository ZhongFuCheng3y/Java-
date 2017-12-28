package

import Date_DateFormat.Date_DateFormat练习.DateUtil;��ϰ;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by asd on 2016/9/20.
 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtil.DateToString(d, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);

        String ss = "2020-10-22";
        Date dd = DateUtil.StringToDate(ss, "yyyy-MM-ss");
        System.out.println(dd);
    }
}
