package ���Ƶ����ļ���;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        ����Ҫ����һ�������ļ��е�����̷���
    ����:
        1:��װԴĿ¼
        2:��װĿ�ĵ�
        3:�õ�ԴĿ¼�µ�File����
        4:����File����,���ÿ��File����
        5:�õ�File�����Ӧ�ļ�������
        6:�´���һ��File����,·�����̷�+�õ�������
        7:���Ʋ���--ǰfile��Ϊ����Դ,��file��ΪĿ�ĵ�,

 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        //��װԴĿ¼
        File file = new File("D:\\IO��ϰ��\\demo");

        //��װĿ�ĵ�
        File file1 = new File("f:\\text");
        //����ļ��в�����,�ʹ���һ��
        if(!file1.exists()){
            file1.mkdir();
        }

        //�õ�ԴĿ¼�µ�File����
        File[] files = file.listFiles();

        //����File����,��ȡÿ��File����
        for (File file2 : files) {
            String name = file2.getName();
            File file3 = new File(file1, name);
            copyFile(file2, file3);
        }
    }

    private static void copyFile(File src, File dest) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //ÿ�ζ�дһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }

        //�ر���Դ
        bis.close();
        bos.close();
    }
}
