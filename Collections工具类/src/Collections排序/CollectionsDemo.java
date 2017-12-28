package Collections

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

����;

/**
 * Created by asd on 2016/9/18.
 */
/*
    Collections�������ArrayList�洢�Ļ�����װ���������,�洢�Զ������Ҳ�ǿ��Ե�.

    Ҫ��:
        1:���ͬʱ����Ȼ����ͱȽ�������,�ԱȽ�������Ϊ��

    ����:
        1:����ѧ������
        2:�������϶���
        3:���Ԫ�ؽ�����
        4:����Collections��������,���ǲ��ñȽ�������
        5:����
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //�������϶���
        List<Collections排序.Student> students = new ArrayList<>();

        //����ѧ������
        Collections排序.Student s1 = new Collections排序.Student("����ϼ", 27);
        Collections排序.Student s2 = new Collections排序.Student("������", 30);
        Collections排序.Student s3 = new Collections排序.Student("������", 28);
        Collections排序.Student s4 = new Collections排序.Student("����", 29);
        Collections排序.Student s5 = new Collections排序.Student("����ϼ", 27);

        //���Ԫ��
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //���÷�������
        Collections.sort(students, new Comparator<Collections排序.Student>() {
            @Override
            public int compare(Collections排序.Student o1, Collections排序.Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        //����
        for (Collections排序.Student student : students) {
            System.out.println(student.getName() + "----" + student.getAge());
        }

    }
}
