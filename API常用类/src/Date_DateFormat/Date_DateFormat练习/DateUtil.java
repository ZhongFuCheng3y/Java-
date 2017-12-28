package Date_DateFormat.Date_DateFormat练习;

/**
 * Created by asd on 2016/9/20.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 这个类我们要实现传过来时间,我们要格式化成字符串
 * 传过来字符串,我们要解析成时间
 */
public class DateUtil {
    public static String DateToString(Date d, String regex) {
        return new SimpleDateFormat(regex).format(d);
    }

    public static Date StringToDate(String s, String regex) throws ParseException {
        return new SimpleDateFormat(regex).parse(s);
    }
}
