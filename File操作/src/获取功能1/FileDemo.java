package ��ȡ����1;

/**
 * Created by asd on 2016/9/6.
 */

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * public String getAbsolutePath():��ȡ����·��
 * public String getPath():��ȡ���·��
 * public String getName():��ȡ����
 * public long length():��ȡ����,�ֽ���
 * public long lastModified():��ȡ���һ���޸�ʱ��,����ֵ
 */
public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        file.createNewFile();

        System.out.println("getAbsolutePath:" + file.getAbsolutePath());
        System.out.println("getPath:" + file.getPath());
        System.out.println("getName:" + file.getName());
        System.out.println("length:" + file.length());
        System.out.println("lastModified:" + file.lastModified());

        //1473163343991
        //��ʽ������ֵ
        Date d = new Date(1473163343991L);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }
}
