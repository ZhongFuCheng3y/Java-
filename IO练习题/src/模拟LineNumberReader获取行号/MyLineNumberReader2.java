package ģ��LineNumberReader��ȡ�к�;

import ģ��BufferedReader��ReaderLine����.MyBufferedReader;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/11.
 */
/*
    �����Ѿ�д��MyBufferedRead������,
    Ҫģ��MyLineNumberReader,�̳����ͺ���
 */
public class MyLineNumberReader2 extends MyBufferedReader{
    private Reader r;

    private int lineNumber = 0;

    public MyLineNumberReader2(Reader r) {
        super(r);
    }


    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String readLine() throws IOException {
        lineNumber++;
        return super.readLine();
    }

    @Override
    public void close() throws IOException {
        super.close();
    }
}
