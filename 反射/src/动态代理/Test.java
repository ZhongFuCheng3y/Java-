package ��̬����;

import java.lang.reflect.Proxy;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ���ȶ�̬������ʵ����һ���н顣������Ҫ���Ķ��������Լ����ġ�
    ���裺
        1�� ����һ��ʵ����ʵ��InvocationHandler�ӿ�
        2�� ����Proxy��newProxyInstance����������̬�������
        3�� ͨ�����������÷���ʵ�ֹ��ܡ�
 */
public class Test {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        ud.add();
        ud.delete();
        ud.update();
        ud.find();
        System.out.println("------------------");

        //����Ҫ����һ����̬�������
        //Proxy����һ���������Դ�����̬�������
        // public static Object newProxyInstance(ClassLoader loader,Class<?>[]interfaces,InvocationHandler h)

        //�ĸ���Ҫ������ʹ�����һ������
        MyInvocationHandler handler = new MyInvocationHandler(ud);

        UserDao proxy = (UserDao) Proxy.newProxyInstance(ud.getClass().getClassLoader(), ud.getClass().getInterfaces(), handler);
        proxy.add();
        proxy.delete();
        proxy.find();
        proxy.update();
        System.out.println("---------------------");
    }
}
