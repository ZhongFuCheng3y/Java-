package UDPЭ��ļ򻯰�;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ���ն� {
    public static void main(String[] args) throws IOException {

        //����Socket����
        DatagramSocket ds = new DatagramSocket(12345);

        //����һ���������ݵİ���
        byte[] bys = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        //��������
        ds.receive(dp);

        //��������

        String ip = dp.getAddress().getHostAddress();
        String s = new String(dp.getData() , 0, dp.getLength());

        System.out.println("from "  +  ip + "data is : "   + s);

        ds.close();



    }
}
