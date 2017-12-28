package TCP客户端文件服务器控制台;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        //创建Socket对象
        Socket s = new Socket("192.168.1.106", 34567);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("misc.xml"));
        //封装通道内的流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        br.close();
        s.close();
    }
}
