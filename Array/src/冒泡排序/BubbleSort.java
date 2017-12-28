package 冒泡排序;

/**
 * Created by asd on 2016/9/19.
 */
/*
    冒泡排序思想:
        相邻的元素两两比较,大的往后面放,第一次完毕,最大的值出现在索引处
 */
public class BubbleSort {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {24, 69, 80, 57, 13};
        /**
         *  外循环比较的是次数
         *  arr.length -1 元素只需要到了倒数第2个就够了,防止数组越界
         *  arr.length -1 - i 减少比较的次数,每比较完一次,最大的元素就在数组的最后了
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


