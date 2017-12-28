package List的特有功能;

/**
 * Created by asd on 2016/9/13.
 */

/*
    List集合特有的遍历功能:
        size()和get()方法结合使用
    分析:
        1:创建集合对象
        2:添加元素到集合对象
        3:for遍历集合,用size()和get()结合
 */


import java.util.ArrayList;
import java.util.List;

/**
 * 添加功能:
 *      void add(int index , Object element):在指定的位置添加元素
 * 获取功能:
 *      Object get(int index):在指定位置获取元素
 * 列表迭代器:
 *      ListIterator listIterator():List集合特有的迭代器
 * 删除功能:
 *      Object remove(int index):根据索引删除元素,返回被删除的元素
 * 修改功能:
 *      Object set(int index, Object element):根据索引修改元素,返回被修改的元素
 */
public class ListDemo {

    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();

        //添加元素到集合对象
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }

}
