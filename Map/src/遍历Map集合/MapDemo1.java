package 遍历Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    Map遍历有两种方式
        1:获取集合所有的键,根据键获取值
        2:获取集合的键值对对象,分别获取键和值

    方式1:
        1:创建Map集合对象
        2:创建元素并添加到集合中
        3:获取集合中所有的键
        4:遍历集合中的键,根据键获取值.
 */
public class MapDemo1 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();

        //创建元素并添加到集合中
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");

        //获取集合中所有的键
        Set<String> set = map.keySet();

        //遍历所有的键,根据键获取值
        for (String s : set) {
            String value = map.get(s);
            System.out.println("key:" + s + "::" + "value:" + value);
        }


    }
}
