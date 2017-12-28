package ���ƶ༶�ļ���;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    ����:
        ����ĿĿ¼�µ�demos�༶�ļ����Ƶ�e��
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:�ж�Ŀ¼���ļ������ļ���
            �ļ�:
                ֱ�Ӹ���
            �ļ���:
                1:�����ļ���
                2:��ȡ�ļ����µ�File[]
                3:����File[],��ȡÿ��File����
                4:�ж�File�������ļ������ļ���(Ҳ���ǵ�����)

    Ҫ���ļ����Ƶ���һ��·��
        1:����������Ҫ����Ŀ�ĵ�·��--Ҳ����File����
    ����:
        ��c:\\a.txt���Ƶ�d�̵ĸ�Ŀ¼
        ����Ҫ��d����d:\\a.txt·��




 */
public class CopyFoldersDemo {

    public static void main(String[] args) throws IOException {
        //��װ����Դ
        File file = new File("demos");

        //��װĿ�ĵ�
        File file1 = new File("f:\\");


        CopyFolders1(file, file1);


    }

    private static void CopyFolders1(File src, File dest) throws IOException {

        //���ļ���
        if (src.isDirectory()) {

            //����Ҫ��Ŀ�ĵ�Ҳ����һ���ļ���
            File newFile = new File(dest, src.getName());
            newFile.mkdir();

            //��ȡsrc�µ�File[],����File[],��ȡÿһ��File����
            File[] fileArray = src.listFiles();
            for (File file : fileArray) {
                CopyFolders1(file, newFile);
            }
        } else {
            //���ļ�
            File file = new File(dest, src.getName());
            copyFile2(src, file);

        }


    }

    //��Ϊ�����и��ָ������ļ�,�����������ֽ���
    private static void copyFile2(File src, File file) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file));

        //ÿ�ζ�ȡһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }

        //�ر���Դ
        bis.close();
        bos.close();
    }


}
