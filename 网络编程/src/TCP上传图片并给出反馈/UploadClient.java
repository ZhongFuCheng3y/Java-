package TCP上传图片并给出反馈;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        Socket s = new Socket("192.168.1.106", 11111);

        //封装图片
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("林青霞.jpg"));

        //封装通道内的流
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }
        s.shutdownOutput();

        //读取反馈信息
        InputStream is = s.getInputStream();
        byte[] bys2 = new byte[1024];
        int len2 = is.read(bys2);
        String client = new String(bys2,0,len2);
        System.out.println(client);

        //释放资源
        bis.close();
        s.close();
    }
}
