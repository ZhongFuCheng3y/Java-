package ���ַ����е��ַ�����;

import java.util.Arrays;

/**
 * Created by asd on 2016/9/19.
 */
/*
    ����:
        ���ַ����е��ַ���������
  		������"dacgebf"
  		�����"abcdefg"
    ����:
        1:���ַ���ת�����ַ�����
        2:���ַ���������
        3:�ַ�����ת���ַ���
        4:����ַ���
 */
public class ArrayTest {
    public static void main(String[] args) {
        //���ַ���ת�����ַ�����
        String s = "dacgebf";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String ss = String.valueOf(chars);

        System.out.println(ss);

    }
}
