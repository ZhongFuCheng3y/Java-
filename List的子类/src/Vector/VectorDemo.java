package Vector;

/**
 * Created by asd on 2016/9/13.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 *  Vector���еĹ���:
 *     ��ӹ���:
 *          public void addElement(Object obj) --add()
 *     ��ȡ����:
 *          public Object elementAt(int index) ---get()
 *          public Enumeration elements() ----Iterator iterator()
 *                 boolean hasMoreElements()----hasNext()
 *                 Object newElement() --------next()
 */
/*
    jdk������ԭ��:
        1:��ȫ
        2:Ч��
        3:����д
 */
public class VectorDemo {
    public static void main(String[] args) {

        //�������϶���
        Vector vector = new Vector();

        //��ӹ���
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");

        //����
        for (int i = 0; i < vector.size(); i++) {
            String s = (String) vector.elementAt(i);
            System.out.println(s);
        }
        System.out.println("----------------------------");

        Enumeration enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            String s2 = (String) enumeration.nextElement();
            System.out.println(s2);
        }
    }
}
