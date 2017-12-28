package 自定义异常;

/**
 * Created by asd on 2016/9/6.
 */
/*
    java不可能对所有的情况都考虑到,所以我们需要自定义异常类

    两种方式:
        1:继承Exception
        2:继承RuntimeException

    要点:
        定义带一个参数的构造函数,实际上就是用来描述该异常类的信息的.
    步骤:
        1:继承Exception或者RuntimeException
        2:在类中定义一个带参数的构造函数,实际上就是用来描述该异常类的信息的.
        3:throw抛出异常对象.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }

    public MyException() {

    }
}
