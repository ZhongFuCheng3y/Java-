package TCP�ͻ��˼���¼��;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.1.106", 22222);

        //����¼������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //��ͨ��������װһ��
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine()) != null) {
            if("886".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //�ͷ���Դ
        //bw.close();
        //br.close();
        s.close();//�������������ֶ��رգ���Ϊ�ر���socket������൱�ڹر��������������ˡ�

    }
}
