package 模拟LineNumberReader获取行号;

import 模拟BufferedReader的ReaderLine功能.MyBufferedReader;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/11.
 */
/*
    我们已经写过MyBufferedRead的类了,
    要模拟MyLineNumberReader,继承它就好了
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
