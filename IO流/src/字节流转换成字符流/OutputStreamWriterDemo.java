package �ֽ���ת�����ַ���;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת�����ַ���
 * OutptuStreamWriter(OutputStream out, String charsetName):����ָ��������ֽ�����ת�����ַ���
 */
/*
    Ҫ��:
       1:�ַ��� = �ֽ��� + �����
       2:����ʲô����д,��Ӧ����ʲô�����
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //��������

        // ����ֻ������һ������,������ʹ��Ĭ�ϵı����,Ҳ����GBK
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("fox.txt"));

        //ʹ��UTF-8����
        OutputStreamWriter osw1 = new OutputStreamWriter(new FileOutputStream("fox.txt"),"UTF-8");

        //д����
        osw1.write("�й�");

        //�ر���Դ
        osw1.close();
    }

}
