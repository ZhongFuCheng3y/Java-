package ��ȡ10�������;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        ��ȡ10��0~20�������
    ����:
        1:����Random����
        2:����һ�����϶���
        3:����һ��ͳ�Ʊ���
        4:�ж�ͳ�Ʊ����Ƿ�С��10
        5:���������
            �жϼ����Ƿ������Ԫ��
                  ��:������
                  û��:���

        6:��������

 */
public class RandomDemo {

    public static void main(String[] args) {
        //����Random����
        Random random = new Random();

        //����һ�����϶���
        ArrayList<Integer> integers = new ArrayList<>();

        //����һ��ͳ�Ʊ���
        int count = 0;
        while (count < 10) {
            int number = random.nextInt(20);
            if (!integers.contains(number)) {
                integers.add(number);
                count++;
            }
        }

        //��������
        for (Integer integer : integers) {
            System.out.println(integer);

        }
    }
}
