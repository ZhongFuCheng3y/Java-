package TCP�ϴ�ͼƬ����������;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by ozc on 2016/8/23.
 */
public class UploadServer {
    public static void main(String[] args) throws IOException {

        //���������Socket����
        ServerSocket ss = new ServerSocket(11111);

        //�����ͻ�������
        Socket s = ss.accept();

        //��װͨ������
        BufferedInputStream bis = new BufferedInputStream(s.getInputStream());

        //��װͼƬ�ļ�
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("mm.jpg"));

        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys)) != -1) {
            bos.write(bys,0,len);
            bos.flush();
        }

        //��һ������
        OutputStream os = s.getOutputStream();
        os.write("ͼƬ�ϴ��ɹ�".getBytes());

        //�ر���Դ
        bos.close();
        s.close();


    }
}
