package TCP�ϴ�ͼƬ����������;

import java.io.*;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadClient {
    public static void main(String[] args) throws IOException {
        //����Socket����
        Socket s = new Socket("192.168.1.106", 11111);

        //��װͼƬ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("����ϼ.jpg"));

        //��װͨ���ڵ���
        BufferedOutputStream bos = new BufferedOutputStream(s.getOutputStream());

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }
        s.shutdownOutput();

        //��ȡ������Ϣ
        InputStream is = s.getInputStream();
        byte[] bys2 = new byte[1024];
        int len2 = is.read(bys2);
        String client = new String(bys2,0,len2);
        System.out.println(client);

        //�ͷ���Դ
        bis.close();
        s.close();
    }
}
