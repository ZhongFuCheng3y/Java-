package ArrayListȥ���������ظ���ֵ;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        ArrayListȥ���������ظ���ֵ,ֻ����ͬһ����������

    ����:
        1:�������϶���
        2:���Ԫ�ص����϶�������
        3:ѡ�������˼��
        4:��һ��Ԫ�ظ����������Ԫ�رȽ�,�����ͬ,��remove����




 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //�������϶���
        ArrayList arrayList = new ArrayList();

        //���Ԫ��
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("java");

        //ѡ�������˼��
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }

        //������
        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            System.out.println(s);

        }

    }
}
