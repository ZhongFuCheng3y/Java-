package �ַ������Ʋ���;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedCopyFile {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("zzz.txt"));

        //������Դ����������д��Ŀ�ĵ�
        /**
         * ʹ������ķ�ʽ
         */
        char[] chars = new char[1024];
        int len = 0;
        while((len = br.read(chars)) !=-1) {
            bw.write(chars,0,len);
            bw.flush();
        }
        //�ر���Դ
        bw.close();
        br.close();
    }
}
