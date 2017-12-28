package ����ĳĿ¼�µ��ļ�;

import java.io.File;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ��E:��Ŀ¼������java��β���ļ��ľ���·������ڿ���̨

    ����:
        1:��װĿ¼
        2:��ȡ��Ŀ¼�µ������ļ�/�ļ��е�File����
        3:����������,�õ�ÿһ��File����
        4:�жϸö����Ƿ����ļ���
            ��:�ص��ڶ���
            ����:�����ж��Ƿ�����.java��β
                ��:�������·��
                ����:����

 */
public class FilePathDemo {

    public static void main(String[] args) {
        //��װĿ¼
        /**
         * ֱ�����̷���ΪĿ¼,���÷������׳���ָ���쳣
         * ԭ��:
         *      �鿴�ļ���Ȩ�޲���
         */
        File file = new File("E:\\java����");
        System.out.println(file);
        getPath(file);
    }

    private static void getPath(File f) {
        //��ȡĿ¼���ļ�/�ļ������е�File����
        File[] fileArray = f.listFiles();

        //��������,�õ�ÿ��File����
        for (File file1 : fileArray) {
            //�ж϶����Ƿ����ļ���
            if (file1.isDirectory()) {
                getPath(file1);
            } else {
                //�����ж��Ƿ���.java��β
                if (file1.getName().endsWith(".java")) {
                    System.out.println(file1.getAbsolutePath());
                }
            }
        }
    }
}
