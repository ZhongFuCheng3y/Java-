package 练习;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
    分析:
        1:定义一个字符串
        2:定义一个TreeMap集合
            键:Character
            值:Integer
        3:把字符串转换成字符数组
        4:遍历字符数组,得到每一个字符
        5:拿到字符作为键去找值
            返回null:
                该键不存在,把字符作为键,1作为值传入
            不是null:
                该键存在,把字符作为键,值加1
        6:定义字符串缓冲区变量
        7:遍历集合,得到键和值,按照题目进行拼接
        8:把字符串缓冲区转换为字符串
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "jkljklkljkljffffff";

        //定义一个TreeMap集合
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        //把字符串转换成字符数组
        char[] chars = s.toCharArray();

        //遍历字符数组,得到每一个字符
        for (char c : chars) {
            Integer integer = treeMap.get(c);
            if (integer == null) {
                treeMap.put(c, 1);
            } else {
                treeMap.put(c, ++integer);
            }
        }

        //定义字符串缓冲区
        StringBuilder sb = new StringBuilder();

        //遍历集合,得到键和值
        Set<Character> set = treeMap.keySet();
        for (Character character : set) {
            Integer integer = treeMap.get(character);
            sb.append(character).append("(").append(integer).append(")");
        }
        String ss = sb.toString();
        System.out.println(ss);
    }
}
