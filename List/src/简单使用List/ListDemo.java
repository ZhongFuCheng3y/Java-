package 简单使用List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        存储字符串并遍历
    分析:
        1:创建List对象
        2:把字符串添加到List对象中
        3:获取Iterator对象
        4:遍历集合
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建List对象
        List list = new ArrayList();

        //把字符串添加到List对象中
        list.add("hello");
        list.add("world");
        list.add("java");

        //获取Iterator对象
        Iterator iterator = list.iterator();

        //遍历集合
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }

    }
}
