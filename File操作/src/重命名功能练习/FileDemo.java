package ������������ϰ;

import java.io.File;

/**
 * Created by asd on 2016/9/6.
 */
/*
    ����:
        ��E:\java�����ļ����µ��ļ��и���Ϊday_01
    ����:
        1:��װĿ¼
        2:��ȡĿ¼�������ļ���File����
        3:����File����,�õ�ÿһ��File����
        4:ƴ��һ���µ�����,Ȼ��������
 */
public class FileDemo {

    public static void main(String[] args) {

        //��װĿ¼
        File file = new File("E:\\java�±�");

        //��ȡĿ¼��File����
        File[] fileArray = file.listFiles();

        //����File����,�õ�ÿһ��File����
        for(File f : fileArray) {

            //��ȡFile������
            String name = f.getName();

            //��ȡ"0"��λ��
            int index = name.indexOf("0");
            String newName1 = name.substring(index+1);
            System.out.println(newName1);

            File newFile = new File(file,newName1);

            //������
            //��������Ŀ¼��ÿ��File����
            f.renameTo(newFile);


        }
    }
}
