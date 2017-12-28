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
    ����:
        ����һ���ı��ļ�(user.txt),�����Ǽ�ֵ����ʽ��,����֪��������ʲô
        �ж��Ƿ���"lisi"�ļ�����,����о͸ı�Ϊ"100"
    ����:
        1:�������϶���
        2:��ȡ�ļ��е����ݵ�������.---load
        3:��ȡ�����е����м���
        4:��������
        5:�������Ƿ���"lisi",����о͸ı�ֵΪ"100"
            setsetProperty();
        6:�Ѽ����е��������´浽�ļ���---store
 */
public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        //�������϶���
        Properties properties = new Properties();

        //��ȡ�ļ��е����ݵ�������
        properties.load(new FileReader("user.txt"));

        //��ȡ�����е����м���
        Set<String> set = properties.stringPropertyNames();

        //��������
        for (String key : set) {
            if (key.equals("lisi") ) {
                //�޸�ֵ,��ֱ�Ӱ����������һ�ε�������
                properties.setProperty("lisi", "100");
            }
        }

        //�Ѽ����е���������д���ļ���
        properties.store(new FileWriter("user.txt"),"nihao");




    }
}
