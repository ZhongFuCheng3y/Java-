package Iterator;

/**
 * Created by asd on 2016/9/12.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Iterator iterator()
 *      迭代器,集合的专用遍历方式
 *
 * Object next()
 *      获取元素,并移动到下一个位置
 *
 * boolean hasNext()
 *      如果仍有元素可以迭代,就返回true
 *
 * 不要多次使用iterator.next()方法
 *      每调用一次next(),指针就会往下移
 *
 */

/*
    步骤:
        1:创建集合对象
        2:Collection.iterator()获取迭代器对象
        3:迭代器判断是否有下一个元素----一直循环
        4:输出集合中的对象
 */
public class IteratorDemo {

    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //获取迭代器对象
        Iterator iterator = c.iterator();

        //迭代器判断是否有下一个元素
        while (iterator.hasNext()) {
            //获取该元素,返回值类型是Object.所以要强制转换
            String s = (String) iterator.next();
            System.out.println(s);

        }
    }
}
