package ��ӡ��;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *  ��ӡ��:
 *      �ֽڴ�ӡ��: PrintStream
 *      �ַ���ӡ��: PrintWriter
 *  �ص�:
 *      1:ֻ��д���ݵ�,û�ж�ȡ���ݵ�,ֻ�ܲ���Ŀ�ĵ�,���ܲ�������Դ
 *      2:���Բ����������͵�����
 *      3:����������Զ�ˢ��,���ܹ��Զ�ˢ��
 *      4:�����ǿ���ֱ�Ӳ����ı��ļ���.
 */
/*
    ��Щ�������ǿ���ֱ�Ӳ����ı��ļ�����?
        1:FileInputStream
        2:FileOutputStream
        3:FileReader
        4:FileWriter
        5:PrintStream
        6:PrintWriter
        7:��API,��������Ĺ��췽��,���ͬʱ��File���ͺ�String���͵�,һ����˵���ǿ���ֱ�Ӳ����ļ���.
 */

/*
    ��:
        ������:
            �����ܹ�ֱ�Ӷ�д�ļ���.
        �߼���:
            �ڻ����������ṩ��һЩ�����Ĺ���
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws FileNotFoundException {
        //PrintWriter����ΪWriter��������ʹ�õ�.
        PrintWriter pw = new PrintWriter("o.txt");

        pw.write("hello");
        pw.write("world");
        pw.write("java");

        //�ر���Դ
        pw.close();
    }
}
