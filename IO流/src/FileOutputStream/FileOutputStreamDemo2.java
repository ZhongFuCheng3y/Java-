package FileOutputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ����:
        1:�����ֽ����������
        2:����write()����
        3:�ر���Դ

 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * write()����:
 * 1:public void write(int b):дһ���ֽ�
 * 2:public void write(byte[] b):дһ���ֽ�����
 * 3:public void write(byte[] b, int off, int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo2 {

    public static void main(String[] args) throws IOException {

        //�����ֽ����������
        FileOutputStream fos = new FileOutputStream("fos.txt");

        //����write()����
        fos.write(97);//---�ײ��Ƕ���������,ͨ�����±���,�ҵ�97��Ӧ��ֵ��a

        //public void write(byte[] b):дһ���ֽ�����
        byte[] bytes = {97, 98, 99, 100, 101};
        fos.write(bytes);

        //public void write(byte[] b,int off, int len):дһ�������һ����
        fos.write(bytes, 0, 2);

        //�ͷ���Դ
        fos.close();

    }
}
