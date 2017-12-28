package java疯狂讲义操作数组;

import java.lang.reflect.Array;

/**
 * Created by ozc on 2016/8/30.
 */
public class ArrayList1 {
    public static void main(String[] args) {
        //创建一个元素为String，长度为10的数组
        Object arr = Array.newInstance(String.class,10);

        //设置数组index为5,6元素的值
        Array.set(arr,5,"ozc");
        Array.set(arr,6,"zfc");

        //取出arr数组index为5,6的值
        Object book1 = Array.get(arr,5);
        Object book2 = Array.get(arr,6);

        System.out.println(book1);
        System.out.println(book2);
    }
}
