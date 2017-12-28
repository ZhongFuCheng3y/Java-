package finally用法;

/**
 * Created by asd on 2016/9/6.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * finally:被finally控制的语句体一定会被执行
 */
/*
    格式:
        try....catch...finally
    作用:
        用于释放资源
 */
/*
    finally内的代码除了在前面的代码中退出jvm,不然一定会被执行
    如果有return  顺序:  return--finally--return
 */
public class FinallyDemo {
    public static void main(String[] args) {
        String s = "2014-10-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            //System.exit(0);
        } finally {
            System.out.println("这里是一定会被执行的代码");
        }

        System.out.println(d);
    }
}
