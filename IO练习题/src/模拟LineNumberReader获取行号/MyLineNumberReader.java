package 模拟LineNumberReader获取行号;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/11.
 */
/*
    分析:
        1:定义一个Reader引用变量,行号变量
        2:定义一个构造函数
        3:set方法
        4:get方法
        5:要获取行号,就得建立在每次读取一行的条件下
        6:关闭资源
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
        //调用一次readLine行号就应该增加一次
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
