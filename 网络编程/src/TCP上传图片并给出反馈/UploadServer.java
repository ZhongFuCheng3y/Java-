package TCP上传图片并给出反馈;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {

        //创建服务端Socket对象
        ServerSocket ss = new ServerSocket(11111);

        //监听客户端连接
        Socket s = ss.accept();

        //封装通道内流
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        //封装图片文件
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mm.jpg"));

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys)) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }

        //给一个反馈
        OutputStream os = s.getOutputStream();
        os.write("图片上传成功".getBytes());

        //关闭资源
        bos.close();
        s.close();


    }
}
