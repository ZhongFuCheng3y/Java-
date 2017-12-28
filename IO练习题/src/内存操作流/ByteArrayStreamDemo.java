package 内存操作流;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/11.
 */
/*
    内存操作流:
            用于处理临时存储信息,程序结束,数据就会从内存消失
    字节数组:
        ByteArrayInputStream
        ByteArrayOutputStream
    字符数组:
        CharArrayReader
        CharArrayWriter
    字符串:
        StringReader
        StringWriter
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) throws IOException {
        //以字节数组为案列

        //创建对象--因为是在内存中操作,所以不需要指定File的对象了
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        //写数据
        for (int i = 0; i < 10; i++) {
            baos.write(("hello" + i).getBytes());
        }

        //通过源码发现,baos.close()什么都没有做
        //根本就不需要close()

        //读数据
        /**
         * 1:先把写数据的对象变成字节数组
         * 2:将字节数组作为参数传入对象
         * 3:读取数据
         */
        byte[] bys = baos.toByteArray();
        ByteArrayInputStream bais = new ByteArrayInputStream(bys);


        int by = 0;
        while ((by = bais.read()) != -1) {
            System.out.print((char) by);
        }
    }
}
