package ͨ�������ȡ���췽��;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ͨ�������ȡ˽�й��췽����ʹ��
        1����ȡClass����
        2��ͨ��Class�����ȡConstructor����---getDeclaredConstructor
        3: ��������----����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ��
        4��ͨ��Constructor.newInstance()��������

        -----------------------------------------
        Person p = new Person("ozc");
        System.out.println(p);
 */
public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //��ȡClass����
        Class c = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //ͨ��Class�����ȡConstructor����
        //ֱ��ʹ��getConstructor�ᷢ���쳣����Ϊ�������ֻ�ܻ�ȡ������
        //����������Ҫ�õ�getDeclaredConstructor
        Constructor con = c.getDeclaredConstructor(String.class);

        //������˽�з���������������Ҫ��������
        // ֵΪtrue��ָʾ����Ķ�����ʹ��ʱӦ��ȡ��Java���Է��ʼ��
        con.setAccessible(true);

        //Constructor.newInstance()��������
        Object object = con.newInstance("ozc");

        System.out.println(object);

    }

}
