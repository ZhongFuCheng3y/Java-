package TCP客户端文件服务端文件;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端Socket对象
        Socket s = new Socket("192.168.1.106",11111);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //封装通道内流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }


}
