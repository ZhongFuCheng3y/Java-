package ������IO�Ĳ���;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        ���ı��ļ��ж�ȡ����,д��������,����������.
    ����:
        1:����Դ��һ���ı��ļ�--BufferedReader
        2:Ŀ�ĵ���һ������
        3:ÿ�õ��ı��ļ���һ������,��д��������

 */
public class FileToArrayListDemo {


    public static void main(String[] args) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //��װĿ�ĵ�--����
        ArrayList<String> list = new ArrayList<>();

        //ȡ���ı��ļ�������,д��������
        String line = null;
        while((line = br.readLine())!=null) {
            list.add(line);
        }

        //�ر���Դ
        br.close();

        //��������
        for(String s : list) {
            System.out.println(s);
        }
    }
}
