package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    ����:
        �ü��ϴ洢5��ѧ�����󣬲���ѧ��������б������õ���������
    ����:
        1:�������϶���
        2:����ѧ������
        3:��ѧ��������ӵ�������
        4:��ȡ����������
        5:����������
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        //����ѧ������
        Student student = new Student("nihao", 02);
        Student student1 = new Student("nihao1", 12);
        Student student2 = new Student("nihao2", 22);

        //��ѧ��������ӵ�������
        c.add(student);
        c.add(student1);
        c.add(student2);

        //��ȡ����������
        Iterator iterator = c.iterator();

         System.out.println(((Student) iterator.next()).getName() + "---"
         + ((Student) iterator.next()).getAge());

        //����������
//        while (iterator.hasNext()) {
//            //ǿ��ת��
//            Student student3 = (Student) iterator.next();
//
//            System.out.println(student3.getName() + "---" + student3.getAge());
//
//        }
    }
}
