package �˽�Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
 *����
 *      ����HashMap���ϵ�Ԫ����ArrayList����3����
 *      ÿһ��ArrayList���ϵ�ֵ���ַ�����
 *
 *�����
 *	 ��������
 *		 	����
 *		 	���
 *	 Ц������
 *		 	�����
 *		 	��ƽ֮
 *	 �������
 *		 	����
 *		 	���
 */
/*
    ����:
        1:������HashMap����
        2:����ArrayList����
        3:����Ԫ�ز���ӵ�ArrayList������
        4:��������
            a:��ȡHashMap�����е�����key
            b:����key��ȡvalue
            c:value��һ��ArrayList����
            d:����ArrayList����������

 */
public class HashMapIncludeArrayList {
    public static void main(String[] args) {
        //�������HashMap����
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        //����С��ArrayList����
        ArrayList<String> list = new ArrayList<>();

        //����Ԫ�ز���ӵ�������
        list.add("����");
        list.add("���");

        //��ArrayList����,�Լ�������ӵ�HashMap������
        hashMap.put("��������", list);

        //����С��ArrayList����
        ArrayList<String> list2 = new ArrayList<>();

        //����Ԫ�ز���ӵ�������
        list2.add("�����");
        list2.add("��ƽ֮");

        //��ArrayList����,�Լ�������ӵ�HashMap������
        hashMap.put("Ц������", list2);


        //����С��ArrayList����
        ArrayList<String> list3 = new ArrayList<>();

        //����Ԫ�ز���ӵ�������
        list3.add("����");
        list3.add("���");

        //��ArrayList����,�Լ�������ӵ�HashMap������
        hashMap.put("�������", list3);

        //HashMap��ȡkey�ļ���
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s);
            ArrayList<String> arrayList = hashMap.get(s);
            for (String s1 : arrayList) {
                System.out.println(s1);
            }
        }
    }

}
