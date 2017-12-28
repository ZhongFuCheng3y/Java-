package FileInputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*
    �ֽ���������������:
        1:�����ֽ�����������
        2:����read()��ȡ����,������������ڿ���̨��
        3:�ر���Դ
 */

import java.io.FileInputStream;
import java.io.IOException;

/**
 *  ��ȡ��ʽ:
 *       1:int read():һ�ζ�ȡһ���ֽ�
 *       2:int read(Byte[] b):һ�ζ�ȡһ���ֽ�����
 */
public class FileInputStreamDemo {

    public static void main(String[] args) throws IOException {

        //�����ֽ�����������
        FileInputStream fis = new FileInputStream("fos.txt");

        //����read()������ȡ����
        /**
         *  1:����read()����һ��ֻ��ȡһ���ֽ�,����������whileѭ���Ľ�
         *  2:read()��������ֵ��int����,����Ҫת����char����--���������,���޷�ʶ��,�����������ֽ������ɵ�,��һ��һ������.
         *  3:��ȡ�����������-1,��ô˵���Ѿ������ļ���ĩβ��.
         */
        int by = 0;
        while((by = fis.read())!= -1) {
            System.out.println((char)by);
        }

        //�ر���Դ
        fis.close();
    }
}
