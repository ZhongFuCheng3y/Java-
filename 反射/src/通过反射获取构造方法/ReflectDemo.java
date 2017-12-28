package 通过反射获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    通过反射获取构造方法：
        1：获取Class对象
        2：通过Class对象获取Constructor对象
        3：通过Constructor.newInstance()创建对象
    ---------------------------------------
    Person p = new Person();
    System.out.println(p);
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取字节码文件对象
        Class c = Class.forName("获取文件对象的方式.Person");

        //通过Class对象获取Constructor对象
        //返回的是构造方法对象
        Constructor con = c.getConstructor();

        //public T newInstance(Object... initargs)
        //使用此Constructor对象表示的构造方法来创建该构造方法的声明类的新实例，并用指定的初始化参数初始化该实例
        Object obj = con.newInstance();
        System.out.println(obj);

    }
}
