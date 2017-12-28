package UDP发送端是键盘录入;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ozc on 2016/8/22.
 */
public class 发送端 {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();

        //封装键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;

        while ((line = br.readLine()) != null) {
            if ("886".equals(line)) {
                break;
            }
            byte[] bys = line.getBytes();
            DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.106"), 12345);

            //发送数据
            ds.send(dp);
        }
        //释放资源
        ds.close();
    }
}
