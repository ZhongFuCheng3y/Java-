package ��׼���������;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * System.in ��׼������,�ǴӼ��̻�ȡ���ݵ�
 * InputStream is = System.in;
 */
/*
    ����¼������:
        1:main()��args���ղ���
        2:Scanner(JDK5�Ժ�)
            Scanner sc = new Scanner(System.in);
            String SystemOutDemo2 = sc.nextLine();
            int x = sc.nextInt();
        3:ͨ���ַ���������װ��׼������ʵ��
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
/*
    ��׼���������һ�λ�ȡһ������
        1:����֪��,readLine()������BufferedReader����
        2:BufferedReader�ǲ����ַ���
        3:������Ҫ�õ�ת����---InputStreamReader
        4:����:
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //��������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        System.out.println("������һ���ַ���:");
        line = br.readLine();
        System.out.println(line);

        System.out.println("������һ������");
        line = br.readLine();
        System.out.println(line);

    }


}
