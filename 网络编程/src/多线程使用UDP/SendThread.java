package 多线程使用UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by ozc on 2016/8/22.
 */
public class SendThread implements Runnable {


    private DatagramSocket ds;

    public SendThread(DatagramSocket ds) {
        this.ds = ds;
    }

    @Override
    public void run() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        try {
            while ((line = br.readLine()) != null) {
                if ("886".equals(line)) {
                    break;
                }
                //创建数据并打包
                byte[] bys = line.getBytes();
                DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("192.168.1.106"), 12306);

                ds.send(dp);


            }
            //关闭资源
           // ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
