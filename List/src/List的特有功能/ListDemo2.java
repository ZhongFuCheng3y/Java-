package List�����й���;

import java.util.*;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        �洢�Զ�����󲢱���,����ͨforѭ����(size()��get()���)
    ����:
        1:�������϶���
        2:����ѧ������
        3:��ѧ��������ӵ����϶�����
        4:����,size()��get�Ľ��
 */
public class ListDemo2 {
    public static void main(String[] args) {
        //�������϶���
        List list = new ArrayList();

        //����ѧ������
        Student student = new Student("1", 02);
        Student student1 = new Student("2", 12);
        Student student2 = new Student("4", 22);
        Student student3 = new Student("3", 32);

        //��ѧ��������ӵ�������
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //for��������
        for (int i = 0; i < list.size(); i++) {
            Student student4 = (Student) list.get(i);
            System.out.println(student4.getName()+"`````````"+ student4.getAge());
        }
    }
}
