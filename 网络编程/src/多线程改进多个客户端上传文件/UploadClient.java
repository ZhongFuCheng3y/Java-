package ���̸߳Ľ�����ͻ����ϴ��ļ�;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadClient {

    public static void main(String[] args) throws IOException {
        //�����ͻ���Socket����
        Socket s = new Socket("192.168.1.106",11111);

        //��װ�ı��ļ�
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));
        //��װͨ������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.shutdownOutput();

        //���շ�������Ϣ
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String client = brClient.readLine();
        System.out.println(client);

        //�ͷ���Դ
        br.close();
        s.close();
    }
}
