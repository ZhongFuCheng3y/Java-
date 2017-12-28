package TCP上传文件并给出反馈信息;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
/*
    按照我们正常的思路加入反馈信息，但是结果没有反应（一直在阻塞状态）为什么？
    我们在读取文件时，可以用null作为结束的标志，但是在Socket通道内是不能以null作为结束标志的。
    所以，服务器根本就不知道你已经结束了，而你还想服务器给你反馈，所以，就互相等待了。

    解决：
        1：在多写一条数据，告诉服务器，读到这条数据我就结束了，你也结束吧。
            这样做是可以的，但是不好。
        2：Socket对象提供了一种解决方案
            public void shutdownOutput
            客户端告诉服务器，我已经没有东西输入了，你也该结束了
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket("192.168.1.106", 11111);

        //封装文本文件
        BufferedReader br = new BufferedReader(new FileReader("a.txt"));

        //封装通道内流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line = null;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.shutdownOutput();

        //接收反馈信息
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String client = brClient.readLine();
        System.out.println(client);
        //释放资源
        br.close();
        s.close();
    }

}
