package 抛出异常;

/**
 * Created by asd on 2016/9/6.
 */
/*
    有时候,我们是没有权限去处理某一个异常的.
    为了解决出错问题,java针对这种情况,就提供了另一种处理方案:抛出
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 格式:
 * throws 异常类名
 * 这个格式必须跟在方法的括号后面
 */
/*
    编译器异常抛出,将来调用者必须处理
    运行期异常抛出,将来调用者可以不处理
 */

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        method2();
    }

    //在方法声明上抛出，是为了告诉调用者，你注意了，我有问题。
    //要么是抛出,要么是try...catch
    private static void method() throws ParseException {
        String s = "2015-12-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
        Date d = sdf.parse(s);
        System.out.println(d);
    }

    //运行时起的异常,可以不管它
    private static void method2() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }
}
