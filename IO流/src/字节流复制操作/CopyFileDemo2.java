package �ֽ������Ʋ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ��fox.txt���Ƶ�f:\fox.txt��
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��ȡ����Դ������,д��Ŀ�ĵ�
        3:�ر���Դ
 */
public class CopyFileDemo2 {

    public static void main(String[] args) throws IOException {
        //��װ����Դ
        FileInputStream  fis = new FileInputStream("fox.txt");

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("f:\\fox.txt");

        //��ȡ����Դ������,д��Ŀ�ĵ�
        int by =0;
        while((by = fis.read())!= -1) {
            fos.write(by);
        }

        //�ر���Դ
        fos.close();
        fis.close();
    }

}
