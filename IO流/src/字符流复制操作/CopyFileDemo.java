package �ַ������Ʋ���;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        �ѵ�ǰĿ¼��fox.txt���Ƶ���ǰĿ¼��aaa.txt
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��ȡ����Դ������д��Ŀ�ĵ�
        4:�ر���Դ
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        //��װ����Դ
        InputStreamReader isr = new InputStreamReader(new FileInputStream("fox.txt"));

        //��װĿ�ĵ�
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa.txt"));

        //��ȡ����Դ������д��Ŀ�ĵ�
        char[] chars = new char[1024];
        int len = 0;
        while((len = isr.read(chars)) != -1) {
            osw.write(chars,0,len);
            osw.flush();
        }

        //�ر���Դ
        osw.close();
        isr.close();
    }
}
