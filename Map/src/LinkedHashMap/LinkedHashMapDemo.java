package LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    LinkedHashMap:
        1:是Map接口的哈希表和链表实现,具有可预知的迭代顺序
        2:哈希表保证键的唯一性
        3:链表保证有序(存储和取出的循序一致)

 */

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        //创建并添加元素
        map.put("2345", "hello");
        map.put("1234", "world");
        map.put("3456", "java");
        map.put("1234", "javaee");
        map.put("3456", "android");

        //遍历
        Set<String> set = map.keySet();
        for (String s : set) {
            String value = map.get(s);
            System.out.println(s + "---" + value);
        }
    }
}
