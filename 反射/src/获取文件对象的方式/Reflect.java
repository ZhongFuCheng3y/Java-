package ��ȡ�ļ�����ķ�ʽ;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ������ʵ����ͨ��class�ļ�����ȥʹ�øö���ĳ�Ա���������췽������Ա����

    ��Ҫʹ�÷��䣬����Ҫ�õ�class�ļ�������ʵҲ���ǵõ�Class��Ķ���

    Class���зֱ��������������ĳ�Ա��������Ա���������췽��
    Class�ࣺ
        ��Ա����  - Field
        ��Ա����  - Constructor
        ���췽��  - Method

    ��ȡclass�ļ�����ķ�ʽ��
        1��Object���getClass()����
        2���������͵ľ�̬����class
        3��Class���еľ�̬������
                public static Class ForName(String className)

    һ������Ҫʹ����һ���أ�
        �ڿ���������һ��ʹ�õ����֣���Ϊ����һ���ַ�����������һ����������ͣ����ǿ��԰��������ַ������õ������ļ���

 */
public class Reflect {

    public static void main(String[] args) throws ClassNotFoundException {
        //��ʽ1��Objcet���getClass()����
        Person p = new Person();
        Class c = p.getClass();

        //��ʽ2���������͵ľ�̬����class
        Class c2 = Person.class;

        //��ʽ3��
        Class c3 = Class.forName("��ȡ�ļ�����ķ�ʽ.Person");

        //���ַ�ʽ�õĶ���ͬһ��class�ļ������Է���true
        System.out.println(c3 == c);

    }


}
