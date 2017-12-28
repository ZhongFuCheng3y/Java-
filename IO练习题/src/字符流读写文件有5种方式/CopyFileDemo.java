package �ַ�����д�ļ���5�ַ�ʽ;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.*;

/**
 * ֻҪ��windows�Դ��ʼǱ��ܶ��ö����ļ�,���Ƕ������ַ���������
 */
/*
    �����ܽ�һ���ж����ַ�ʽ��д�ַ��ļ�
        1:��������дһ������
        2:��������дһ���ַ���������
        3:��������дһ���ַ�����
        4:��������дһ���ַ���������
        5:��������дһ���ַ�����
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String src = "a.txt";
        String dest = "b.txt";
        //method1(scr,dest);
        //method2(src,dest);
        method3(src,dest);
        //method4(src,dest);
        //method5(src,dest);

    }

    private static void method5(String src, String dest) throws IOException {
        //��װ����Դ
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));

        //��װĿ�ĵ�
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(dest));

        //һ�ζ�дһ���ַ�����
        char[] chars = new char[1024];
        int len = 0;
        while((len=isr.read(chars))!= -1){
            isw.write(chars,0,len);
            isw.flush();
        }

        //�ر���Դ
        isw.close();
        isr.close();
    }

    private static void method4(String src, String dest) throws IOException {
        //��װ����Դ
        InputStreamReader isr = new InputStreamReader(new FileInputStream(src));

        //��װĿ�ĵ�
        OutputStreamWriter isw = new OutputStreamWriter(new FileOutputStream(dest));

        //������һ�ζ�дһ���ַ�
        int ch = 0;
        while((ch = isr.read())!=-1) {
            isw.write(ch);
            isw.flush();
        }
        //�ر���Դ
        isw.close();
        isr.close();
    }

    private static void method3(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader(src));

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //һ�ζ�ȡһ���ַ�
        int ch = 0;
        while((ch = br.read()) !=-1) {
            bw.write(ch);
            bw.flush();
        }

        //�ر���Դ
        bw.close();
        br.close();
    }

    private static void method2(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader(src));

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //ÿ�ζ�дһ���ַ���������
        char[] chars = new char[1024];
        int len = 0;
        while((len = br.read(chars))!=-1){
            bw.write(chars,0,len);
            bw.flush();
        }
        //�ر���Դ
        bw.close();
        br.close();

    }

    private static void method1(String src, String dest) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader(src));

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

        //ÿ�ζ�дһ������
        String line = null;
        while((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ر���Դ
        bw.close();
        br.close();

    }
}
