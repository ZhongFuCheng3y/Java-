package ͨ�������ȡ���췽��;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ��ȡ��������Constructor����ʹ��
        1����ȡClass����
        2��ͨ��Class�����ȡConstructor����
        3��ͨ��Constructor.newInstance()��������

        --------------------------------------------
        Person p = new Person("ozc", 19,"����");
        System.out.println(p);
 */
public class ReflectDmo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡClass����
        Class c = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //��ȡ������Constructor�Ķ���
        Constructor con = c.getConstructor(String.class, int.class, String.class);

        //ͨ��Constructor.newInstance()��������
        Object obj = con.newInstance("ozc", 19, "����");
        System.out.println(obj);

    }
}
