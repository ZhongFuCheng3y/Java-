package ��5�Ľ׳�;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ��5�Ľ׳�:
        1: 5! = 1*2*3*4*5
        2: 5! = 5*4!

    ���������ַ���ʵ��:
        1:ѭ��ʵ��
        2:�ݹ�ʵ��
            1:��һ���ݹ�Ҫдһ������
            2:��������
            3:����
 */
public class DiGuiDemo {
    public static void main(String[] args) {

        //��ѭ��ʵ��
        int jc = 1;
        for (int i = 2; i <= 5; i++) {
            jc *= i;
        }
        System.out.println("5�Ľ׳���:" + jc);

        System.out.println("5�Ľ׳���:" + jieCheng(5));

    }

    //�õݹ�ʵ��
    public static int jieCheng(int n) {
        //����
        if (n == 1) {
            return 1;
        } else {
            return n*jieCheng(n-1);
        }
    }
}
