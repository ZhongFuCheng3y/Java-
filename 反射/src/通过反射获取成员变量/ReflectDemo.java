package 通过反射获取成员变量;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    获取成员变量并使用
        1: 获取Class对象
        2：通过Class对象获取Constructor对象
        3：Object obj = Constructor.newInstance()创建对象
        4：Field field = Class.getField("指定变量名")获取单个成员变量对象
        5：field.set(obj,"") 为obj对象的field字段赋值

    如果需要访问私有或者默认修饰的成员变量
       1:Class.getDeclaredField()获取该成员变量对象
       2:setAccessible() 暴力访问

    //-----------------------------------------
    Person p = new Person();
    p.address = "广州";

 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //获取公共的成员变量

        //获取Class对象
        Class c = Class.forName("获取文件对象的方式.Person");

        //通过Class对象获取Constructor对象
        Constructor con = c.getConstructor();

        //Constructor.newInstance()创建对象
        Object obj = con.newInstance();

        //通过Class.getField()获取单个成员变量

        //获取address并赋值
        Field addressField = c.getField("address");

        //给obj对象的addressField字段设置为广州
        addressField.set(obj, "广州");

        System.out.println(obj);
        //-----------------------------------------------------------

        //获取私有的成员变量
        Field nameField = c.getDeclaredField("name");

        //暴力访问
        nameField.setAccessible(true);

        //给obj对象的nameField字段设置为ozc
        nameField.set(obj, "ozc");
        System.out.println(obj);
        //----------------------------------------------------------------------

        //获取默认修饰的成员变量

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 19);
        System.out.println(obj);

    }

}
