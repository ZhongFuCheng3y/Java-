package TCP�ͻ��˼���¼�����������ı��ļ�;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss = new ServerSocket(23456);

        //�����ͻ�������
        Socket s = ss.accept();

        //��װͨ���ڵ�����
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //��װ�ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {

            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ر���Դ
        bw.close();
        s.close();

    }
}
