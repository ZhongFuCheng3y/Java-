package 通过反射获取成员方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ozc on 2016/8/29.
 */

/*
    通过反射调用成员方法
        1：获取Class对象
        2：通过Class对象获取Constructor对象
        3：Constructor.newInstance()创建对象
        4：通过Class对象获取Method对象  ------getMethod("方法名");
        5: Method对象调用invoke方法实现功能

    如果调用的是私有方法那么需要暴力访问
        1: getDeclaredMethod()
        2: setAccessiable();
     //--------------------------------------------
     Person p = new Person();
     p.show();
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获取Class对象
        Class c = Class.forName("获取文件对象的方式.Person");

        //通过Class对象获取Constructor对象
        Constructor con = c.getConstructor();

        //Constructor.newInstance()创建对象
        Object obj = con.newInstance();

        // public Method getMethod(String name,Class<?>... parameterTypes)
        //第一个参数表示的是方法名，第二个参数表示的是调用该方法的实际参数
        // public Object invoke(Object obj,Object... args)
        // 返回值是Object接收,第一个参数表示对象是谁，第二参数表示调用该方法的实际参数


        //通过Class对象获取Method对象
        Method m1 = c.getMethod("show");

        //调用obj的show方法
        m1.invoke(obj);

        //----------------------------------------------------

        Method m2 = c.getMethod("method", String.class);
        m2.invoke(obj, "hello");

        //---------------------------------------------
        Method m3 = c.getMethod("getString", String.class, int.class);
        Object objString = m3.invoke(obj, "hello", 100);
        System.out.println(objString);
        //---------------------------

        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);


    }
}
