package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    һ�ζ�ȡһ���ֽ�����:
        int read(byte[] b)
    ����ֵ:
        ��ʵ��ʵ�ʶ�ȡ���ֽڸ���
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //�����ֽ�����������
        FileInputStream fis = new FileInputStream("fos.txt");

        //��ȡ����
        /**
         * �������ԭ��һ��һ���ֽڶ�ȡ���Ч��һЩ
         * �����õ���String�Ĺ��췽��,��byte[]ת����String����ڿ���̨��.
         */
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys,0,len));
        }

        //�ͷ���Դ
        fis.close();
    }
}
