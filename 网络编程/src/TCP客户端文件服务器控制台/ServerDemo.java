package TCP�ͻ����ļ�����������̨;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //����������Socket����
        ServerSocket ss= new ServerSocket(34567);

        //�����ͻ�������
        Socket s = ss.accept();

        //��װͨ���ڵ���
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String line = null;
        while((line = br.readLine())!=null) {
            System.out.println(line);
        }
        s.close();
    }
}
