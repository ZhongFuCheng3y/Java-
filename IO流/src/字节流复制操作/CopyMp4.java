package �ֽ������Ʋ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ����F:\��Ӱ����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi��E��

    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��ȡ����Դ������д��Ŀ�ĵ�--ʹ������ķ�ʽ��д
        4:�ر���Դ

 */
public class CopyMp4 {
    public static void main(String[] args) throws IOException {

        //��װ����Դ
        FileInputStream fis = new FileInputStream("F:\\��Ӱ\\����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi");

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("E:\\����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi");

        //��ȡ����Դ������д��Ŀ�ĵ�--��������ķ�ʽ
        byte[] bytes = new byte[1024];
        int len = 0;

        while((len = fis.read(bytes))!=-1) {
            fos.write(bytes,0,len);
        }

        //�ر���Դ
        fis.close();
        fos.close();

    }
}
