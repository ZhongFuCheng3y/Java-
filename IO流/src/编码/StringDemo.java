package ����;

import java.util.Arrays;

/**
 * Created by asd on 2016/9/7.
                */
/*
    1:
        String(byte[] bytes, String charsetName):ͨ��ָ�����ַ��������ַ�����
    2:
        byte[] getBytes(String charsetName):ͨ��ָ�����ַ������ַ�������Ϊ�ַ�����

    ����:
        �ѿ��ö��ı�ɿ�������
        String ---byte[]
    ����:
        �ѿ������ı�ɿ��ö���
        byte[] ---String


    �����������ʵ�ܼ�:
        ֻҪ�������ĸ�ʽ��һ�¾�����.
 */
        public class StringDemo {
            public static void main(String[] args) {
                String s= "���";

                //String ---byte[]
        /**
         * Ĭ�ϵı�����GBK
         */
        byte[] bytes = s.getBytes();
        //[-60, -29, -70, -61]
        System.out.println(Arrays.toString(bytes));

        //byte[] --- String
        String ss = new String(bytes);
        System.out.println(ss);

    }
}
