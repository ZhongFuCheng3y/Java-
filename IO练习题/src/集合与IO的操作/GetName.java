package ������IO�Ĳ���;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        ����һ���ı��ļ��洢��һЩ����,������������õ�ĳ���˵�����
    ����:
        1:��װ����Դ--�ı��ļ�--BufferReader
        2:Ԫ����String,������һ��������װ,ArrayList
        3:��װĿ�ĵ�--ArrayList
        4:��ȡ�ļ�������,д��ArrayList��
        5:�������һ������,���������õ�����
        6:����������ֵķ�Χ����ArrayList��size
 */
public class GetName {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("PersonName.txt"));

        //��װĿ�ĵ�
        ArrayList<String> list = new ArrayList<>();

        //��ȡ�ļ�������,���뵽������
        String line = null;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }

        //�ر���Դ
        br.close();

        //�������һ������
        Random random = new Random();
        int index = random.nextInt(list.size());

        //���������õ�����
        String s = list.get(index);
        System.out.println("������Ǹ���ù����:" + s);




    }
}
