package ��ȡ����2;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;

/**
 * public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
 * public File[] listFiles:��ȡָ��Ŀ¼�µ������ļ������ļ��е�File����
 */
public class FileDemo {

    public static void main(String[] args) {
        //ָ��һ��Ŀ¼
        File file = new File("e:\\");

        //��ȡ����
        String[] strArray = file.list();
        for(String s : strArray) {
            System.out.println(s);
        }
        System.out.println("---------------------------");
        //----------------------------

        //��ȡFile����
        File[] fileArray= file.listFiles();
        for(File f : fileArray) {
            System.out.println(f.getName());
        }
    }
}
