package ��ϰ;

import HashMap.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/18.
 */
/* �����Ϲ�
 * 		gz	����У��
 * 			jc	������
 * 					������		30
 * 					���		32
 * 			jy	��ҵ��
 * 					����		    31
 * 					����		    33
 * 	�󼯺�:HashMap<String,HashMap<String,ArrayList<Student>>>
 *
 * 	����:
 * 	    1:���ǲ����ж��У��
 * 	    2:����У��
 * 	        -��ҵ��
 * 	            -ѧ��
 * 	        -������
 * 	            -ѧ��
 * 	    3:������Ϊkey,��ҵ��ͻ�������Ϊvalue
 * 	    4:��ҵ����ѧ������
 * 	    5:������Ҳ��ѧ������
 * 	    6:��ҵ����Ϊkey,ѧ��������Ϊvalue
 * 	    7:��������Ϊkey,ѧ��������Ϊvalue
 *
 *
 *
 */
/*
    ����:
        1:�����󼯺϶���
        2:����СHashMap����
        3:����ѧ������
        4:����ArrayList����
        5:��ѧ��������ArrayList,�Լ�ArrayList��String���СHashMap������
        6:��СHashMap�Լ�String����󼯺϶�����
        7:����
            a:��ȡ�󼯺ϵ�����key
            b:����key�ҵ�value
            c:value��һ��HashMap,���ҵ�СHashMap���е�key
            d:����Сkey�ҵ�value
            e:value��һ��ArrayList
            f:����ArrayList
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //�����󼯺϶���
        HashMap<String, HashMap<String, ArrayList<Student>>> map = new HashMap<>();

        //����СHashMap����
        HashMap<String, ArrayList<Student>> hashMap = new HashMap<>();

        //����ѧ������
        Student student1 = new Student("������", 30);
        Student student2 = new Student("������", 32);

        //����ArrayList����
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);

        //ArrayList�Լ�String���СHashMap������
        hashMap.put("������", list);

        //����ѧ������
        Student student3 = new Student("����", 31);
        Student student4 = new Student("����", 33);

        //����ArrayList����
        ArrayList<Student> list2 = new ArrayList<Student>();
        list2.add(student3);
        list2.add(student4);

        //ArrayList�Լ�String���СHashMap������
        hashMap.put("��ҵ��", list2);

        //��СHashMap�Լ�String����󼯺϶�����
        map.put("����", hashMap);

        //��ȡ�󼯺ϵ�key
        Set<String> set = map.keySet();

        //�����󼯺ϵ�key����
        for (String s : set) {
            System.out.println(s);

            //����key��ȡvalue
            HashMap<String, ArrayList<Student>> listHashMap = map.get(s);

            //��ȡС���ϵ�key
            Set<String> set1 = listHashMap.keySet();

            //����С���ϵ�key
            for (String s1 : set1) {
                System.out.println(s1);

                //����key��ȡvalue
                ArrayList<Student> arrayList = listHashMap.get(s1);

                //����ArrayList����
                for (Student student8 : arrayList) {
                    System.out.println(student8.getName() + "---" + student8.getAge());
                }
            }
        }



    }
}
