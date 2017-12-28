package 二分查找;

/**
 * Created by asd on 2016/9/19.
 */
/*
    二分查找:
        数组要有序
    分析:
        1:定义最大索引和最小索引
        2:计算出中间索引
        3:拿中间索引的值跟要找的值比较
        4:中间索引的值比要找的值大,最大索引就应该是mid-1
        5:中间索引的值比要找的值小,最小索引就应该是mid+1
        6:mid每次查询后,都要发生改变
        7:如果最小索引都比最大索引都要大了,说明这个值是不存在的.
            防止死循环
        口诀:
            1:大了-- 左边找,最大索引变
            2:小了-- 右边找,最小索引变
            3:中间索引每次都要变
            4:要判断最小索引是否比最大索引大

    注意:
        如果给了一个无序的数组,要你查找元素
        你不能把它排序了,再用二分查找元素
        因为你排序了,元素的索引就改变了,你再查找,就没有意义了
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //定义一个数组
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
