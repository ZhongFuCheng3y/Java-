package Buffer�ֽ�����������;

/**
 * Created by asd on 2016/9/7.
 */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * BufferedOutputStreamDemo
 *      BufferedOutputStreamDemo(OutputStream)
 * BufferedInputStream
 *      BufferedInputStream(InputStream)
 */
/*
    ԭ��:
        ��������ķ�ʽ��д�����Ѿ����㲻��������
    ���:
        Ϊ���������,java�ṩ�˴����������ֽ���

    Ҫ��:
        1:���췽������ָ����������С,������һ�㲻��,��ΪĬ�ϵĻ�������С�Ѿ��㹻��
        2:Ϊʲô���췽��������һ��������ļ����ļ�·��,���Ǵ���һ��OutputStream������?
            ��Ϊ�ֽڻ������������ṩ������,Ϊ��Ч����Ƶ�,����,�����Ķ�д������������������������.
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //����һ��BufferedOutputStream����---��Ч�ֽ���
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("a.txt"));

        //д����
        bufferedOutputStream.write("hello".getBytes());

        //�ر���Դ
        bufferedOutputStream.close();
    }
}
