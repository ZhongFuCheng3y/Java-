package ͨ�������ȡ���췽��;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ͨ�������ȡ���췽����
        1����ȡClass����
        2��ͨ��Class�����ȡConstructor����
        3��ͨ��Constructor.newInstance()��������
    ---------------------------------------
    Person p = new Person();
    System.out.println(p);
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡ�ֽ����ļ�����
        Class c = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //ͨ��Class�����ȡConstructor����
        //���ص��ǹ��췽������
        Constructor con = c.getConstructor();

        //public T newInstance(Object... initargs)
        //ʹ�ô�Constructor�����ʾ�Ĺ��췽���������ù��췽�������������ʵ��������ָ���ĳ�ʼ��������ʼ����ʵ��
        Object obj = con.newInstance();
        System.out.println(obj);

    }
}
