package UDPЭ��ļ򻯰�;

import java.io.IOException;
import java.net.*;

/**
 * Created by ozc on 2016/8/22.
 */
public class ���Ͷ� {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //����Ҫ�������ݵ�����
        byte[] bys = "helloworld".getBytes();

        //�����ݴ��
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.106"), 12345);
        //��������
        ds.send(dp);
        //�ͷ���Դ
        ds.close();
    }
}
