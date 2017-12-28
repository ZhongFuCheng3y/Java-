package 通过反射获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    获取带参数的Constructor对象并使用
        1：获取Class对象
        2：通过Class对象获取Constructor对象
        3：通过Constructor.newInstance()创建对象

        --------------------------------------------
        Person p = new Person("ozc", 19,"广州");
        System.out.println(p);
 */
public class ReflectDmo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class c = Class.forName("获取文件对象的方式.Person");

        //获取带参数Constructor的对象
        Constructor con = c.getConstructor(String.class, int.class, String.class);

        //通过Constructor.newInstance()创建对象
        Object obj = con.newInstance("ozc", 19, "广州");
        System.out.println(obj);

    }
}
