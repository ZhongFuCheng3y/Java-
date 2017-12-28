package UDP协议;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    1：创建一个接收端的Socket对象
    2：创建一个数据包（接受的容器）
    3：调用Socket对象的接收方法接收数据
    4：解析数据报，并显示在控制台
    5：释放资源
 */
public class UDP接收端 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        //指定了端口
        DatagramSocket ds = new DatagramSocket(10086);

        //创建一个数据包，用来接收数据包的
        //  DatagramPacket(byte[] buf , int length);
        byte[] bys = new byte[1024];
        int length = bys.length;
        DatagramPacket dp = new DatagramPacket(bys,length);

        //调用socket对象的接收方法来接收数据
        ds.receive(dp);//此方法会造成阻塞

        //解析数据包，并显示在控制台上
        //获取对方的ip
        InetAddress address = dp.getAddress();
        String ip = address.getHostAddress();

        //获取数据缓冲区
        //获取数据的实际长度
        byte [] bys2 = dp.getData();
        int len = dp.getLength();

        String s = new String(bys2,0,len);
        System.out.println(ip+"传递过来的数据是：" + s);

        //释放资源
        ds.close();

    }
}
