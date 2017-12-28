package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by asd on 2016/9/17.
 */
/*
    TreeMap:�ǻ��ں������Map�ӿڵ�ʵ�֡�
    ����:
        TreeMap<Student,String>
        ��:Student
        ֵ��String
    ����:
        1:�������϶���,����Comparatorʵ����
        2:����ѧ������
        3:����Ԫ�ز����
        4:��������
 */


public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //��Ҫ����
                int num = o1.getAge() - o2.getAge();

                //��Ҫ����
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

                return num2;
            }

        });

        //����ѧ������
        Student s1 = new Student("�˰�", 30);
        Student s2 = new Student("���»�", 35);
        Student s3 = new Student("�Ʋ���", 33);
        Student s4 = new Student("����", 32);
        Student s5 = new Student("�Ʋ���", 33);

        //���Ԫ�ؽ�����
        map.put(s1, "�γ�");
        map.put(s2, "Ԫ��");
        map.put(s3, "����");
        map.put(s4, "�峯");
        map.put(s5, "����");

        //��ȡkey����
        Set<Student> set = map.keySet();

        //����key����
        for (Student student : set) {
            String value = map.get(student);
            System.out.println(student + "---------" + value);
        }
    }
}
