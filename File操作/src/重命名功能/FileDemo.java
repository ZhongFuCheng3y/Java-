package ����������;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;

/**
 * public boolean renameTo(File dest)
 */
/*
    Ҫ��:
        1:·������ͬ,����
        2:·������ͬ,����������
        3:����·��:���̷���ʼ
        4:���·��:�����̷���ʼ
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {

        //����һ���ļ�����
        File file = new File("a.txt");
        file.createNewFile();

        //��Ҫ�޸�����ļ�����b.txt
        //File newFile = new File("b.txt");
        //System.out.println("renameTo:" +file.renameTo(newFile));

        //--------------------------------------------------------
        File file2 = new File("a.txt");
        File newFile2 = new File("e:\\b.txt");
        System.out.println("renameTo:" + file2.renameTo(newFile2));

    }
}
