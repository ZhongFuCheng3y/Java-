package FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ���ʵ�����ݻ���:
        1:��ͬϵͳ��Բ�ͬ�Ļ��з����ǲ�ͬ��
            1:windows:\r\n
            2:linux:\n
            3:mac:\r
        2:�����ĸ߼��ʼǱ��ǿ���ʶ������Ļ��з��ŵ�,����windows�Դ��Ĳ���,ֻʶ��\r\n

    ���ʵ�����ݵ�׷��д��:
        1:�ù��췽�����ڶ���������true���������

 */
public class FileOutputStreamDemo3 {

    public static void main(String[] args) throws IOException {

        //�����ֽ����������
        //���ڶ�������true,˵���Ϳ������ļ�׷������
        FileOutputStream fos = new FileOutputStream("fos.txt",true);

        //д����
        for(int i=0; i<10; i++) {
            fos.write(("hello" + i).getBytes());
            fos.write("\r\n".getBytes());
        }

        //�ر���Դ
        fos.close();
    }
}
