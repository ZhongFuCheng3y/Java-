package ArrayListȥ���������ظ���ֵ;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        ArrayListȥ���������ַ������ظ�ֵ(�ַ�����������ͬ)
    ����:
        1:����ArrayList����
        2:���Ԫ��(�ظ���)
        3:����һ���µ�ArrayList����
        4:�����ɵ�ArrayList����,�ж�Ԫ�����µ�ArrayList���Ƿ����
            ����:��ӽ�ȥ
            ��:������

 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //����ArrayList����
        ArrayList arrayList = new ArrayList();

        //���Ԫ��
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("hello");

        //����һ���µ�ArrayList����
        ArrayList newList = new ArrayList();

        //�����ɵļ���
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }

        //�����µļ���
        for (int i = 0; i < newList.size(); i++) {
            String s2 = (String) newList.get(i);
            System.out.println(s2);
        }

    }
}
