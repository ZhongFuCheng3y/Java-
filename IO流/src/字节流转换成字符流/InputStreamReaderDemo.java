package �ֽ���ת�����ַ���;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * InputStreamReader(InputStream is):��Ĭ�ϵı�����ȡ����
 * InputStreamReader(InputStream is, String charsetName):��ָ���ı����ȡ����
 */
public class InputStreamReaderDemo {

    public static void main(String[] args) throws IOException {
        //��������
        //InputStreamReaderDemo isr = new InputStreamReaderDemo(new FileInputStream("fox.txt"));

        //ʹ��UTF-8����
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"),"UTF-8");

        //��ȡ����
        /**
         * һ�ζ�ȡһ���ֽ�
         */
        int by = 0;
        while ((by = isr.read()) != -1) {
            System.out.println((char)by);
        }

        //�ͷ���Դ
        isr.close();
    }
}
