package ��ȡ����;

/**
 * Created by asd on 2016/9/18.
 */
/*
    ����:
        ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���

    ����:
        1:������������,�ֱ�������ǳ��ֵĴ���
        2:�����ַ���,�ж���ʲôԪ��
        3:����++
 */

public class StringTest2 {
    public static void main(String[] args) {
        String s = "fsdafs22MMM";

        int number = 0;
        int zifu = 0;
        int daxie = 0;

        for (int i = 0; i < s.length(); i++) {
            char ss = s.charAt(i);
            if (ss >= '0' && ss <= '9') {
                number++;
            } else if (ss >= 'a' && ss <= 'z') {
                zifu++;
            } else if (ss >= 'A' && ss <= 'Z') {
                daxie++;
            }else{
                System.out.println("��д����ʲô");

            }

        }

        System.out.println("��д:"+daxie);
        System.out.println("Сд:"+zifu);
        System.out.println("����:"+number);

    }
}
