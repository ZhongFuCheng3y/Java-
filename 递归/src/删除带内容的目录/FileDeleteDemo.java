package ɾ�������ݵ�Ŀ¼;

import java.io.File;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ����:
        �ݹ��ɾ�������ݵ�Ŀ¼
    ����:
        1:��װĿ¼
        2:��ȡ��Ŀ¼�µ������ļ�/�ļ��е�File����
        3:������File����,�õ�ÿһ��File����
        4:�жϸ�File�����Ƿ����ļ���
            ��:�ص�2
            ����:ɾ��
 */
public class FileDeleteDemo {

    public static void main(String[] args) {
        //��װĿ¼
        File file = new File("demo");

        //Ϊɾ�������ݵ�Ŀ¼����һ������,�õݹ�����
        deleteMkdir(file);
    }

    private static void deleteMkdir(File f) {

        //��ȡ��Ŀ¼�µ������ļ�/�ļ��µ�File����
        File[] fileArray = f.listFiles();

        /**
         * �����ѭ��ֻɾ�����ļ�,û��ɾ���ļ���
         */
        //������File����,�õ�ÿһ��File����
        for (File file1 : fileArray) {
            if (file1.isDirectory()){
                deleteMkdir(file1);
            }else {
                file1.delete();
            }
        }
        /**
         * �����ɾ�ļ���,�Ѵ���Ĳ��������ǵ���Ŀ¼�����
         */
        f.delete();
    }
}
