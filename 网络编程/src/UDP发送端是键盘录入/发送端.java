package UDP���Ͷ��Ǽ���¼��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ozc on 2016/8/22.
 */
public class ���Ͷ� {
    public static void main(String[] args) throws IOException {
        //�������Ͷ˵�Socket����
        DatagramSocket ds = new DatagramSocket();

        //��װ����¼������
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.106"), 12345);

            //��������
            ds.send(dp);
        }
        //�ͷ���Դ
        ds.close();
    }
}
