package �ֽ������Ʋ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    E:\java����\day24\code\�ȴ����ѻ���˼·ͼ��.bmp���Ƶ�f��
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��ȡ����Դ������д��Ŀ�ĵ�----ʹ������ķ�ʽ
        4:�ر���Դ
 */
public class CopyImage {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        FileInputStream fis = new FileInputStream("E:\\java����\\day24\\code\\�ȴ����ѻ���˼·ͼ��.bmp");

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("f:\\aa.bmp");

        //��ȡ����Դ������д��Ŀ�ĵ�--ʹ������

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len = fis.read(bytes)) != -1) {
            fos.write(bytes,0,len);
        }

        //�ر���Դ
        fis.close();
        fos.close();

    }
}
