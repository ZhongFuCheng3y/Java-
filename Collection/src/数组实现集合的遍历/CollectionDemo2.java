package ����ʵ�ּ��ϵı���;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asd on 2016/9/12.
 */
/*
    ����:
        �ü��ϴ洢5��ѧ������,����ѧ��������б���
    ����:
        1:����ѧ����
        2:����ѧ������
        3:�������϶���
        4:��ѧ��������ӵ�����
        5:����ת��������
        6:��������

 */
public class CollectionDemo2 {

    public static void main(String[] args) {
        //����ѧ������
        Student student = new Student("1", 2);
        Student student1 = new Student("2", 3);
        Student student2 = new Student("3", 4);

        //�������϶���
        Collection c = new ArrayList();

        //��ѧ��������ӵ�����
        c.add(student);
        c.add(student1);
        c.add(student2);

        //�Ѽ���ת��������
        Object[] objects = c.toArray();

        //��������
        for (Object object : objects) {
            //����ת��,�����Student���͵�
            Student student3 = (Student) object;
            System.out.println(student3.getName() + " ::::" + student3.getAge());

        }
    }
}
