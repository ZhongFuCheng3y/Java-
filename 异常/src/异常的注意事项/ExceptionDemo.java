package 异常的注意事项;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 2016/9/6.
 */
/*
    1:子类重写父类方法时,子类的方法必须抛出相同的异常或者是父类异常的子类
    2:父类抛出多个异常,子类不能比父类更多.
    3:子类不能抛出父类没有的异常
    4:被重写的方法没有抛出异常,子类的方法也不能抛出异常.如果子类方法内有异常,不能抛出,只能try..catch
 */

public class ExceptionDemo {
}

class Fu {
    public void show() throws Exception {

    }

    public void method() {
    }

    ;
}

class Zi extends Fu {

    public void show() throws ArithmeticException {
    }

    //只能在方法中try...catch..因为父类的方法没有抛出异常...
    public void method() {
        String s = "2014-11-20";
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
}
