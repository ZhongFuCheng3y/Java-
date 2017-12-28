package �ַ����ķ���;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader��ȡ����:
 * int read():һ�ζ�ȡһ���ַ�
 * int read(char[] chars):һ�ζ�ȡһ���ַ�����
 */

public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //��������
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"));

        //һ�ζ�ȡһ���ַ�
        int ch = 0;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }

        //һ�ζ�ȡһ���ַ�����
        //char[] chars = new char[1024];
        //int len = 0;
        //while((len = isr.read(chars)) != -1) {
        //    System.out.println(new String(chars,0,len));
        //}

        //�ͷ���Դ
        isr.close();



    }
}
