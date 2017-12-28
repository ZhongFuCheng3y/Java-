package �ַ������Ʋ���;

/**
 * Created by asd on 2016/9/8.
 */
/*
    Ҫ��:
        1:�������ǳ����Ĳ�������ʹ�ñ���Ĭ�ϱ���,����,���ǲ���Ҫָ������
        2:ת�����������е㳤,java�ṩ�������๩����ʹ��----FileWriter---FileReader
        3:FileWriter��������һ����װ---��װ��OutStreamWriter + �����
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * OutputStreamWriter = FileOutputStream + �����
 * FileWriter = FileOutputStream + �����
 * InputStreamReader = FileInputStream + �����
 * FileReader = FileInputStream + �����
 */

/*
    ����:
        �ѵ�ǰ��ĿĿ¼�µ�a.txt���ݸ��Ƶ���ǰĿ¼�µ�b.txt
    ����:
        1:��װ����Դ---�ı��ļ�--�ַ�����--FileReader
        2:��װĿ�ĵ�---�ı��ļ�--�ַ�����--FileWriter
        3:������Դ����������д��Ŀ�ĵ�
        4:�ر���Դ

 */
public class CopyFileDemo2 {

    public static void main(String[] args) throws IOException {
        //��װ����Դ
        FileReader fr = new FileReader("a.txt");

        //��װĿ�ĵ�
        FileWriter fw = new FileWriter("c.txt");

        //������Դ����������д��Ŀ�ĵ�
        //������ķ�ʽ��д
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
            fw.flush();
        }

        //�ͷ���Դ
        fw.close();
        fr.close();
    }
}
