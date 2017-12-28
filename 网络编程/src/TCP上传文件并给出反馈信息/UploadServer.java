package TCP上传文件并给出反馈信息;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务器的Socket对象
        ServerSocket ss = new ServerSocket(11111);

        //监听客户端连接
        Socket s = ss.accept();

        //封装通道内的流
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        //封装文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("Copy.jawva"));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈信息
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        bw.close();
        s.close();
    }
}
