package ���߳�ʹ��UDP;

        import java.net.DatagramSocket;
        import java.net.SocketException;

/**
 * Created by ozc on 2016/8/22.
 */

/**
 * ͨ�����̸߳Ľ������ǾͿ���ʵ����һ�����ڷ��ͺͽ��������ˡ�
 */
public class ChatRoom {
    public static void main(String[] args) throws SocketException {
        // �������ն˺ͷ��Ͷ˵�Socket����
        DatagramSocket dsSend = new DatagramSocket();
        DatagramSocket dsReceive = new DatagramSocket(12306);

        SendThread st = new SendThread(dsSend);
        ReceiveThread rt = new ReceiveThread(dsReceive);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);

        t1.start();
        t2.start();


    }
}
