package Date_DateFormat.Date_DateFormat��ϰ;

/**
 * Created by asd on 2016/9/20.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ���������Ҫʵ�ִ�����ʱ��,����Ҫ��ʽ�����ַ���
 * �������ַ���,����Ҫ������ʱ��
 */
public class DateUtil {
    public static String DateToString(Date d, String regex) {
        return new SimpleDateFormat(regex).format(d);
    }

    public static Date StringToDate(String s, String regex) throws ParseException {
        return new SimpleDateFormat(regex).parse(s);
    }
}
