package ��һ���ַ������򲢴浽�ı��ļ�;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by asd on 2016/9/9.
 */
/*
 * ��֪s.txt�ļ�����������һ���ַ�������hcexfgijkamdnoqrzstuvwybpl��
 * ���д�����ȡ�������ݣ������������д��ss.txt�С�
 */
/*
    ����:
        1:���ַ���ת�����ַ�����
        2:�ַ���������
        3:�ַ�����ת���ַ���
                String ss = new String("chars");
        4:����BufferedWriter����д����
 */
public class StringDemo {
    public static void main(String[] args) throws IOException {

        //���ַ���ת���ַ�����
        String s = "hcexfgijkamdnoqrzstuvwybpl";
        char[] chars = s.toCharArray();

        //�ַ���������
        Arrays.sort(chars);

        //�ַ�����ת�����ַ���
        String ss = new String(chars);
        System.out.println(ss);

        //����BufferedWriter����
        BufferedWriter bw  = new BufferedWriter(new FileWriter("ttt.txt"));

        bw.write(ss);
        bw.newLine();
        bw.flush();

        //�ر���Դ
        bw.close();

    }
}
