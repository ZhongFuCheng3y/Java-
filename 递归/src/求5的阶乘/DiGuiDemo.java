package 求5的阶乘;

/**
 * Created by asd on 2016/9/7.
 */
/*
    求5的阶乘:
        1: 5! = 1*2*3*4*5
        2: 5! = 5*4!

    我们有两种方法实现:
        1:循环实现
        2:递归实现
            1:做一个递归要写一个方法
            2:出口条件
            3:规律
 */
public class DiGuiDemo {
    public static void main(String[] args) {

        //用循环实现
        int jc = 1;
        for (int i = 2; i <= 5; i++) {
            jc *= i;
        }
        System.out.println("5的阶乘是:" + jc);

        System.out.println("5的阶乘是:" + jieCheng(5));

    }

    //用递归实现
    public static int jieCheng(int n) {
        //出口
        if (n == 1) {
            return 1;
        } else {
            return n*jieCheng(n-1);
        }
    }
}
