package ListIterator;

/**
 * Created by asd on 2016/9/13.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * �б������:
 * 1:ListIterator listIterator():List�������еĵ�����
 * 2:�̳���Iterator,���Կ���ֱ��ʹ��hasNext()��next()����
 * <p>
 * ���й���:
 * Object previous():��ȡ�ϸ�Ԫ��
 * boolean hasPrevious():�ж��Ƿ���Ԫ��
 * void add(E e):��ָ����Ԫ�ز����б�
 */
/*
    ����:
        �жϼ�����û��"world"���Ԫ��,�����,�����һ��javaeeԪ��
    ����:
        ʹ�õ���������,�����޸�Ԫ��,�ͻ���ֲ����޸��쳣
            ԭ��:
                �������������϶����ڵ�,��������µ�Ԫ��,������ȴ��֪��,���Ծͱ�����
    ���:
        1:����������Ԫ��,�������޸�Ԫ��
            Ԫ���Ǹ��ڵ�����Ԫ�غ����
        2:���ϱ���Ԫ��,�����޸�Ԫ��(for)
            Ԫ�����������ӵ�

    ����:
        1:�������϶���
        2:���������Ԫ��
        3:��������,�ж��Ƿ����"world"
        4:�����,�����һ��"javaee"Ԫ��
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //�������϶���
        List list = new ArrayList();

        //���������Ԫ��
        list.add("hello");
        list.add("world");
        list.add("java");

        //��������,�ж��Ƿ����"world"
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = (String) listIterator.next();
            if (s.equals("world")) {
                listIterator.add("javaee");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }


}

