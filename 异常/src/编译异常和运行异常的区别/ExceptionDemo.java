package 编译异常和运行异常的区别;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 2016/9/5.
 */
/*
    编译时异常: java程序必须显式处理,否则程序就会发成错误,无法通过编译
    运行期异常: 无需显式处理,也可以和编译时异常一样处理
 */

/**
 * 解析日期
 *       1:创建一个日期字符串
 *       2:创建SimpleDateFormat对象,传入格式
 *       3:SimpleDateFormat对象.parse()
 */
public class ExceptionDemo {

    public static void main(String[] args) {

        //解析字符串
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try{
            Date d = sdf.parse(s);
            System.out.println(d);
        }catch(ParseException e) {
            System.out.println("解析日期出问题了");
        }

    }
}
