package ArrayListȥ���������ظ���ֵ;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����
        ȥ���������Զ��������ظ�ֵ(����ĳ�Ա����ֵ����ͬ)
    ����:
        1:�������϶���
        2:����ѧ������
        3:��ѧ��������ӵ����϶�����
        4:����һ���µļ��϶���
        5:�����ɵļ��϶���,�ж�Ԫ�����µļ������Ƿ����
            ����:��ӽ�ȥ
            ��:������
    Ҫ��:
        contains()���������ĵ�equals(),����,����Ҫ��Student������дeuquals()
 */
public class ArrayListDemo3 {

    public static void main(String[] args) {
        //�������϶���
        ArrayList arrayList = new ArrayList();

        //����ѧ������
        Student student = new Student("���", 1);
        Student student5 = new Student("���", 1);
        Student student1 = new Student("���1", 1);
        Student student2 = new Student("���2", 1);
        Student student3 = new Student("���1", 1);
        Student student4 = new Student("���2", 1);
        Student student6 = new Student("���3", 1);

        //�Ѷ�����ӵ�������ȥ
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        //�����µļ���
        ArrayList arrayList1 = new ArrayList();


        //�����ɵļ���,�ж�Ԫ�����µļ������Ƿ����
        for (int i = 0; i < arrayList.size(); i++) {
            Student student7 = (Student) arrayList.get(i);
            if (!arrayList1.contains(student7)) {
                arrayList1.add(student7);

            }
        }

        //�����µļ���
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            Student student7 = (Student) iterator.next();

            System.out.println(student7.getName()+"``````"+ student7.getAge());

        }


    }
}
