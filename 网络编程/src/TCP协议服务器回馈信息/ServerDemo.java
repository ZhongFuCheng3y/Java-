package TCPЭ�������������Ϣ;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket  ss = new ServerSocket(9999);

        //�����ͻ��˵�����
        Socket s = ss.accept();

        //��ȡ������
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String server = new String(bys,0,len);
        System.out.println("server:   "  + server );

        //��ȡ�����
        OutputStream os = s.getOutputStream();
        os.write("�����Ѿ��յ���".getBytes());

        //�ͷ���Դ
        s.close();

    }



}
