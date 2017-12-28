package 练习;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        1: ArrayList集合嵌套HashMap集合并遍历。
        2: 假设ArrayList集合的元素是HashMap。有3个。
           每一个HashMap集合的键和值都是字符串。

    结果：
         周瑜---小乔
         吕布---貂蝉

         郭靖---黄蓉
         杨过---小龙女

         令狐冲---任盈盈
         林平之---岳灵珊

    分析:
        1:创建ArrayList对象,元素是HashMap<String,String>
        2:创建HashMap对象
        3:创建元素并添加到HashMap中
        4:HashMap添加到ArrayList中
        5:遍历
            a:按照原来ArrayList遍历
            b:获取key的集合
            c:根据key获取value
 */
public class ArrayListIncludeHashMap {
    public static void main(String[] args) {
        //创建ArrayList对象,元素是HashMap<String,String>
        ArrayList<HashMap<String, String>> list = new ArrayList<>();

        //创建HashMap对象
        HashMap<String, String> hashMap = new HashMap<>();

        //创建元素并添加到HashMap中
        hashMap.put("周瑜", "小乔");
        hashMap.put("吕布", "貂蝉");

        //将HashMap对象添加到ArrayList集合
        list.add(hashMap);

        //创建HashMap对象
        HashMap<String, String> hashMap1 = new HashMap<>();

        //创建元素并添加到HashMap中
        hashMap1.put("郭靖", "黄蓉");
        hashMap1.put("杨过", "小龙女");

        //将HashMap对象添加到ArrayList集合
        list.add(hashMap1);

        //创建HashMap对象
        HashMap<String, String> hashMap2 = new HashMap<>();

        //创建元素并添加到HashMap中
        hashMap2.put("令狐冲", "任盈盈");
        hashMap2.put("林平之", "岳灵珊");

        //将HashMap对象添加到ArrayList集合
        list.add(hashMap2);

        //遍历
        for (HashMap<String, String> map : list) {
            Set<String> set = map.keySet();
            for (String s : set) {
                String value = map.get(s);
                System.out.println(s + "--------" + value);
            }
            System.out.println();


        }



    }
}
