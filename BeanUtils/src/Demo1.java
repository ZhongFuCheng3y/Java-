import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 2016/11/15.
 */
/*
* 用BeanUtils操作Bean
*
* */
public class Demo1 {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        String name = "flx";
        String password = "123";
        String age = "23";
        String email = "flx@sina.com";
        String birthday = "1980-09-09";  //date




        /*
        * 我们可以发现,BeanUtils可以自动转换基本的类型,但是字符串转成日期就不是自动的,需要我们调用转换器
        *
        * 此时,我们就去找文档,去看看有没有转换该类型的,如果没有,我们就自己写,自己写的格式如下
        * */

        //当调用setProperty方法的时候,执行到birthday时,程序会调用下面的方法
        ConvertUtils.register(new Converter() {

            @Override
            public Object convert(Class aClass, Object o) {

                if (o == null) {
                    return null;
                }

                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = null;
                try {
                    date = simpleDateFormat.parse((String) o);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                return date;
            }
        },Date.class);



        Student student = new Student();
        BeanUtils.setProperty(student, "name", name);
        BeanUtils.setProperty(student, "password", password);
        BeanUtils.setProperty(student, "age", age);
        BeanUtils.setProperty(student, "email", email);
        BeanUtils.setProperty(student, "birthday", birthday);

        System.out.println(student.getBirthday());




    }


}
