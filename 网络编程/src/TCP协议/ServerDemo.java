package TCP协议;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
/*
    TCP接收数据：
        1：创建接收端的Socket对象
        2：监听客户端连接，返回一个对应的socket对象
        3：获取输入流，读取数据显示在控制台
        4：释放资源
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象
        ServerSocket ss = new ServerSocket(8888);

        //监听客户端连接，返回一个对应的Socket对象
        //侦听并接受到此套接字的连接，此方法会阻塞
        Socket s = ss.accept();

        //获取输入流，读取数据
        InputStream is = s.getInputStream();

        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String (bys,0,len);

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "    ---" +str);

        //释放资源
        s.close();
        //ss.close();  //这个不应该关闭，应该一直等待接收客户端的数据

    }
}
