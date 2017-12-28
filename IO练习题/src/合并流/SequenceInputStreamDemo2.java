package �ϲ���;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ����:
        ��a.txt,o.txt,ooo.txt������д��Copy.java��
    ����:
        1:���캯��������ҪInputStream�����Enumeration�Ͳ���
        2:Vector��elements���صľ���Enumeration�Ͳ���
        3:����һ��Vector����
        4:��������InputStream����,���뵽Vector���
        5:��ȡVector���������Ԫ��,�õ�Enumeration�͵�����
        6:����SequenceInputStream����
        7:����BufferedOutputStream����
        8:��д����
        9:�ر���Դ


 */

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *  SequenceInputStream(Enumeration<? extends InputStream> e)
 *      �ò�����������������ʱ����Ϊ InputStream ����� Enumeration�Ͳ���.
 */
public class SequenceInputStreamDemo2 {

    public static void main(String[] args) throws IOException {
        //����һ��Vector����
        Vector<InputStream> vector = new Vector<>();

        //����InputStream����
        InputStream inputStream = new FileInputStream("a.txt");
        InputStream inputStream1 = new FileInputStream("o.txt");
        InputStream inputStream2 = new FileInputStream("ooo.txt");

        //��InputStream������뵽Vector
        vector.add(inputStream);
        vector.add(inputStream1);
        vector.add(inputStream2);

        //��ȡVector���������Ԫ��,�õ�����Enumeration������
        Enumeration<InputStream> enumeration = vector.elements();

        //����SequenceInputStream����
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);

        //����BufferedOutputStream����
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Copy2.java"));

        //��д����
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = sequenceInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);

        }

        //�ر���Դ
        sequenceInputStream.close();
        bufferedOutputStream.close();

    }
}
