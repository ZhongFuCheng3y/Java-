package ����ĳĿ¼���Ƿ����ĳ�ļ�;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by asd on 2016/9/6.
 */
/*
    1:��ȡ���е�,����,�����ж�,�������������
    2:��ȡ��ʱ���Ѿ�������������,�������

    ��Ҫʵ�ֵ�2�ַ���,����Ҫѧϰһ���ӿ�:�ļ����ƹ�����---FilenameFilter

    �ýӿ���һ��accept()����------����ָ���ļ��Ƿ�Ӧ�ð�����ĳһ�ļ��б���
    ���װѲ����ļ����ļ��е����Ƽ��뵽����,ȡ���ڷ���ֵ��true����false


    1:public String[] list(FilenameFilter filter)
    2:public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo2 {
    public static void main(String[] args) {

        //���ȷ�װe��Ŀ¼
        File file = new File("e:\\");

        //��ȡString����
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {

                //dir - ���ҵ����ļ����ڵ�Ŀ¼
                //name - �ļ�������
                //System.out.println(dir + "----" + name);

                //File file = new File(dir,name);
                //System.out.println(file);

                //���װѲ����ļ����ļ��е����Ƽ��뵽����,ȡ���ڷ���ֵ��true����false
                return new File(dir, name).isFile() && name.endsWith(".txt");
            }
        });
        //��������
        for(String s : strArray) {
            System.out.println(s);
        }
    }
}
