package ArrayList去除集合中重复的值;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        ArrayList去除集合中字符串的重复值(字符串的内容相同)
    分析:
        1:创建ArrayList对象
        2:添加元素(重复的)
        3:创建一个新的ArrayList对象
        4:遍历旧的ArrayList对象,判断元素在新的ArrayList中是否存在
            不是:添加进去
            是:不搭理

 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建ArrayList对象
        ArrayList arrayList = new ArrayList();

        //添加元素
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("java");
        arrayList.add("hello");

        //创建一个新的ArrayList对象
        ArrayList newList = new ArrayList();

        //遍历旧的集合
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            if (!newList.contains(s)) {
                newList.add(s);
            }
        }

        //遍历新的集合
        for (int i = 0; i < newList.size(); i++) {
            String s2 = (String) newList.get(i);
            System.out.println(s2);
        }

    }
}
