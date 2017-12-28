package Iterator;

/**
 * Created by asd on 2016/9/12.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator()
 *      ������,���ϵ�ר�ñ�����ʽ
 *
 * Object next()
 *      ��ȡԪ��,���ƶ�����һ��λ��
 *
 * boolean hasNext()
 *      �������Ԫ�ؿ��Ե���,�ͷ���true
 *
 * ��Ҫ���ʹ��iterator.next()����
 *      ÿ����һ��next(),ָ��ͻ�������
 *
 */

/*
    ����:
        1:�������϶���
        2:Collection.iterator()��ȡ����������
        3:�������ж��Ƿ�����һ��Ԫ��----һֱѭ��
        4:��������еĶ���
 */
public class IteratorDemo {

    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        //���Ԫ��
        c.add("hello");
        c.add("world");
        c.add("java");

        //��ȡ����������
        Iterator iterator = c.iterator();

        //�������ж��Ƿ�����һ��Ԫ��
        while (iterator.hasNext()) {
            //��ȡ��Ԫ��,����ֵ������Object.����Ҫǿ��ת��
            String s = (String) iterator.next();
            System.out.println(s);

        }
    }
}
