package TCPЭ��;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    TCP�������ݣ�
        1���������Ͷ˵�Socket����
           ����ⲿ�ɹ���˵�������Ѿ����������
        2����ȡ�������д����
        3���ͷ���Դ
    ���ӱ��ܾ���TCPЭ��һ��Ҫ�ȿ�������
    java.net.ConnectException: Connection refused: connect

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����
        Socket s = new Socket("192.168.1.106",8888);

        //��ȡ�������д����
        //Socket������Ի�ȡ�����
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,������".getBytes());

        s.close();

    }
}
