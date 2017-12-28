package Properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Created by asd on 2016/9/11.
 */
/*
    ������IO���Ĳ�����������һ�µ���������:
        1:public void load(Reader reader):���ļ��е����ݶ�ȡ��������
        2:public void store(Writer writer, String comments):�Ѽ����е����ݴ洢���ļ�

    load ---����---���ļ������ݼ��ص�����
    store ---����--�Ѽ��ϵ����ݴ��浽�ļ�
 */
/*
    �Ѽ����е�����д���ļ�:
        1:�������϶���
        2:�򼯺��������
        3:���϶������store(),�Ѽ����е�����д���ļ�

    ���ļ��ϵ����ݼ��ص�����:
        1:�������϶���
        2:���϶������load(),��ȡ�ļ������ݵ�����.
        3:������ϵ�����
        4:��ȡ�����е����м���
        5:�ڿ���̨�����ֵ��
 */
public class PropertiesDemo3 {

    public static void main(String[] args) throws IOException {
        //myStore();
        myLoad();

    }

    private static void myLoad() throws IOException {
        //�������϶���
        Properties properties = new Properties();

        //�������load����,��ȡ�ļ��е����ݵ�������
        properties.load(new FileReader("bb.txt"));

        //������ϵ�����
        Set<String> set = properties.stringPropertyNames();

        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "   :" + value);
        }

    }

    private static void myStore() throws IOException {
        //�������϶���
        Properties properties = new Properties();

        //�������������
        properties.setProperty("a", "1");
        properties.setProperty("b", "2");
        properties.setProperty("c", "3");
        properties.setProperty("d", "4");

        //����store(),�Ѽ����е�����д���ļ�
        properties.store(new FileWriter("bb.txt"), "helloworld");


    }
}
