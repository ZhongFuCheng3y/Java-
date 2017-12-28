package 遍历Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    方式2:
        1:创建集合对象
        2:创建元素并添加到集合中
        3:获取键值对对象
        4:遍历键值对对象
        4:根据键值对对象分别获取键和值
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<>();

        //创建元素并添加到集合中
        map.put("杨过", "小龙女");
        map.put("郭靖", "黄蓉");
        map.put("杨康", "穆念慈");
        map.put("陈玄风", "梅超风");

        //获取键值对对象
        Set<Map.Entry<String, String>> set = map.entrySet();

        //遍历键值对对象,根据键值对对象分别获取键和值
        for (Map.Entry<String, String> entry : set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:" + key + "value:" + value);

        }
    }
}
