package StringBuffer��ϰ;

import java.util.Scanner;

/**
 * Created by asd on 2016/9/19.
 */
/*
    ����:
        �ж�һ���ַ����Ƿ��ǶԳ��ַ���
        ����"abc"���ǶԳ��ַ�����"aba"��"abba"��"aaa"��"mnanm"�ǶԳ��ַ���
    ����:
        1:���ǿ��Ա���String,�����һ���ַ�����ǰ���һ���ַ��Ƚ�
        2:����Ҳ����ʹ��StringBuffer�ķ�ת����,ֻҪ��ת����ַ�����ͬ��,��ô���ǶԳ��ַ���
 */
public class StringBuffer3 {
    public static void main(String[] args) {
        //����¼������
        Scanner scanner = new Scanner(System.in);
        System.out.println("������������:");
        String s = scanner.nextLine();

        Boolean b = isSame(s);
        System.out.println(b);
    }

    private static boolean isSame(String s) {
        return new StringBuffer(s).reverse().toString().equals(s);
    }

}
