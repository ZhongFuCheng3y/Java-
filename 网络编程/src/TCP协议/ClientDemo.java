package TCP协议;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    TCP发送数据：
        1：创建发送端的Socket对象
           如果这部成功，说明链接已经建立完成了
        2：获取输出流，写数据
        3：释放资源
    连接被拒绝，TCP协议一定要先看服务器
    java.net.ConnectException: Connection refused: connect

 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象
        Socket s = new Socket("192.168.1.106",8888);

        //获取输出流，写数据
        //Socket对象可以获取输出流
        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        s.close();

    }
}
