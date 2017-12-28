package ����¼����Ϣд���ı��ļ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by asd on 2016/9/9.
 */
/*
    ����:
        ����¼��5��ѧ����Ϣ(����,���ĳɼ�,��ѧ�ɼ�,Ӣ��ɼ�),�����ִܷӸߵ��ʹ����ı��ļ�
    ����:
        1:�Ӹߵ��ʹ�---TreeSet
        2:¼���������,д��TreeSet��
        3:��TreeSet������д���ı��ļ���
 */
public class StudentDemo {

    public static void main(String[] args) throws IOException {
        //����TreeSet����
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s2.getSum() - s1.getSum();
                int num = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
                int num2 = num == 0 ? s2.getMath() - s1.getMath() : num;
                int num3 = num2 == 0 ? s2.getEnglish() - s1.getEnglish() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;

                return num4;

            }
        });

        //����¼�����5��ѧ��������
        for(int i=1; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("������ѧ��������");
            String name = scanner.nextLine();
            System.out.println("���ĳɼ���:");
            int chinese = scanner.nextInt();
            System.out.println("��ѧ�ɼ���:");
            int math = scanner.nextInt();
            System.out.println("Ӣ��ɼ���:");
            int english = scanner.nextInt();

            Student student = new Student();
            student.setName(name);
            student.setChinese(chinese);
            student.setEnglish(english);
            student.setMath(math);

            treeSet.add(student);
        }

        //��������,������д���ı��ļ�

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("ooo.txt"));

        bw.write("ѧ������Ϣ����:");
        bw.newLine();
        bw.flush();

        //�������
        for(Student s : treeSet) {
            //����������Ҫ�õ��ַ�����ƴ��,����������StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()+", "+s.getChinese() + ", " + s.getMath()+ ", " +s.getEnglish()+", " + s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //�ر���Դ
        bw.close();


    }
}
