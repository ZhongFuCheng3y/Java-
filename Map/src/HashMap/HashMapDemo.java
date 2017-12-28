package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    HashMap:
        ���ڹ�ϣ���Map�ӿ�ʵ��
        ��ϣ���������������֤����Ψһ��

 */
/*
    ����:
        HashMap<String,Student>
        ����String	ѧ��
        ֵ��Student ѧ������
    ����:
        1:�������϶���
        2:����ѧ������
        3:����key-value��ֵ��,��ӵ�������
        4:��ȡ�����е����е�key
        5:����key����,����key��ȡֵ
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //�������϶���
        HashMap<String, Student> map = new HashMap<>();

        //����ѧ������
        Student s1 = new Student("���ǳ�", 58);
        Student s2 = new Student("���»�", 55);
        Student s3 = new Student("����ΰ", 54);
        Student s4 = new Student("������", 50);

        //����Ԫ��,����ӵ�������
        map.put("55555", s4);
        map.put("2345", s2);
        map.put("5555", s1);
        map.put("1234", s3);


        //��ȡHashMap���������е�key
        Set<String> set = map.keySet();

        //����key����,���ݼ���ȡֵ
        for (String s : set) {
            Student student = map.get(s);
            System.out.println("ѧ����:" + s + "---������:" + student.getName() + "---������:" + student.getAge());

        }

    }
}
