package ��ʹ��List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        �洢�ַ���������
    ����:
        1:����List����
        2:���ַ�����ӵ�List������
        3:��ȡIterator����
        4:��������
 */
public class ListDemo {
    public static void main(String[] args) {
        //����List����
        List list = new ArrayList();

        //���ַ�����ӵ�List������
        list.add("hello");
        list.add("world");
        list.add("java");

        //��ȡIterator����
        Iterator iterator = list.iterator();

        //��������
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }

    }
}
