package ģ��BufferedReader��ReaderLine����;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asd on 2016/9/10.
 */
/*
    ����:
        ��Readerģ��BufferedReader��readLine()����
        readLine():һ�ζ�ȡһ��,���ݻ��з��ж��Ƿ����
    ˼·:
        1:����MyBufferedReader��ʱ�򣬰�������BufferedReaderһ����ʹ��
 */
public class MyBufferedReaderDemo {

    public static void main(String[] args) throws IOException {
        MyBufferedReader mbr = new MyBufferedReader(new FileReader("o.txt"));

        String line = null;
        while((line = mbr.readLine())!=null) {
            System.out.println(line);
        }

        mbr.close();
    }


}
