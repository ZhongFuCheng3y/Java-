package �ַ������Ʋ���;

import java.io.*;

/**
 * Created by asd on 2016/9/8.
 */
public class BufferedCopyFile2 {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //��װĿ�ĵ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("qqq.txt"));

        //����BufferedWriter��BufferedReader���еķ���
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
