package StringBuffer��ϰ;

import java.util.Scanner;

/**
 * Created by asd on 2016/9/19.
 */
/*
    ����:
        ���ַ������з�ת
    ����:
        1:���ǿ���ʹ��String���з�ת
            ֻҪ��String���ű����Ϳ�����
        2:����Ҳ������StringBuffer����ɹ���
            ����reverse()
        3:��ȻStringBuffer����
 */
public class StringBufferTest2 {
    public static void main(String[] args) {
        //����¼������1
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������һ���ַ���:");
        String s = scanner.nextLine();

        String ss = fanzhuan(s);
        System.out.println(ss);
    }

    private static String fanzhuan(String s) {

        return new StringBuffer(s).reverse().toString();
    }

}
