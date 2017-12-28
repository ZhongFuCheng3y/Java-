package TCP�ϴ��ļ�������������Ϣ;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
/*
    ��������������˼·���뷴����Ϣ�����ǽ��û�з�Ӧ��һֱ������״̬��Ϊʲô��
    �����ڶ�ȡ�ļ�ʱ��������null��Ϊ�����ı�־��������Socketͨ�����ǲ�����null��Ϊ������־�ġ�
    ���ԣ������������Ͳ�֪�����Ѿ������ˣ����㻹����������㷴�������ԣ��ͻ���ȴ��ˡ�

    �����
        1���ڶ�дһ�����ݣ����߷��������������������Ҿͽ����ˣ���Ҳ�����ɡ�
            �������ǿ��Եģ����ǲ��á�
        2��Socket�����ṩ��һ�ֽ������
            public void shutdownOutput
            �ͻ��˸��߷����������Ѿ�û�ж��������ˣ���Ҳ�ý�����
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //����Socket����
        Socket s = new Socket("192.168.1.106", 11111);

        //��װ�ı��ļ�
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //��װͨ������
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        //���շ�����Ϣ
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String client = brClient.readLine();
        System.out.println(client);
        //�ͷ���Դ
        br.close();
        s.close();
    }

}
