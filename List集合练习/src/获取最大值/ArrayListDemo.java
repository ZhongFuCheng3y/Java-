package ��ȡ���ֵ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ����:
        ����¼�������ݣ���0������Ҫ���ڿ���̨������������е����ֵ
    ����:
        1:����¼������
        2:��������ӵ�������
        3:�ж������Ƿ�Ϊ0
        4:������ת�������
            a:����Ҫ��һ����������
            b:toArray()
        5:����������
        6:ȡ���������һ��Ԫ��
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //����һ�����϶���
        ArrayList<Integer> integers = new ArrayList<>();

        //����¼������
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("����������:");
            int i = scanner.nextInt();

            //������ݵ�������
            integers.add(i);

            //�ж������Ԫ���Ƿ�Ϊ0
            if (i == 0) {
                break;
            }

        }

        //������ת��������
            //a:��������
        Integer[] integers1 = new Integer[integers.size()];

            //b:toArray()
        integers.toArray(integers1);

        //�������������
        Arrays.sort(integers1);

        //ȡ���������һ��Ԫ��
        System.out.println("����������ֵ��:"+ integers1[integers1.length-1]);




    }
}
