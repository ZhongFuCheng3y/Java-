package ���ϵ�Ƕ�ױ���;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        1:һ��ѧ������һ������
        2:һ�����ϴ���һ���༶
        3:ÿ���༶����ArrayList<Student>
        4:�������ж�����ϴ洢,Ӧ����������ArrayList<ArrayList<Student>>
        5:ArrayList<ArrayList<Student>>,�����ArrayList<Student>������һ��Ԫ��
    ����:
        1:����ѧ������
        2:��ѧ��������������
        3:���༶����󼯺���
        4:�����󼯺�

 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //�����󼯺϶���
        ArrayList<ArrayList<Student>> arrayLists = new ArrayList<>();


        //������һ���༶
        ArrayList<Student> students = new ArrayList<>();

        //����ѧ������
        Student s1 = new Student("��ɮ", 30);
        Student s2 = new Student("�����", 29);
        Student s3 = new Student("��˽�", 28);
        Student s4 = new Student("ɳɮ", 27);
        Student s5 = new Student("������", 26);

        //ѧ�����༶
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //�༶����󼯺�
        arrayLists.add(students);

        //�����ڶ����༶
        ArrayList<Student> students1 = new ArrayList<>();

        //����ѧ������
        Student s11 = new Student("�����", 30);
        Student s22 = new Student("˾��ܲ", 28);
        Student s33 = new Student("���", 26);

        //ѧ������
        students1.add(s11);
        students1.add(s22);
        students1.add(s33);

        //�༶����󼯺�
        arrayLists.add(students1);

        //����ѧ��ϵͳ����
        for (ArrayList<Student> arrayList : arrayLists) {
            for (Student student : arrayList) {
                System.out.println(student.getName() + "::::" + student.getAge());

            }
        }





    }
}
