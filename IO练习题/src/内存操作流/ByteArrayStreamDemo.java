package �ڴ������;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/11.
 */
/*
    �ڴ������:
            ���ڴ�����ʱ�洢��Ϣ,�������,���ݾͻ���ڴ���ʧ
    �ֽ�����:
        ByteArrayInputStream
        ByteArrayOutputStream
    �ַ�����:
        CharArrayReader
        CharArrayWriter
    �ַ���:
        StringReader
        StringWriter
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        //���ֽ�����Ϊ����

        //��������--��Ϊ�����ڴ��в���,���Բ���Ҫָ��File�Ķ�����
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        //д����
        for (int i = 0; i < 10; i++) {
            baos.write(("hello" + i).getBytes());
        }

        //ͨ��Դ�뷢��,baos.close()ʲô��û����
        //�����Ͳ���Ҫclose()

        //������
        /**
         * 1:�Ȱ�д���ݵĶ������ֽ�����
         * 2:���ֽ�������Ϊ�����������
         * 3:��ȡ����
         */
        byte[] bys = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);


        int by = 0;
        while ((by = bais.read()) != -1) {
            System.out.print((char) by);
        }
    }
}
