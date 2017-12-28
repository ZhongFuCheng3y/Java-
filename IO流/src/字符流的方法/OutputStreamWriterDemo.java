package �ַ����ķ���;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * public void write(int c):дһ���ַ�
 * public void write(char[] char):дһ���ַ�����
 * public void write(char[] char,int off, int len):дһ���ַ������һ����
 * public void write(String):дһ���ַ���
 * public void write(String str, int off, int len):дһ���ַ�����һ����
 */
/*
    close()��flush()������:
        1:close()�ر�������,������ˢ��һ�λ�����,�ر�֮��,������Ͳ�����ʹ����.
        2:flush()����ˢ�»�����,ˢ��֮��,�������ǿ���ʹ�õ�.
 */
/*
    writer()����ʱ,������ǲ�ˢ��һ��,����д����ȥ
        1: �ļ������ݴ洢�Ļ�����λ���ֽ�
        2: 1���ַ� = 2���ֽ�
        3: ���ǿ�������,һ���ֽ��ǿ��Խ�ȥ��,����д���ַ�ʱ,���Ϳ�ס��.��Ҫ����flush()һ��
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //��������
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fox.txt"));

        //дһ���ַ�
        //osw.write(97);

        //дһ���ַ�����
        char[] chars = {97, 98, 99};
        osw.write(chars);

        //дһ���ַ������һ����
        // osw.write(chars,0,2);

        //дһ���ַ���
        // osw.write("Nice��");

        //дһ���ַ�����һ����
        //osw.write("String",0,2);

        //�ر���Դ
        osw.close();

    }

}
