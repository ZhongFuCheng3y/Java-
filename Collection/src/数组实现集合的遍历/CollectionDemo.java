package 数组实现集合的遍历;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asd on 2016/9/12.
 */
/*
    Object[] toArray():把集合转成数组,可以实现集合的遍历

    分析:
        1:创建集合对象
        2:将集合对象转换成数组
        3:遍历数组
 */

public class CollectionDemo {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //把集合转变成数组,就可以遍历了
        Object[] objects = c.toArray();


        //从数组拿出来的元素都是Object类型的.
        //如果想要知道字符串的长度,就需要向下强转
        for (Object object : objects) {

            String s = (String) object;
            System.out.println(s + "长度:" + s.length());

        }

    }
}
