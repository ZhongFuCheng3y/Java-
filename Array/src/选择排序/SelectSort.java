package 选择排序;

/**
 * Created by asd on 2016/9/19.
 */
/*

  数组排序之选择排序：
  	    从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = { 24, 69, 80, 57, 13 };
        selectsort1(arr);
        printArray(arr);

    }

    /**
     * 外循环是要比较的次数
     * 每次是拿第i个元素和其他的所有元素相比较.
     *  j = i + 1 是为了节省比较的次数,每循环一次,最小的元素就在数组的前面
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
