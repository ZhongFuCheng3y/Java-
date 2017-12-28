package TCP协议服务器回馈信息;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        Socket s = new Socket("192.168.1.106",9999);

        //获取输出流
        OutputStream os = s.getOutputStream();
        os.write("今天天气很好，可以睡觉".getBytes());

        //获取输入流
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);//阻塞
        String client = new String(bys,0,len);
        System.out.println("client:" + client);

        //释放资源
        s.close();


    }
}
