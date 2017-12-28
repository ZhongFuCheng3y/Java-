package ��������;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;
/*
    ��������:
        1:public boolean createNewFile():�����ļ�,�����,�Ͳ�������
        2:public boolean mkdir():�����ļ���,�����,�Ͳ�������
        3:public boolean mkdirs():�����ļ���,������ļ��в�����,�Ͱ��㴴������
 */

/**
 * Ҫ��:
 * 1:����Ҫ���·���µ�File����
 * 2:Ҫ����ĳ��Ŀ¼�´�������,���ȸ�Ŀ¼Ҫ����
 * 3:��mkdirs���������Ķ����ļ���
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {

        //����:��Ҫ��e��Ŀ¼�´���һ���ļ���demo
        File file = new File("e:\\demo");
        System.out.println("mkdir: " + file.mkdir());

        //����:��Ҫ��e��Ŀ¼demo�´���һ���ļ�a.txt
        File file2 = new File("e:\\demo\\a.txt");
        System.out.println("createNewFile: " + file2.createNewFile());

        //����:��e��Ŀ¼test�´���һ���ļ�b.txt
        //����Ĵ����Ǵ��(IOException),��ΪҪ����Ŀ¼�´�������,�������Ŀ¼�������
        //File file3 = new File("e:\\test\\b.txt");
        //System.out.println("createNewFile:" + file3.createNewFile());

        //����:��e��Ŀ¼test�´���aaaĿ¼
        //����Ĵ���Ҳ�Ǵ��,��ΪtestĿ¼��û�д���
        // File file4= new File("e:\\test\\aaa");
        //System.out.println("mkdir:" + file4.mkdir());

        //����:��e��Ŀ¼test�´���aaaĿ¼
        File file5 = new File("e:\\test");
        File file6 = new File("e:\\test\\aaa");
        System.out.println("mkdir:" + file5.mkdir());
        System.out.println("mkdir:" + file6.mkdir());

        //��ʵ�����и��򵥵ķ���
        File file7 = new File("e:\\aaa\\bbb\\ccc\\ddd\\eee");
        System.out.println("mkdirs: " + file7.mkdirs());

        //��ʹa.txt��׺��������txt,����mkdirs()�����Ķ����ļ���
        File file8 = new File("e:\\aaa\\a.txt");
        System.out.println("mkdirs:" + file8.mkdirs());



    }
}
