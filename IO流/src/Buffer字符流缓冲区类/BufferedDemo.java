package Buffer�ַ�����������;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.*;

/**
 * �ַ������������ⷽ��:
 *    BufferedWriterDemo:
 *          public void newLine():����ϵͳ���������з�
 *    BufferedReader:
 *          public String readLine():һ�ζ�ȡһ������
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
       writer();
       read();
    }

    private static void read() throws IOException {
        //�����ַ�����������---����--������
        BufferedReader br = new BufferedReader(new FileReader("bw.txt"));

        //��ȡ����,���ǲ���һ��һ�ж�ȡ,����BufferReader���еķ���
        String line = null;
        while((line = br.readLine())!= null) {
            System.out.println(line);
        }
    }

    private static void writer() throws IOException{
        //�����ַ�����������---���--д����
        BufferedWriter bw = new BufferedWriter(new FileWriter("bw.txt"));

        //д����
        for(int i=0; i<10; i++) {
            bw.write("hello" + i);
            bw.newLine();
            bw.flush();
        }

        //�ر���Դ
        bw.close();

    }

}
