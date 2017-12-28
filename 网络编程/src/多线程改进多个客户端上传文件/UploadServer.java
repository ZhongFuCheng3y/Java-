package 多线程改进多个客户端上传文件;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {
        //创建服务器对象
        ServerSocket ss = new ServerSocket(11111);

        while(true) {
            Socket s= ss.accept();
            new Thread(new UserThread(s)).start();
        }
    }
}
