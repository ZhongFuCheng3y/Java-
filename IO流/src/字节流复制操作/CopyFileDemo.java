package �ֽ������Ʋ���;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by asd on 2016/9/7.
 */
/*
    ��fos.txt���Ƶ�d����
    ����:
        1:����Դ---fos.txt--��ȡ����---FileInputStream
        2:Ŀ�ĵ�---d:\fos.txt--д������--FileOutputStream
    Ϊʲô������θ�������û��������?
        1:������һ�ζ�ȡһ���ֽ�����,��ת�����ַ�����,Ȼ������ڿ���̨��
        2:��һ���Ҷ�ȡһ������,��дһ������,û�����κ�ת��
        3:�����Լ��Զ���ת��
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //��װ����Դ
        FileInputStream fis = new FileInputStream("fos.txt");

        //��װĿ�ĵ�
        FileOutputStream fos = new FileOutputStream("d:\\fos.txt");

        //��������
        int by = 0;
        while((by = fis.read()) != -1) {
            fos.write(by);
        }

        //�ͷ���Դ
        fos.close();
        fis.close();
    }

}
