package 动态代理;

import java.lang.reflect.Proxy;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    首先动态代理其实就是一个中介。本质上要做的东西还是自己做的。
    步骤：
        1： 创建一个实现类实现InvocationHandler接口
        2： 调用Proxy的newProxyInstance方法创建动态代理对象
        3： 通过代理对象调用方法实现功能。
 */
public class Test {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        ud.add();
        ud.delete();
        ud.update();
        ud.find();
        System.out.println("------------------");

        //我们要创建一个动态代理对象
        //Proxy类有一个方法可以创建动态代理对象
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[]interfaces,InvocationHandler h)

        //哪个需要被代理就传入哪一个对象
        MyInvocationHandler handler = new MyInvocationHandler(ud);

        UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.find();
        proxy.update();
        System.out.println("---------------------");
    }
}
