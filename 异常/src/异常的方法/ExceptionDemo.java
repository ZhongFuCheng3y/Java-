package 异常的方法;

/**
 * Created by asd on 2016/9/6.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 在try里面发现问题后
 *              1: jvm会帮我们生成一个异常对象
 *              2: 把对象抛出,和catch里面的类进行匹配
 *              3: 匹配后,就会执行catch里面的处理信息
 *
 */
/*
    public String getMessage():异常的消息字符串
    //Unparseable date: "2015-11-20"
    -----------------------------------------

    //java.text.ParseException: Unparseable date: "2015-11-20"
    public String toString():返回异常的简单信息描述
    此对象的类的 name(全路径名)
 		": "（冒号和一个空格）
 		调用此对象 getLocalizedMessage()方法的结果 (默认返回的是getMessage()的内容)
 	/----------------------------------------------------------------------------

 	printStackTrace() 获取异常类名和异常信息，以及异常出现在程序中的位置。
 	返回值void。把信息输出在控制台。

 */
public class ExceptionDemo {
    public static void main(String[] args) {
        String s = "2015-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try{
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {

            //Unparseable date: "2015-11-20"
            //System.out.println(e.getMessage());

            //----------------------------------------

            //java.text.ParseException: Unparseable date: "2015-11-20"
            //System.out.println(e.toString());

            //------------------------------------------------------------

//            java.text.ParseException: Unparseable date: "2015-11-20"
//            at java.text.DateFormat.parse(DateFormat.java:366)
//            at 异常的方法.ExceptionDemo.main(ExceptionDemo.java:40)
//            at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
//            at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
//            at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
//            at java.lang.reflect.Method.invoke(Method.java:498)
//            at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
            e.printStackTrace();

        }

    }


}
