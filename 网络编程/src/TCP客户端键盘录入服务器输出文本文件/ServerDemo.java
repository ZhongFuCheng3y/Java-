package TCP客户端键盘录入服务器输出文本文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss = new ServerSocket(23456);

        //监听客户端连接
        Socket s = ss.accept();

        //封装通道内的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));

        String line = null;
        while ((line = br.readLine()) != null) {

            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //关闭资源
        bw.close();
        s.close();

    }
}
