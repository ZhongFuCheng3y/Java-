package ListIterator;

/**
 * Created by asd on 2016/9/13.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * 列表迭代器:
 * 1:ListIterator listIterator():List集合特有的迭代器
 * 2:继承了Iterator,所以可以直接使用hasNext()和next()方法
 * <p>
 * 特有功能:
 * Object previous():获取上个元素
 * boolean hasPrevious():判断是否有元素
 * void add(E e):将指定的元素插入列表
 */
/*
    需求:
        判断集合有没有"world"这个元素,如果有,就添加一个javaee元素
    问题:
        使用迭代器遍历,集合修改元素,就会出现并发修改异常
            原因:
                迭代器依赖集合而存在的,集合添加新的元素,迭代器却不知道,所以就报错了
    解决:
        1:迭代器迭代元素,迭代器修改元素
            元素是跟在迭代的元素后面的
        2:集合遍历元素,集合修改元素(for)
            元素是在最后添加的

    分析:
        1:创建集合对象
        2:往集合添加元素
        3:遍历集合,判断是否存在"world"
        4:如果有,就添加一个"javaee"元素
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();

        //往集合添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        //遍历集合,判断是否存在"world"
//        for (int i = 0; i < list.size(); i++) {
//            String s = (String) list.get(i);
//            if (s.equals("world")) {
//                list.add("javaee");
//            }
//        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String s = (String) listIterator.next();
            if (s.equals("world")) {
                listIterator.add("javaee");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }


}

