package ð������;

/**
 * Created by asd on 2016/9/19.
 */
/*
    ð������˼��:
        ���ڵ�Ԫ�������Ƚ�,����������,��һ�����,����ֵ������������
 */
public class BubbleSort {
    public static void main(String[] args) {
        //����һ������
        int[] arr = {24, 69, 80, 57, 13};
        /**
         *  ��ѭ���Ƚϵ��Ǵ���
         *  arr.length -1 Ԫ��ֻ��Ҫ���˵�����2���͹���,��ֹ����Խ��
         *  arr.length -1 - i ���ٱȽϵĴ���,ÿ�Ƚ���һ��,����Ԫ�ؾ�������������
         */
        buble(arr);
        printArray(arr);


    }

    private static void buble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void printArray ( int[] arr){
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x]);
            } else {
                System.out.print(arr[x] + ", ");
            }
        }
        System.out.println("]");
    }

}


