package 练习;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        嵌套使用HashMap

 传智播客
 * 		jc	基础班
 * 				陈玉楼		20
 * 				高跃			22
 * 		jy	就业班
 * 				李杰			21
 * 				曹石磊		23
 *
 * 先存储元素，然后遍历元素
 */
/*
    分析:
        1:创建大的集合HashMap对象
        2:创建小的HashMap对象
        3:创建key-value并添加到小的HashMap中
        4:小的HashMap添加到大的HashMap对象
        5:遍历
            a:获得大的HashMap对象的key集合
            b:遍历key集合,根据key获取value
            c:value也是一个HashMap集合
            d:继续遍历

 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建大集合对象
        HashMap<String, HashMap<String, Integer>> hashMap = new HashMap<>();

        //创建小的集合对象
        HashMap<String, Integer> hashMap1 = new HashMap<>();

        //创建key-value键值对,添加到集合中.
        hashMap1.put("陈玉楼", 20);
        hashMap1.put("高跃", 22);

        //小的集合添加到大的集合中
        hashMap.put("jc", hashMap1);

        //创建小的集合对象
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        //创建key-value键值对,添加到集合中.
        hashMap2.put("李杰", 21);
        hashMap2.put("曹石磊", 23);

        //小的集合添加到大的集合中
        hashMap.put("jy", hashMap2);

        //获取大集合的key集合
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            HashMap<String, Integer> hashMap3 = hashMap.get(s);
            System.out.println("我是:" + s + "班");
            Set<String> set1 = hashMap3.keySet();
            for (String s1 : set1) {
                Integer i = hashMap3.get(s1);
                System.out.println("我是"+s1+"-------"+i+"岁");
            }
        }


    }

}
