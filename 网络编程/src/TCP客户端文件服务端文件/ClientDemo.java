package TCP�ͻ����ļ�������ļ�;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
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
        br.close();
        s.close();
    }


}
