package �ַ������Ʋ���;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter��ʵ���� OutputStreamWriter + �����, ��ֻ�������Ƿ�װ����
 * FileWriter����д���ַ��ļ��ı����,
 */
/*
    ����:
        ����ĿĿ¼�µ�a.txt���Ƶ�c:\b.txt��
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:������Դ����������д��Ŀ�ĵ�
        4:�ر���Դ
 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        FileReader fr = new FileReader("a.txt");

        //��װĿ�ĵ�
        FileWriter fw = new FileWriter("d:\\b.txt");

        //������Դ����������д��Ŀ�ĵ�
        int by = 0;
        while ((by = fr.read()) != -1) {
            fw.write(by);

        }

        //�ر���Դ
        fw.close();
        fr.close();

    }
}
