package 模拟LineNumberReader获取行号;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asd on 2016/9/11.
 */
public class MyLineNumberReaderTest {
    public static void main(String[] args) throws IOException {
        //创建对象
        MyLineNumberReader2 mnr = new MyLineNumberReader2(new FileReader("o.txt"));
       // MyLineNumberReader mnr = new MyLineNumberReader (new FileReader("o.txt"));

        String line = null;
        while ((line = mnr.readLine()) != null) {
            System.out.println(mnr.getLineNumber() + "  : " + line);
        }

        //关闭资源
        mnr.close();
    }
}
