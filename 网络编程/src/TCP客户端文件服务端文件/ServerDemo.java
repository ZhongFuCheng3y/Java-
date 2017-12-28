package TCP客户端文件服务端文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        ServerSocket ss = new ServerSocket(11111);

        //监听客户端连接
        Socket s = ss.accept();

        //封装通道内流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        s.close();
    }
}
