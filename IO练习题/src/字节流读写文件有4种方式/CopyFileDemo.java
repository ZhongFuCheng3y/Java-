package �ֽ�����д�ļ���4�ַ�ʽ;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
/*
    �ֽ��������ļ���4�ַ�ʽ:
        1:�����ֽ���--ÿ�ζ�дһ���ֽ�����
        2:�����ֽ���--ÿ�ζ�дһ���ֽ�����
        3:�����ֽ���--ÿ�ζ�дһ���ֽ�����
        4:�����ֽ���--ÿ�ζ�дһ���ֽ�����
 */
public class CopyFileDemo {

    public static void main(String[] args) throws IOException {
        String src = "a.txt";
        String dest = "qqqqq.txt";
       // method(src,dest);
        //method1(src,dest);
       // method2(src,dest);
          method3(src,dest);
    }

    private static void method3(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dest));

        //Bufferedÿ�ζ�дһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len =0;
        while((len = br.read(bytes))!=-1) {
            bw.write(bytes,0,len);
        }

        //�ر���Դ
        bw.close();
        br.close();
    }

    private static void method2(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedInputStream br = new BufferedInputStream(new FileInputStream(src));

        //��װĿ�ĵ�
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream(dest));

        //Bufferedÿ�ζ�дһ���ֽ�
        int ch = 0;
        while((ch = br.read()) != -1){
            bw.write(ch);
        }

        //�ر���Դ
        br.close();
        bw.close();
    }

    private static void method1(String src, String dest) throws IOException {
        //��װ����Դ
        FileInputStream fis = new FileInputStream(src);

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream(dest);

        //ÿ�ζ�дһ���ֽ�����
        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        //�ر���Դ
        fis.close();
        fos.close();
    }

    private static void method(String src, String dest) throws IOException {
        //��װ����Դ
        FileInputStream fis = new FileInputStream(src);

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream(dest);

        //ÿ�ζ�дһ���ֽ�
        int ch = 0;
        while((ch = fis.read())!= -1) {
            fos.write(ch);
        }

        //�ر���Դ
        fos.close();
        fis.close();
    }
}
