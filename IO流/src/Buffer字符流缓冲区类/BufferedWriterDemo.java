package Buffer�ַ�����������;

/**
 * Created by asd on 2016/9/8.
 */
/*
    �ַ���Ϊ�˸�Ч��д,Ҳ�ṩ�˶�Ӧ���ַ���������
    1:BufferedWriter
    2:BufferedReader
 */
/*
    BufferedWriter:�ַ����������
    1:���ı��ļ�д���ַ������,��������ַ�,�Ӷ���ߵ����ַ�,����,�ַ����ĸ�Ч��д
    2:��������Сһ������ʹ��Ĭ�ϵľ��㹻��
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * BufferedWriter(Writer out)
 * ��������:
 *      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
 *      new FileOutputStream("a.txt")
 * ����֪��,FileWriter��OutputStreamWriter + �����
 * ����:
 *      BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt")
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {

        //�����������������
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //д����
        bw.write("hello");
        bw.write("world");
        bw.write("java");
        bw.write("ni hao a ");
        bw.flush();

        //�ر���Դ
        bw.close();

    }
}
