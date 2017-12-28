package ���߳�ʹ��UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ReceiveThread implements Runnable {
    private DatagramSocket ds;

    public ReceiveThread(DatagramSocket ds) {

        this.ds = ds;
    }

    @Override
    public void run() {
        while (true) {

            //�����������ݰ�������
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            //��������
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }

            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(), 0, dp.getLength());

            System.out.println("from" + ip + "data   is  : " + s);


        }
    }
}
