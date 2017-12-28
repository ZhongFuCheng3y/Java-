package TCPЭ��;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    TCP�������ݣ�
        1���������ն˵�Socket����
        2�������ͻ������ӣ�����һ����Ӧ��socket����
        3����ȡ����������ȡ������ʾ�ڿ���̨
        4���ͷ���Դ
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //�������ն˵�Socket����
        ServerSocket ss = new ServerSocket(8888);

        //�����ͻ������ӣ�����һ����Ӧ��Socket����
        //���������ܵ����׽��ֵ����ӣ��˷���������
        Socket s = ss.accept();

        //��ȡ����������ȡ����
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String (bys,0,len);

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "    ---" +str);

        //�ͷ���Դ
        s.close();
        //ss.close();  //�����Ӧ�ùرգ�Ӧ��һֱ�ȴ����տͻ��˵�����

    }
}
