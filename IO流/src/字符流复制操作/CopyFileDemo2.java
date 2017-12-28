package 字符流复制操作;

/**
 * Created by asd on 2016/9/8.
 */
/*
    要点:
        1:由于我们常见的操作都是使用本地默认编码,所以,我们不需要指定编码
        2:转换流的名称有点长,java提供了其子类供我们使用----FileWriter---FileReader
        3:FileWriter就是做了一个封装---封装了OutStreamWriter + 编码表
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * OutputStreamWriter = FileOutputStream + 编码表
 * FileWriter = FileOutputStream + 编码表
 * InputStreamReader = FileInputStream + 编码表
 * FileReader = FileInputStream + 编码表
 */

/*
    需求:
        把当前项目目录下的a.txt内容复制到当前目录下的b.txt
    分析:
        1:封装数据源---文本文件--字符数据--FileReader
        2:封装目的地---文本文件--字符数据--FileWriter
        3:将数据源读到的内容写到目的地
        4:关闭资源

 */
public class CopyFileDemo2 {

    public static void main(String[] args) throws IOException {
        //封装数据源
        FileReader fr = new FileReader("a.txt");

        //封装目的地
        FileWriter fw = new FileWriter("c.txt");

        //将数据源读到的内容写到目的地
        //用数组的方式来写
        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1) {
            fw.write(chars, 0, len);
            fw.flush();
        }

        //释放资源
        fw.close();
        fr.close();
    }
}
