package ������IO�Ĳ���;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        ��ArrayList�����е��ַ����洢���ı��ļ���
    ����:

        1:�ı��ļ�---�ַ���
        2:��������,ȡ��ÿһ��Ԫ��,��Ԫ��д���ļ���

 */
public class ArrayListToFileDemo {
    public static void main(String[] args) throws IOException {
        //��װArrayList�е�����
        //ArrayList�����е�Ԫ�ؾ�������Դ
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("o.txt"));

        //��������,ȡ��ÿ��Ԫ��,��Ԫ��д���ļ���
        for (String s : list) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }
        //�ر���Դ
        bw.close();


    }
}
