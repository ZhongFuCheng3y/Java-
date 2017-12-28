package UDP协议的简化版;

import java.io.IOException;
import java.net.*;

/**
 * Created by ozc on 2016/8/22.
 */
public class 发送端 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //创建要发送数据的数组
        byte[] bys = "helloworld".getBytes();

        //把数据打包
        DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.106"), 12345);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
