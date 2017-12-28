package ��ϰ;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        "aababcabcdabcde",��ȡ�ַ�����ÿһ����ĸ���ֵĴ���Ҫ����:a(5)b(4)c(3)d(2)e(1)
    ����:
        1:����һ���ַ���
        2:����һ��TreeMap����
            ��:Character
            ֵ:Integer
        3:���ַ���ת�����ַ�����
        4:�����ַ�����,�õ�ÿһ���ַ�
        5:�õ��ַ���Ϊ��ȥ��ֵ
            ����null:
                �ü�������,���ַ���Ϊ��,1��Ϊֵ����
            ����null:
                �ü�����,���ַ���Ϊ��,ֵ��1
        6:�����ַ�������������
        7:��������,�õ�����ֵ,������Ŀ����ƴ��
        8:���ַ���������ת��Ϊ�ַ���
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //����һ���ַ���
        String s = "jkljklkljkljffffff";

        //����һ��TreeMap����
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        //���ַ���ת�����ַ�����
        char[] chars = s.toCharArray();

        //�����ַ�����,�õ�ÿһ���ַ�
        for (char c : chars) {
            Integer integer = treeMap.get(c);
            if (integer == null) {
                treeMap.put(c, 1);
            } else {
                treeMap.put(c, ++integer);
            }
        }

        //�����ַ���������
        StringBuilder sb = new StringBuilder();

        //��������,�õ�����ֵ
        Set<Character> set = treeMap.keySet();
        for (Character character : set) {
            Integer integer = treeMap.get(character);
            sb.append(character).append("(").append(integer).append(")");
        }
        String ss = sb.toString();
        System.out.println(ss);
    }
}
