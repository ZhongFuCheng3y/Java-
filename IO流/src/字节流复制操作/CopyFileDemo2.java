package 字节流复制操作;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    把fox.txt复制到f:\fox.txt中
    步骤:
        1:封装数据源
        2:封装目的地
        3:读取数据源的数据,写到目的地
        3:关闭资源
 */
public class CopyFileDemo2 {

    public static void main(String[] args) throws IOException {
        //封装数据源
        FileInputStream  fis = new FileInputStream("fox.txt");

        //封装目的地
        FileOutputStream fos = new FileOutputStream("f:\\fox.txt");

        //读取数据源的数据,写到目的地
        int by =0;
        while((by = fis.read())!= -1) {
            fos.write(by);
        }

        //关闭资源
        fos.close();
        fis.close();
    }

}
