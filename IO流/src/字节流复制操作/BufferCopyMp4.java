package �ֽ������Ʋ���;

import java.io.*;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ���ø�Ч�ֽ�����F:\��Ӱ\����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi  ���Ƶ���ǰĿ¼��

    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��ȡ����Դ������д��Ŀ�ĵ���--ʹ�������һ��һ�εķ�ʽ
        4:�ر���Դ
 */
public class BufferCopyMp4 {
    public static void main(String[] args) throws IOException {
        //method1("F:\\��Ӱ\\����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi", "a.avi");
        method2("F:\\��Ӱ\\����Ӱ��԰dy1234.net���ء�������õ�����.CD1.avi", "a.avi");
    }

    private static void method2(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //������Դ����������д��Ŀ�ĵ�--ʹ������
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bis.read(bytes))!=-1) {
            bos.write(bytes,0,len);
        }

        //�ر���Դ
        bis.close();
        bos.close();
    }

    private static void method1(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        //��ȡ����Դ������,д��Ŀ�ĵ���,ʹ��һ��һ�εķ�ʽ
        int by = 0;
        while ((by = bis.read()) != -1) {
            bos.write(by);
        }

        //�ر���Դ
        bis.close();
        bos.close();

    }


}
