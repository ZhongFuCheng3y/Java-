package 斐波那契数列;

/**
 * Created by asd on 2016/9/7.
 */
/*
    有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
    假如兔子都不死，问第二十个月的兔子对数为多少？

    规律:             兔子对数
        第1个月:           1
        第2个月:           1
        第3个月:           2
        第4个月:           3
        第5个月:           5
        第6个月:           8
        第7个月:           13
    每第3个月起每个月都生一对兔子,慢慢算

    规律:
        1:从第三项开始,每一项都是前两项之和
        2:前两项是已知的

    方法:
        1:数组实现
        2:变量的变化实现
        3:递归实现

    变量的变化:
        第1个相邻的数据: a=1,b=1
        第2个相邻的数据: a=1,b=2
        第3个相邻的数据: a=2,b=3
        第4个相邻的数据: a=3,b=5
    规律:下一次的a就是以前的b,下一次的b就是以前的a+b;
 */
public class DiGuiDemo {

    public static void main(String[] args) {
        //数组实现
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        //从第3位数开始,也就是数组下标的2
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        //第二十个月,也就是下标为19的元素
        System.out.println(arr[19]);
        System.out.println("----------------------");

        //--------------------------------------------------------------

        //变量的变化实现
        int a = 1;
        int b = 1;
        //i<18,因为前面两个已经被拿走了
        for (int i = 0; i < 18; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(b);
        System.out.println("----------------------------");


        //---------------------------------------------------------------------


        shenTu(20);

    }

    //递归的实现
    public static int shenTu(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return shenTu(n - 1) + shenTu(n - 2);
        }
    }
}

