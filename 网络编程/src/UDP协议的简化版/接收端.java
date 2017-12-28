package UDP协议的简化版;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by ozc on 2016/8/22.
 */
public class 接收端 {
    public static void main(String[] args) throws IOException {

        //创建Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        //创建一个接收数据的包裹
        byte[] bys = new byte[1024];

        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        //接收数据
        ds.receive(dp);

        //解析数据

        String ip = dp.getAddress().getHostAddress();
        String s = new String(dp.getData() , 0, dp.getLength());

        System.out.println("from "  +  ip + "data is : "   + s);

        ds.close();



    }
}
