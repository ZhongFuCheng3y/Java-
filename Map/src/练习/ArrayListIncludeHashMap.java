package ��ϰ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        1: ArrayList����Ƕ��HashMap���ϲ�������
        2: ����ArrayList���ϵ�Ԫ����HashMap����3����
           ÿһ��HashMap���ϵļ���ֵ�����ַ�����

    �����
         ���---С��
         ����---����

         ����---����
         ���---С��Ů

         �����---��ӯӯ
         ��ƽ֮---����ɺ

    ����:
        1:����ArrayList����,Ԫ����HashMap<String,String>
        2:����HashMap����
        3:����Ԫ�ز���ӵ�HashMap��
        4:HashMap��ӵ�ArrayList��
        5:����
            a:����ԭ��ArrayList����
            b:��ȡkey�ļ���
            c:����key��ȡvalue
 */
public class ArrayListIncludeHashMap {
    public static void main(String[] args) {
        //����ArrayList����,Ԫ����HashMap<String,String>
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        //����HashMap����
        HashMap<String, String> hashMap = new HashMap<>();

        //����Ԫ�ز���ӵ�HashMap��
        hashMap.put("���", "С��");
        hashMap.put("����", "����");

        //��HashMap������ӵ�ArrayList����
        list.add(hashMap);

        //����HashMap����
        HashMap<String, String> hashMap1 = new HashMap<>();

        //����Ԫ�ز���ӵ�HashMap��
        hashMap1.put("����", "����");
        hashMap1.put("���", "С��Ů");

        //��HashMap������ӵ�ArrayList����
        list.add(hashMap1);

        //����HashMap����
        HashMap<String, String> hashMap2 = new HashMap<>();

        //����Ԫ�ز���ӵ�HashMap��
        hashMap2.put("�����", "��ӯӯ");
        hashMap2.put("��ƽ֮", "����ɺ");

        //��HashMap������ӵ�ArrayList����
        list.add(hashMap2);

        //����
        for (HashMap<String, String> map : list) {
            Set<String> set = map.keySet();
            for (String s : set) {
                String value = map.get(s);
                System.out.println(s + "--------" + value);
            }
            System.out.println();


        }



    }
}
