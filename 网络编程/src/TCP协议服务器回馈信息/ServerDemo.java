package TCP协议服务器回馈信息;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/22.
 */
public class ServerDemo {

    public static void main(String[] args) throws IOException {
        ServerSocket  ss = new ServerSocket(9999);

        //监听客户端的连接
        Socket s = ss.accept();

        //获取输入流
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String server = new String(bys,0,len);
        System.out.println("server:   "  + server );

        //获取输出流
        OutputStream os = s.getOutputStream();
        os.write("数据已经收到了".getBytes());

        //释放资源
        s.close();

    }



}
