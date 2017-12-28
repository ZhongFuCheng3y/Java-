package ���ֲ���;

/**
 * Created by asd on 2016/9/19.
 */
/*
    ���ֲ���:
        ����Ҫ����
    ����:
        1:���������������С����
        2:������м�����
        3:���м�������ֵ��Ҫ�ҵ�ֵ�Ƚ�
        4:�м�������ֵ��Ҫ�ҵ�ֵ��,���������Ӧ����mid-1
        5:�м�������ֵ��Ҫ�ҵ�ֵС,��С������Ӧ����mid+1
        6:midÿ�β�ѯ��,��Ҫ�����ı�
        7:�����С�����������������Ҫ����,˵�����ֵ�ǲ����ڵ�.
            ��ֹ��ѭ��
        �ھ�:
            1:����-- �����,���������
            2:С��-- �ұ���,��С������
            3:�м�����ÿ�ζ�Ҫ��
            4:Ҫ�ж���С�����Ƿ�����������

    ע��:
        �������һ�����������,Ҫ�����Ԫ��
        �㲻�ܰ���������,���ö��ֲ���Ԫ��
        ��Ϊ��������,Ԫ�ص������͸ı���,���ٲ���,��û��������
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //����һ������
        int[] arr = {11, 22, 33, 44, 55, 66, 77};

        int number = search1(arr, 33);
        System.out.println(number);


    }

    private static int search1(int[] arr, int value) {
        int maxIndex = arr.length - 1;
        int minIndex = 0;
        int midIndex = (maxIndex + minIndex) / 2;
        while (true) {
            if (arr[midIndex] == value) {
                break;
            } else if (arr[midIndex] > value) {
                maxIndex = midIndex - 1;
            } else if (arr[midIndex] < value) {
                minIndex = midIndex + 1;
            }
            if (minIndex > maxIndex) {
                return -1;
            }
            midIndex = (maxIndex + minIndex) / 2;
        }

        return midIndex;

    }
}
