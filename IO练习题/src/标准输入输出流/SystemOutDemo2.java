package ��׼���������;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by asd on 2016/9/11.
 */

/*
    ת������Ӧ��--�ѱ�׼�����ת�����ַ�������
    ����:
        1:BufferedWriter��һ���ַ�������
        2:PrintStream ps = System.out��һ���ֽ���---Ҳ���Ǳ�׼�����
        3:������Ҫ�õ�ת���� ----OutStreamWriter
        4:OutputStream os = ps;  ----��̬,����ֱ�Ӱ�ps����ת����.
        5:����
            BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
 */
public class SystemOutDemo2 {

    public static void main(String[] args) throws IOException {
        //��������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        //д����
        bw.write("hello");
        bw.newLine();
        bw.write("java");
        bw.newLine();
        bw.write("world");
        bw.flush();

        //�ر���Դ
        bw.close();
    }
}
