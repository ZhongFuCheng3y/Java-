package Vector;

/**
 * Created by asd on 2016/9/13.
 */

import java.util.Enumeration;
import java.util.Vector;

/**
 *  Vector特有的功能:
 *     添加功能:
 *          public void addElement(Object obj) --add()
 *     获取功能:
 *          public Object elementAt(int index) ---get()
 *          public Enumeration elements() ----Iterator iterator()
 *                 boolean hasMoreElements()----hasNext()
 *                 Object newElement() --------next()
 */
/*
    jdk升级的原因:
        1:安全
        2:效率
        3:简化书写
 */
public class VectorDemo {
    public static void main(String[] args) {

        //创建集合对象
        Vector vector = new Vector();

        //添加功能
        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");

        //遍历
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
