package TCP客户端键盘录入服务器输出文本文件;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.106", 23456);

        //封装键盘录入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装通道内的数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            if ("over".equals(line)) {
                break;
            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();

    }

}

