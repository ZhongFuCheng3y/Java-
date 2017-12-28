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
 *          public int getLineNumber()��ȡ��ǰ�к�
 *          public void setLineNumber(int lineNumber):���õ�ǰ�к�
 *
 */
/*
     LineNumberReader��BufferedReader������
        :ֻҪ��BufferedReader�еķ���,LineNumberReaderҲ��

 */
public class LineNumberReaderDemo {

    public static void main(String[] args) throws IOException {

        //��������
        LineNumberReader lmr = new LineNumberReader(new FileReader("o.txt"));

        //��ȡ����,����ȡ�к�
        String line = null;
        while((line = lmr.readLine())!=null) {
            System.out.println(line +":   " +  lmr.getLineNumber());
        }

        //�ر���Դ
        lmr.close();


    }
}
