package Collection��ϰ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    ����:
        �洢�Զ�����󲢱���Student(name,age)
    ����:
        1:����ѧ����
        2:����ѧ������
        3:�������϶���
        4:��ѧ��������ӵ�������
        5:��ȡ����������
        6:����������
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        //����ѧ������
        Student student = new Student("ozc", 20);
        Student student1 = new Student("ozc1", 201);

        //�������϶���
        Collection c = new ArrayList();

        //��ѧ��������ӵ�������
        c.add(student);
        c.add(student1);

        //��ȡ����������
        Iterator iterator = c.iterator();

        //����������
        while (iterator.hasNext()) {
            //ǿ��ת��
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + s.getAge());


        }
    }
}
