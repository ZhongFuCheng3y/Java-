package java������������;

import java.lang.reflect.Array;

/**
 * Created by ozc on 2016/8/30.
 */
public class ArrayList1 {
    public static void main(String[] args) {
        //����һ��Ԫ��ΪString������Ϊ10������
        Object arr = Array.newInstance(String.class,10);

        //��������indexΪ5,6Ԫ�ص�ֵ
        Array.set(arr,5,"ozc");
        Array.set(arr,6,"zfc");

        //ȡ��arr����indexΪ5,6��ֵ
        Object book1 = Array.get(arr,5);
        Object book2 = Array.get(arr,6);

        System.out.println(book1);
        System.out.println(book2);
    }
}
