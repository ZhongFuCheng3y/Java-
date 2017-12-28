package 合并流;

/**
 * Created by asd on 2016/9/11.
 */
/*
    需求:
        把a.txt,o.txt,ooo.txt的内容写到Copy.java中
    分析:
        1:构造函数运行期要InputStream对象的Enumeration型参数
        2:Vector的elements返回的就是Enumeration型参数
        3:创建一个Vector对象
        4:创建三个InputStream对象,加入到Vector里边
        5:获取Vector对象里面的元素,得到Enumeration型的引用
        6:创建SequenceInputStream对象
        7:创建BufferedOutputStream对象
        8:读写数据
        9:关闭资源


 */

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 *  SequenceInputStream(Enumeration<? extends InputStream> e)
 *      该参数必须是生成运行时类型为 InputStream 对象的 Enumeration型参数.
 */
public class SequenceInputStreamDemo2 {

    public static void main(String[] args) throws IOException {
        //创建一个Vector对象
        Vector<InputStream> vector = new Vector<>();

        //创建InputStream对象
        InputStream inputStream = new FileInputStream("a.txt");
        InputStream inputStream1 = new FileInputStream("o.txt");
        InputStream inputStream2 = new FileInputStream("ooo.txt");

        //把InputStream对象加入到Vector
        vector.add(inputStream);
        vector.add(inputStream1);
        vector.add(inputStream2);

        //获取Vector对象里面的元素,得到的是Enumeration的引用
        Enumeration<InputStream> enumeration = vector.elements();

        //创建SequenceInputStream对象
        SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);

        //创建BufferedOutputStream对象
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("Copy2.java"));

        //读写操作
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = sequenceInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, len);

        }

        //关闭资源
        sequenceInputStream.close();
        bufferedOutputStream.close();

    }
}
