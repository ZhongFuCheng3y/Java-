package ͨ�������ȡ��Ա����;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ozc on 2016/8/29.
 */

/*
    ͨ��������ó�Ա����
        1����ȡClass����
        2��ͨ��Class�����ȡConstructor����
        3��Constructor.newInstance()��������
        4��ͨ��Class�����ȡMethod����  ------getMethod("������");
        5: Method�������invoke����ʵ�ֹ���

    ������õ���˽�з�����ô��Ҫ��������
        1: getDeclaredMethod()
        2: setAccessiable();
     //--------------------------------------------
     Person p = new Person();
     p.show();
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡClass����
        Class c = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //ͨ��Class�����ȡConstructor����
        Constructor con = c.getConstructor();

        //Constructor.newInstance()��������
        Object obj = con.newInstance();

        // public Method getMethod(String name,Class<?>... parameterTypes)
        //��һ��������ʾ���Ƿ��������ڶ���������ʾ���ǵ��ø÷�����ʵ�ʲ���
        // public Object invoke(Object obj,Object... args)
        // ����ֵ��Object����,��һ��������ʾ������˭���ڶ�������ʾ���ø÷�����ʵ�ʲ���


        //ͨ��Class�����ȡMethod����
        Method m1 = c.getMethod("show");

        //����obj��show����
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
