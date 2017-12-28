package 字符流复制操作;

/**
 * Created by asd on 2016/9/8.
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter其实就是 OutputStreamWriter + 编码表, 它只不过就是封装好了
 * FileWriter用来写入字符文件的便捷类,
 */
/*
    需求:
        将项目目录下的a.txt复制到c:\b.txt上
    分析:
        1:封装数据源
        2:封装目的地
        3:将数据源读到的内容写到目的地
        4:关闭资源
 */
public class CopyFileDemo3 {
    public static void main(String[] args) throws IOException {
        //封装数据源
        FileReader fr = new FileReader("a.txt");

        //封装目的地
        FileWriter fw = new FileWriter("d:\\b.txt");

        //将数据源读到的内容写到目的地
        int by = 0;
        while ((by = fr.read()) != -1) {
            fw.write(by);

        }

        //关闭资源
        fw.close();
        fr.close();

    }
}
