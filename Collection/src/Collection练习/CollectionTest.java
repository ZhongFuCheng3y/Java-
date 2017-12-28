package Collection练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    需求:
        存储字符串到集合中并遍历
    分析:
        1:创建集合对象
        2:把字符串添加到集合中
        3:获取迭代器对象
        4:遍历迭代器
 */
public class CollectionTest {

    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //把字符串添加到集合中
        c.add("hello");
        c.add("world");
        c.add("java");

        //获取迭代器对象
        Iterator iterator = c.iterator();

        //遍历迭代器
        while (iterator.hasNext()) {
            //强制转换
            String s = (String) iterator.next();
            System.out.println(s);
        }


    }
}
