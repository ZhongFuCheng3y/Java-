package ��׼���������;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.PrintStream;

/**
 *  ��׼���������
 *      System���е�������Ա����:
 *        1:  public static final InputStream in "��׼������"
 *        2:  public static final PrintStream out "��׼�����"
 *
 *  InputStream is = System.in;
 *  PrintStream ps = System.out;
 */
/*
    ����֪����,������ʵ���Ͼ���IO������,����������ڿ���̨��.
 */
public class SystemOutDemo {
    public static void main(String[] args) {
        System.out.println("helloWorld");

        //��ȡ��׼���������
        PrintStream ps = System.out;
        ps.println("helloWorld");


    }

}
