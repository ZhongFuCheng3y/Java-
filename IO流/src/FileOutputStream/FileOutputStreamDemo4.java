package FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    �����쳣������ֽ����������
 */
public class FileOutputStreamDemo4 {

    public static void main(String[] args) {

        //����FileOutputStream����
        FileOutputStream fos = null;
        try {
             fos = new FileOutputStream("fos.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fos.write("hello".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
