package Buffer�ַ�����������;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        //�����ַ�����������
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        //��ȡ����--ʹ������ķ�ʽ
        char[] chars = new char[1024];
        int len = 0;
        while ((len = br.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        br.close();


    }
}
