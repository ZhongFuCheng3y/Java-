package UDP协议;

import java.io.IOException;
import java.net.*;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    1：创建发送端的Socket对象
    2：创建数据，并将数据打包
    3：调用Socket对象的发送方法发送数据包
    4：释放资源
 */
public class UDP发送端 {

    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象
        //java使用DatagramSocket对象作为UDP协议的Socket
        DatagramSocket ds = new DatagramSocket();

        //我们使用DategramPacket对象代表DatagramSocket发送和接受的数据报
        //下面的方法能够让我们决定该数据报的目的地
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port);

        //创建数据，并将数据打包
        byte[] bys = "hello.udp,我来了".getBytes();
        //长度
        int length = bys.length;
        //ip地址的对象
        InetAddress address = InetAddress.getByName("192.168.1.106");
        //端口
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys, length, address,port);

        ds.send(dp);
        ds.close();

    }
}
