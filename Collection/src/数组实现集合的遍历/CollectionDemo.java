package ����ʵ�ּ��ϵı���;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asd on 2016/9/12.
 */
/*
    Object[] toArray():�Ѽ���ת������,����ʵ�ּ��ϵı���

    ����:
        1:�������϶���
        2:�����϶���ת��������
        3:��������
 */

public class CollectionDemo {
    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        //���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        //�Ѽ���ת�������,�Ϳ��Ա�����
        Object[] objects = c.toArray();


        //�������ó�����Ԫ�ض���Object���͵�.
        //�����Ҫ֪���ַ����ĳ���,����Ҫ����ǿת
        for (Object object : objects) {

            String s = (String) object;
            System.out.println(s + "����:" + s.length());

        }

    }
}
