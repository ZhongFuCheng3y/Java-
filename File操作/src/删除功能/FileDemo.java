package ɾ������;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;

/**
 * public boolean delete()
 */
/*
    Ҫ��:
        1:����㴴���ļ����ļ�������д�̷�·��,��ô,Ĭ������Ŀ·��
        2:javaɾ�����߻���վ
        3:ɾ��һ���ļ���,��ע����ļ����ܰ����ļ����ļ���
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        //�����ļ�
        File file = new File("a.txt");
        System.out.println("createNewFile:" + file.createNewFile());

        File file2 = new File("aaa\\bbb\\ccc");
        System.out.println("mkdirs: " + file2.mkdirs());

        //��Ҫɾ��a.txt����ļ�
        //ֱ��ʹ��file���ñ���Ҳ��,���Բ�������newһ��file3
        File file3 = new File("a.txt");
        System.out.println("delete:" + file.delete());

        //��Ҫɾ��ccc�ļ���
        File file4 = new File("aaa\\bbb\\ccc");
        System.out.println("delete:" + file4.delete());

        //��������ɾ��aaa�ļ���,�ұ���Ҫ��ɾ��bbb�ļ���.��Ȼ�ͻ����.



    }
}
