package ��������;

/**
 * Created by asd on 2016/9/12.
 */
/*
    ����:
        ����2��ѧ��,��ѧ������Ϣ�洢��������,��������.��ȡѧ������Ϣ
    ����:
        1:����ѧ����
        2:����ѧ������
        3:����ѧ������,����ֵ
        4:�Ѷ�����ӵ�����
        5:����ѧ������

 */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        //����ѧ������
        Student[] students = new Student[2];

        //����ѧ������,����ֵ
        Student student = new Student("1", 22);
        Student student1 = new Student("2", 23);

        //�Ѷ�����ӵ�����
        students[0] = student;
        students[1] = student1;

        //����ѧ������,��ȡ��Ϣ
        int x = 1;
        for (Student s : students) {
            System.out.println("��" +x+"��ѧ����������:" + s.getName() + "������:" + s.getAge());

        }
    }
}
