package 读写基本类型数据;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.*;

/**
 * 数据输入流:
 *      DateInputStream
 *          DateInputStream(InputStream in)
 *      DateOutputStream
 *          DateOuputStream(OutputStream out)
 */
public class DateStreamDemo {

    public static void main(String[] args) throws IOException {
        write();
        read();
    }

    private static void write() throws IOException {
        //创建数据输出流对象
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("dos.txt"));

        //写数据
        dos.writeByte(10);
        dos.writeShort(100);
        dos.writeInt(1000);
        dos.writeLong(10000);
        dos.writeFloat(12.34F);
        dos.writeDouble(12.56);
        dos.writeChar('a');
        dos.writeBoolean(true);

        // 释放资源
        dos.close();
    }

    private static void read() throws IOException {
        //创建数据输入流对象
        DataInputStream dis = new DataInputStream(new FileInputStream("dos.txt"));

        // 读数据
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        char c = dis.readChar();
        boolean bb = dis.readBoolean();

        // 释放资源
        dis.close();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bb);


    }
}
