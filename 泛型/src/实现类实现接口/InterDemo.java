package ʵ����ʵ�ֽӿ�;

/**
 * Created by asd on 2016/9/17.
 */
public class InterDemo {
    public static void main(String[] args) {
        //���Ե�һ�����
        //Inter<String> i = new InterImpl();
        // i.show("hello");

        //�ڶ����������
        Inter<String> ii = new InterImpl<>();
        ii.show("100");


    }
}
