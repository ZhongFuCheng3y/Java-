package ģ��LineNumberReader��ȡ�к�;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ����:
        1:����һ��Reader���ñ���,�кű���
        2:����һ�����캯��
        3:set����
        4:get����
        5:Ҫ��ȡ�к�,�͵ý�����ÿ�ζ�ȡһ�е�������
        6:�ر���Դ
 */
public class MyLineNumberReader {
    private int lineNumber = 0;
    private Reader r;

    public MyLineNumberReader(Reader r) {
        this.r = r;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        lineNumber = lineNumber;
    }

    public String readLine() throws IOException {
        //����һ��readLine�кž�Ӧ������һ��
        lineNumber++;

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


    public void close() throws IOException {
        this.r.close();
    }
}
