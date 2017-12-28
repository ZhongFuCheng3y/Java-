package ���������;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by asd on 2016/9/11.
 */

/*
    ���������:
        1:��������,��Object�������
        2:�ں���InputStream��OutputStream�Ĺ���
        3:֧�ֶ��ļ���������ʵĶ�ȡ��д��

    public RandomAccessFile(String name, String mode)
        ��һ���������ļ�·��,�ڶ��������ǲ����ļ���ģʽ

    ģʽ��4��,�����"rw", ���ַ�ʽ����д���ݺͶ�����

    �ļ�ָ�������ֽ�Ϊ��λ��
        ����:100,ָ���λ�þ���4
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {

        write();
        read();
    }

    private static void read() throws IOException {

        //�����������������
        RandomAccessFile raf = new RandomAccessFile("raf1.txt", "rw");

        //��ȡ����
        int i  = raf.readInt();
        System.out.println(i);
        System.out.println(raf.getFilePointer());

        char ch = raf.readChar();
        System.out.println(ch);
        System.out.println(raf.getFilePointer());



    }

    private static void write() throws IOException {

        //�����������������
        RandomAccessFile raf = new RandomAccessFile("raf1.txt", "rw");

        raf.writeInt(100);
        raf.writeChar('a');


    }


}
