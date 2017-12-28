package ͨ�������ȡ��Ա����;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ��ȡ��Ա������ʹ��
        1: ��ȡClass����
        2��ͨ��Class�����ȡConstructor����
        3��Object obj = Constructor.newInstance()��������
        4��Field field = Class.getField("ָ��������")��ȡ������Ա��������
        5��field.set(obj,"") Ϊobj�����field�ֶθ�ֵ

    �����Ҫ����˽�л���Ĭ�����εĳ�Ա����
       1:Class.getDeclaredField()��ȡ�ó�Ա��������
       2:setAccessible() ��������

    //-----------------------------------------
    Person p = new Person();
    p.address = "����";

 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //��ȡ�����ĳ�Ա����

        //��ȡClass����
        Class c = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //ͨ��Class�����ȡConstructor����
        Constructor con = c.getConstructor();

        //Constructor.newInstance()��������
        Object obj = con.newInstance();

        //ͨ��Class.getField()��ȡ������Ա����

        //��ȡaddress����ֵ
        Field addressField = c.getField("address");

        //��obj�����addressField�ֶ�����Ϊ����
        addressField.set(obj, "����");

        System.out.println(obj);
        //-----------------------------------------------------------

        //��ȡ˽�еĳ�Ա����
        Field nameField = c.getDeclaredField("name");

        //��������
        nameField.setAccessible(true);

        //��obj�����nameField�ֶ�����Ϊozc
        nameField.set(obj, "ozc");
        System.out.println(obj);
        //----------------------------------------------------------------------

        //��ȡĬ�����εĳ�Ա����

        Field ageField = c.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(obj, 19);
        System.out.println(obj);

    }

}
