package ģ��BufferedReader��ReaderLine����;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/10.
 */
/*
    ����Ҫ��MyBufferedReader������BufferedReaderʹ��
        1:BufferedReader(Reader in)--������Ҫ����һ��Reader����,����,�����˶�������

    ��������:
        1:readLine()���ص���String,�������ǵķ�������Ҳ��String
        2:readLine()��ȡ�ļ�ĩβ����null,��������ֻ��ģ��,��û�з���null��
        3:����,����Ҫ��취��ô��ȡ������ȡ�ļ�ĩβ��ѭ������
        4:һ�ζ�ȡһ���ַ�|һ�ζ�ȡһ���ַ�����,����Ӧ��ѡһ�ζ�ȡһ���ַ�
            ԭ��:
                �ַ�����ĳ���,�������޷�ȷ����.���Ǹ����Ͳ�֪���ж೤
        5:���ǲ�����һ�ζ�ȡһ���ַ�,����������,��ȡ��һ���ַ�ʱ,��һ���ַ��ͻᶪʧ.
        6:������Ӧ�ö���һ������,�ַ���������,����,����
            ѡ��:
                ����Ӧ��ѡ���ַ���������������ʵ�.
        7:����'\r'��,����Ӧ��������,Ȼ�������ȡ
        8:����'\n',���Ǿ�Ӧ�ð��ַ���������������ֱ�ӷ���
            û������,�Ͱ��ַ���ӵ��ַ���������
        9:�е������:����ַ����������Ѿ����ַ���,����һֱû������\n,��ô���ݾͻᱻ��©��
            ���:����ַ���������������,���Ǿ�Ӧ������





 */
public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r) {
        this.r = r;
    }

    //ģ�����readLine()
    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while ((ch = r.read()) != -1) {
            if (ch == '\r') {
                continue;
            }
            if (ch == '\n') {
                return sb.toString();
            } else {
                sb.append((char) ch);
            }
        }

        if (sb.length() > 0) {
            return sb.toString();
        }

        return null;
    }

    //�رյķ���
    public void close() throws IOException {
        this.r.close();
    }
}
