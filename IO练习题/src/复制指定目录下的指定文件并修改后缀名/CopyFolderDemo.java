package ����ָ��Ŀ¼�µ�ָ���ļ����޸ĺ�׺��;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        1:ָ�����ļ��ǣ�.java�ļ���
        2:ָ���ĺ�׺���ǣ�.jad
        3:ָ����Ŀ¼�ǣ�jad
    ����:
        1:��װԴĿ¼
        2:��װĿ�ĵ�
        3:��ȡԴĿ¼�µ�File[]
        4:����File[]�õ�ÿһ��File����
        5:�ж϶���������Ƿ����.java
             ��:
                1:�����ļ���Ŀ�ĵ�,Ŀ�ĵص�·��Ҫ�´���һ��File����
                2:������,���ǾͿ��Ը�����(��Ϊ�µ�.
             ����:
                ����


 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //��װԴĿ¼
        File file = new File("java");


        //��װĿ�ĵ�
        File file1 = new File("d:\\�����Ҹ��Ƴ�����");

        //���Ŀ¼������,�Ҿʹ���һ��
        if (!file1.exists()) {
            file1.mkdir();
        }

        //��ȡԴĿ¼�µ�File[]
        File[] files = file.listFiles();

        //����File[]�õ�ÿһ��File����
        for (File file2 : files) {
            String name = file2.getName();
            if (name.endsWith(".java")) {
                //�����ļ�
                File file3 = new File(file1, name);
                copyFile(file2, file3);

                //����Ҫƴ������,�Ӷ�����File����,Ȼ�����
                /**
                 * ��������Ҳ����Ŀ�ĵ�Ŀ¼�¸���,
                 * file3��Ŀ�ĵ� Ŀ¼
                 * file4��Ŀ�ĵ� Ŀ¼
                 */
                String newName = name + ".jad";
                File file4 = new File(file1,newName);
                file3.renameTo(file4);

            }
        }
    }



    private static void copyFile(File file2, File file3) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file2));

        //��װĿ�ĵ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file3));

        //ÿ�ζ�дһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //�ر���Դ
        bos.close();
        bis.close();
    }
}
