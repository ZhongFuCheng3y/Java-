package TCP�ϴ��ļ�������������Ϣ;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //������������Socket����
        ServerSocket ss = new ServerSocket(11111);

        //�����ͻ�������
        Socket s = ss.accept();

        //��װͨ���ڵ���
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //��װ�ı��ļ�
        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.jawva"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //����������Ϣ
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        bwServer.write("�ļ��ϴ��ɹ�");
        bwServer.newLine();
        bwServer.flush();

        //�ͷ���Դ
        bw.close();
        s.close();
    }
}
