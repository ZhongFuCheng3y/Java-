package TCP�ͻ��˼���¼�����������ı��ļ�;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�����ͻ���Socket����
        Socket s = new Socket("192.168.1.106", 23456);

        //��װ����¼��
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //��װͨ���ڵ�����
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();

    }

}

