package FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    一次读取一个字节数组:
        int read(byte[] b)
    返回值:
        其实是实际读取的字节个数
 */
public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("fos.txt");

        //读取数据
        /**
         * 这样会比原来一个一个字节读取会高效率一些
         * 最后调用的是String的构造方法,把byte[]转换成String输出在控制台上.
         */
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys,0,len));
        }

        //释放资源
        fis.close();
    }
}
