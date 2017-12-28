package FileOutputStream;

/**
 * Created by asd on 2016/9/7.
 */
/*

     ����:
        ����Ҫ���ı��ļ�����һ�仰
     ����:
        1:�����ı��ļ�һ�仰,����Ӧ�ò��õ����ַ���,����ֻ����1��,���Ǿ��������ֽ���
        2:���ı��ļ�����,���ǿ����뵽File
        3:���������API����:FileOutputStream
 */

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  ���췽��:
 *          FileOutputStream(File file)
 *          FileOutputStream(String name)
 */
/*
    �ֽ��������������:
        1:�����ֽ����������
        2:д����
        3:�ͷ���Դ
 */
public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        //�����ֽ����������
        FileOutputStream fos = new FileOutputStream("fos.txt");
        /**
         * �����ֽ�������������˼�����
         *      1:����ϵͳ����ȥ�����ļ�
         *      2:����fos����
         *      3:��fos����ָ������ļ�
         */

        //д����
        fos.write("hello,IO".getBytes());
        fos.write("java".getBytes());

        //�ر���Դ
        fos.close();
    }
}
