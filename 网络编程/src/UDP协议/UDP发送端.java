package UDPЭ��;

import java.io.IOException;
import java.net.*;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    1���������Ͷ˵�Socket����
    2���������ݣ��������ݴ��
    3������Socket����ķ��ͷ����������ݰ�
    4���ͷ���Դ
 */
public class UDP���Ͷ� {

    public static void main(String[] args) throws IOException {
        //�������Ͷ�Socket����
        //javaʹ��DatagramSocket������ΪUDPЭ���Socket
        DatagramSocket ds = new DatagramSocket();

        //����ʹ��DategramPacket�������DatagramSocket���ͺͽ��ܵ����ݱ�
        //����ķ����ܹ������Ǿ��������ݱ���Ŀ�ĵ�
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port);

        //�������ݣ��������ݴ��
        byte[] bys = "hello.udp,������".getBytes();
        //����
        int length = bys.length;
        //ip��ַ�Ķ���
        InetAddress address = InetAddress.getByName("192.168.1.106");
        //�˿�
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address,port);

        ds.send(dp);
        ds.close();

    }
}
