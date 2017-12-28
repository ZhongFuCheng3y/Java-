package 了解Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
 *需求：
 *      假设HashMap集合的元素是ArrayList。有3个。
 *      每一个ArrayList集合的值是字符串。
 *
 *结果：
 *	 三国演义
 *		 	吕布
 *		 	周瑜
 *	 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *	 神雕侠侣
 *		 	郭靖
 *		 	杨过
 */
/*
    分析:
        1:创建大HashMap对象
        2:创建ArrayList对象
        3:创建元素并添加到ArrayList对象中
        4:遍历集合
            a:获取HashMap集合中的所有key
            b:根据key获取value
            c:value是一个ArrayList集合
            d:按照ArrayList集合来遍历

 */
public class HashMapIncludeArrayList {
    public static void main(String[] args) {
        //创建大的HashMap对象
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        //创建小的ArrayList对象
        ArrayList<String> list = new ArrayList<>();

        //创建元素并添加到集合中
        list.add("吕布");
        list.add("周瑜");

        //将ArrayList对象,以及书名添加到HashMap集合中
        hashMap.put("三国演义", list);

        //创建小的ArrayList对象
        ArrayList<String> list2 = new ArrayList<>();

        //创建元素并添加到集合中
        list2.add("令狐冲");
        list2.add("林平之");

        //将ArrayList对象,以及书名添加到HashMap集合中
        hashMap.put("笑傲江湖", list2);


        //创建小的ArrayList对象
        ArrayList<String> list3 = new ArrayList<>();

        //创建元素并添加到集合中
        list3.add("郭靖");
        list3.add("杨过");

        //将ArrayList对象,以及书名添加到HashMap集合中
        hashMap.put("神雕侠侣", list3);

        //HashMap获取key的集合
        Set<String> set = hashMap.keySet();
        for (String s : set) {
            System.out.println(s);
            ArrayList<String> arrayList = hashMap.get(s);
            for (String s1 : arrayList) {
                System.out.println(s1);
            }
        }
    }

}
