package ��ʹ��List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        List�洢�Զ������

    ����:
        1:����List����
        2:����ѧ������
        3:��ѧ��������ӵ�List������
        4:��ȡIterator����
        5:��������

 */
public class ListDemo2 {

    public static void main(String[] args) {
        //����List����
        List list = new ArrayList();

        //����ѧ������
        Student student = new Student("q", 2);
        Student student1 = new Student("w", 3);
        Student student2 = new Student("e", 4);

        //��ѧ��������ӵ�List������
        list.add(student);
        list.add(student1);
        list.add(student2);

        //��ȡIterator����
        Iterator iterator = list.iterator();

        //��������
        while (iterator.hasNext()) {

            Student student3 = (Student) iterator.next();
            System.out.println(student3.getName() + ":::" + student3.getAge());


        }

    }

}
