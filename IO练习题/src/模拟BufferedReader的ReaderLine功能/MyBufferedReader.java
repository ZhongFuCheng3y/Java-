package 模拟BufferedReader的ReaderLine功能;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by asd on 2016/9/10.
 */
/*
    我们要把MyBufferedReader当成是BufferedReader使用
        1:BufferedReader(Reader in)--我们需要传入一个Reader对象,所以,建立了对象引用

    方法分析:
        1:readLine()返回的是String,所以我们的返回类型也是String
        2:readLine()读取文件末尾返回null,但是我们只是模拟,是没有返回null的
        3:所以,我们要想办法怎么获取结束读取文件末尾的循环条件
        4:一次读取一个字符|一次读取一个字符数组,我们应该选一次读取一个字符
            原因:
                字符数组的长度,我们是无法确定的.我们根本就不知道有多长
        5:我们采用了一次读取一个字符,问题又来了,读取下一个字符时,上一个字符就会丢失.
        6:我们又应该定义一个容器,字符串缓冲区,数组,集合
            选择:
                我们应该选择字符串缓冲区是最合适的.
        7:遇到'\r'的,我们应该跳过它,然后继续读取
        8:遇到'\n',我们就应该把字符串缓冲区的内容直接返回
            没有遇到,就把字符添加到字符串缓冲区
        9:有的情况是:如果字符串缓冲区已经有字符了,但是一直没有遇到\n,那么数据就会被遗漏了
            解决:如果字符串缓冲区有数据,我们就应当返回





 */
public class MyBufferedReader {
    private Reader r;

    public MyBufferedReader(Reader r) {
        this.r = r;
    }

    //模拟的是readLine()
    public String readLine() throws IOException {
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

    //关闭的方法
    public void close() throws IOException {
        this.r.close();
    }
}
