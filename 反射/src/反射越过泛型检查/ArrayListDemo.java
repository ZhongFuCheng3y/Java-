package 反射越过泛型检查;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    需求：
        我给你一个ArrayList<Integer>的一个对象，我想在这个集合上添加一个String类型的数据，如何解决？
    分析：
        1：在通常情况下，我们是不能添加String类型进集合的，因为泛型规定了Integer类型
        2：代码中的Integer仅仅是给编译器看的，而反射拿到的是字节码文件对象--也就是源码
        3：泛型的默认类型是Object
   实现：
        1:  创建集合对象
        2： 通过集合对象获取Class对象
        3： 通过Class对象获取Method对象
        4： 调用invoke方法实现功能
 */
public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //创建集合对象
        ArrayList<Integer> array = new ArrayList<>();

        //获取Class对象
        Class c = array.getClass();

        //根据Class对象获取Method对象
        Method method = c.getMethod("add",Object.class);

        //调用方法
        method.invoke(array,"hello");
        method.invoke(array,"world");
        method.invoke(array,"java");

        System.out.println(array);
    }

}
