package ��ӡ��;

import java.io.*;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ����:
        ��o.txt���Ƴɱ�zxc.txt�ڱ�Ŀ¼��
    ����:
        1:��װ����Դ
        2:��װĿ�ĵ�
        3:��д����
        4:�ر���Դ

 */
        public class CopyFileDemo {
            public static void main(String[] args) throws IOException {
                //��װ����Դ
                BufferedReader br = new BufferedReader(new FileReader("o.txt"));

                //��װĿ�ĵ�
                PrintWriter pw = new PrintWriter(new FileWriter("zxc.txt"),true);

                //һ�ζ�ȡһ������
                String line = null;
                while ((line = br.readLine()) != null) {
                    pw.println(line);
                }

                //�ر���Դ
                pw.close();
                br.close();

            }

}
