package ��ϰ;

/**
 * Created by asd on 2016/9/18.
 */
/*
 * ͳ�ƴ���С�����ֵĴ���
 * ������
 * 		���ַ���"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * �����
 * 		java������5��
 *
 * ����:
 	*   1:��ȡ����java���±�,�±�+3��ȡ�ַ���
 	*   2:ѭ����������-1
 *
 */
public class StringTest2 {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";

        /*
        int count = 0;
        while (true) {
            int i = 0;
            i = s.indexOf("java");
            if (i != -1) {
                count++;
                s = s.substring(i + 3);
            } else {
                break;
            }
        }
        */

        /**
         * �򻯰��
         */
        int index=0;
        int count=0;
        //�Ȳ飬��ֵ���ж�
        while((index=maxString.indexOf(minString))!=-1){
            count++;
            maxString = maxString.substring(index + minString.length());
        }

        System.out.println(count);
    }
}
