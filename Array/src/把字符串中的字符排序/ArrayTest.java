package 把字符串中的字符排序;

import java.util.Arrays;

/**
 * Created by asd on 2016/9/19.
 */
/*
    需求:
        把字符串中的字符进行排序。
  		举例："dacgebf"
  		结果："abcdefg"
    分析:
        1:把字符串转化成字符数组
        2:对字符数组排序
        3:字符数组转成字符串
        4:输出字符串
 */
public class ArrayTest {
    public static void main(String[] args) {
        //把字符串转换成字符数组
        String s = "dacgebf";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String ss = String.valueOf(chars);

        System.out.println(ss);

    }
}
