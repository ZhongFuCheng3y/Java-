package ѡ������;

/**
 * Created by asd on 2016/9/19.
 */
/*

  ��������֮ѡ������
  	    ��0������ʼ�����κͺ���Ԫ�رȽϣ�С����ǰ�ţ���һ����ϣ���Сֵ����������С������
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = { 24, 69, 80, 57, 13 };
        selectsort1(arr);
        printArray(arr);

    }

    /**
     * ��ѭ����Ҫ�ȽϵĴ���
     * ÿ�����õ�i��Ԫ�غ�����������Ԫ����Ƚ�.
     *  j = i + 1 ��Ϊ�˽�ʡ�ȽϵĴ���,ÿѭ��һ��,��С��Ԫ�ؾ��������ǰ��
     */
    private static void selectsort1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }
    public static void printArray(int[] arr) {
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
