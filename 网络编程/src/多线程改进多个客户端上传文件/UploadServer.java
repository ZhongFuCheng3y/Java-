package ���̸߳Ľ�����ͻ����ϴ��ļ�;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //��������������
        ServerSocket ss = new ServerSocket(11111);

        while(true) {
            Socket s= ss.accept();
            new Thread(new UserThread(s)).start();
        }
    }
}
