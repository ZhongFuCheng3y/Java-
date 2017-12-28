package LineNumberReader;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * BufferedReader
 *    |--LineNumberReaderDemo
 *          public int getLineNumber()获取当前行号
 *          public void setLineNumber(int lineNumber):设置当前行号
 *
 */
/*
     LineNumberReader是BufferedReader的子类
        :只要是BufferedReader有的方法,LineNumberReader也有

 */
public class LineNumberReaderDemo {

    public static void main(String[] args) throws IOException {

        //创建对象
        LineNumberReader lmr = new LineNumberReader(new FileReader("o.txt"));

        //读取数据,并获取行号
        String line = null;
        while((line = lmr.readLine())!=null) {
            System.out.println(line +":   " +  lmr.getLineNumber());
        }

        //关闭资源
        lmr.close();


    }
}
