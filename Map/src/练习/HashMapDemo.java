package ��ϰ;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        Ƕ��ʹ��HashMap

 ���ǲ���
 * 		jc	������
 * 				����¥		20
 * 				��Ծ			22
 * 		jy	��ҵ��
 * 				���			21
 * 				��ʯ��		23
 *
 * �ȴ洢Ԫ�أ�Ȼ�����Ԫ��
 */
/*
    ����:
        1:������ļ���HashMap����
        2:����С��HashMap����
        3:����key-value����ӵ�С��HashMap��
        4:С��HashMap��ӵ����HashMap����
        5:����
            a:��ô��HashMap�����key����
            b:����key����,����key��ȡvalue
            c:valueҲ��һ��HashMap����
            d:��������

 */
public class HashMapDemo {
    public static void main(String[] args) {
        //�����󼯺϶���
        HashMap<String, HashMap<String, Integer>> hashMap = new HashMap<>();

        //����С�ļ��϶���
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        //����key-value��ֵ��,��ӵ�������.
        hashMap1.put("����¥", 20);
        hashMap1.put("��Ծ", 22);

        //С�ļ�����ӵ���ļ�����
        hashMap.put("jc", hashMap1);

        //����С�ļ��϶���
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        //����key-value��ֵ��,��ӵ�������.
        hashMap2.put("���", 21);
        hashMap2.put("��ʯ��", 23);

        //С�ļ�����ӵ���ļ�����
        hashMap.put("jy", hashMap2);

        //��ȡ�󼯺ϵ�key����
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            HashMap<String, Integer> hashMap3 = hashMap.get(s);
            System.out.println("����:" + s + "��");
            Set<String> set1 = hashMap3.keySet();
            for (String s1 : set1) {
                Integer i = hashMap3.get(s1);
                System.out.println("����"+s1+"-------"+i+"��");
            }
        }


    }

}
