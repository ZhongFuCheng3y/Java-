package ��ӡ��;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ���Բ������������:
        1:����������write()������һ��,write()��Ҫָ����������
        2:��ӡ���ṩ��print()��println(),����Ҫָ����������

    �Զ�ˢ��:
        1:�ڴ��������ʱ��,����һ������,true,�Ϳ���ʵ���Զ�ˢ����.
        2:����Ҫprintln(),printf(),format()������һ������ʱ��������Զ�ˢ��.-----print()������
        3:��������:
            PrintWriter pw = new PrintWriter(new FileWriter("o.txt",true));

     println()�ȼ���:
        bw.write()
        bw.newLine()
        bw.flush()
 */
public class PrintWriterDemo2 {

    public static void main(String[] args) throws IOException {

        //������ӡ������,�ܹ�ʵ���Զ�ˢ�µ�.
        PrintWriter pw = new PrintWriter(new FileWriter("o.txt"));

        //������ʾ�ܹ��������������
        pw.println("hello");
        pw.println('a');
        pw.println(100);

        //�ر���Դ
        pw.close();
    }


}
