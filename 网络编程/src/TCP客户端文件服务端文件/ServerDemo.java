package TCP�ͻ����ļ�������ļ�;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //��������
        ServerSocket ss = new ServerSocket(11111);

        //�����ͻ�������
        Socket s = ss.accept();

        //��װͨ������
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //��װ�ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();
    }
}
