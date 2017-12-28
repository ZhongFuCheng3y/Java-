package 通过反射获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    通过反射获取私有构造方法并使用
        1：获取Class对象
        2：通过Class对象获取Constructor对象---getDeclaredConstructor
        3: 暴力访问----反射的对象在使用时应该取消Java语言访问检查
        4：通过Constructor.newInstance()创建对象

        -----------------------------------------
        Person p = new Person("ozc");
        System.out.println(p);
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class c = Class.forName("获取文件对象的方式.Person");

        //通过Class对象获取Constructor对象
        //直接使用getConstructor会发生异常，因为这个方法只能获取公共的
        //所以我们需要用到getDeclaredConstructor
        Constructor con = c.getDeclaredConstructor(String.class);

        //由于是私有方法，所以我们需要暴力访问
        // 值为true则指示反射的对象在使用时应该取消Java语言访问检查
        con.setAccessible(true);

        //Constructor.newInstance()创建对象
        Object object = con.newInstance("ozc");

        System.out.println(object);

    }

}
