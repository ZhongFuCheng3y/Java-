package Buffer�ֽ�����������;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ��ȡa.txt������
    ����:
        1:��װ����Դ
        2:����ȡ��������ʽ�ڿ���̨��
        3:�ر���Դ
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));

        //��ȡ����,������ķ�ʽ
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        //�ͷ���Դ
        bis.close();
    }
}
