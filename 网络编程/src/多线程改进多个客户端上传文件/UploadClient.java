package 多线程改进多个客户端上传文件;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadClient {

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

        s.shutdownOutput();

        //接收反馈的信息
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String client = brClient.readLine();
        System.out.println(client);

        //释放资源
        br.close();
        s.close();
    }
}
