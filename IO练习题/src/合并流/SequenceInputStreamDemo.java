package �ϲ���;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ��ǰ
        1:һ���ļ����Ƶ���һ���ļ�
    ����
        2:�����ļ�������,���Ƶ�����һ���ļ�
 */

/*
    ����:
        ��a.txt��o.txt�����ݸ��Ƶ�Copy.java��
 */

import java.io.*;

/**
 *  SequenceInputStream(InputStream s1 , InputStream s2)
 */
public class SequenceInputStreamDemo {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("a.txt");

        InputStream inputStream1 = new FileInputStream("o.txt");

        //�����ϲ�������
        SequenceInputStream sis = new SequenceInputStream(inputStream1, inputStream);

        //���������ֽ���
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Copy.java"));

        //��д�Ĳ�������ǰ��һ����.
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = sis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);

        }

        //�ر���Դ
        bos.close();
        sis.close();

    }
}
