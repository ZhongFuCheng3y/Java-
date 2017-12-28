package 多线程使用UDP;

        import java.net.DatagramSocket;
        import java.net.SocketException;

/**
 * Created by ozc on 2016/8/22.
 */

/**
 * 通过多线程改进，我们就可以实现在一个窗口发送和接收数据了。
 */
public class ChatRoom {
    public static void main(String[] args) throws SocketException {
        // 创建接收端和发送端的Socket对象
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
