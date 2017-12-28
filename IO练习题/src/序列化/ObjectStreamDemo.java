package ���л�;

import java.io.*;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ���л�:
        �Ѷ�������һ���ķ�ʽ�����ı��ļ��л�������,����----������(ObjectOutputStream)
        --�򵥽����ǰѶ���д���ı��ļ�
    �����л�:
        ���ı��ļ��е����������ݻ������е����������ݻ�ԭ�ɶ���..������---����(ObjectInputStream)

    Serializable
        1:��һ������Խӿ�,û���κε�ʵ�ַ���
        2:ʵ��Serializable���ܶ���������л������л�

    transient
        1:�ùؼ�����������Ҫ���л��ĳ�Ա����

    ���л�����:
        1:�������л�����
        2:����Ҫ�����л��Ķ���
        3:����writeObject()����
        4:�ر���Դ

    �����л�����:
        1:���������л�����
        2:����readObject()����
        3:�ر���Դ
 */

/**
 *  Ҫ��:
 *      1:ʵ�����л����౾�����һ�����ֵ
 *      2:ÿ���޸�java�ļ���ʱ��,class�ļ���idֵ�ͻᷢ���ı�
 *      3:�ڶ�ȡ�ļ���ʱ��,class�ļ���id���ԭ���Ķ�ȡid�Ƚ�,�������Ⱦͻ������
 *      4:ֻҪ��id�̶�����,����java�ļ���ô�ı�,��ȡ�Ļ���ԭ�����Ǹ�class�ļ�.
 */



public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        write();
        read();
    }

    private static void write() throws IOException {
        //�������л�����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("n.txt"));

        //���������л��Ķ���
        Person p = new Person("���", 18);

        //����writeObject()����.
        oos.writeObject(p);

        //�ر���Դ
        oos.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        //���������л�����
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("n.txt"));

        //����readObject()����
        Object o = ois.readObject();
        System.out.println(o);

        //�ر���Դ
        ois.close();
    }
}
