package Collection��ϰ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    ����:
        �洢�ַ����������в�����
    ����:
        1:�������϶���
        2:���ַ�����ӵ�������
        3:��ȡ����������
        4:����������
 */
public class CollectionTest {

    public static void main(String[] args) {
        //�������϶���
        Collection c = new ArrayList();

        //���ַ�����ӵ�������
        c.add("hello");
        c.add("world");
        c.add("java");

        //��ȡ����������
        Iterator iterator = c.iterator();

        //����������
        while (iterator.hasNext()) {
            //ǿ��ת��
            String s = (String) iterator.next();
            System.out.println(s);
        }


    }
}
