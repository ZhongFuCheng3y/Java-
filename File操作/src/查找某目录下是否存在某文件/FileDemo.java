package ����ĳĿ¼���Ƿ����ĳ�ļ�;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    �ж�E��Ŀ¼���з��к�׺��.txt���ļ�,�����,������ļ�����
    ����:
        1:��װe��Ŀ¼
        2:��ȡ��Ŀ¼�µ��ļ�/�ļ��е�File����
        3:����File����,�õ�ÿһ��File����
        4:�ж�File�����Ƿ����ļ�
            ��:
                �����ж��Ƿ���.txt��β
                    ��:����ļ�����
                    ��:����
            ��:
               ����
 */
public class FileDemo {
    public static void main(String[] args) {

        //��װe��Ŀ¼
        File file = new File("e:\\");

        //��ȡ��Ŀ¼�µ��ļ�/�ļ��е�File����
        File[] fileArray = file.listFiles();

        //����File����,�õ�ÿһ��File����
        for(File f : fileArray) {

            //�ж�File�����Ƿ����ļ�
            if(f.isFile()) {
                //�ж��Ƿ���.txt��β
                if(f.getName().endsWith(".txt")) {
                    System.out.println(f.getName());
                }

            }
        }
    }
}
