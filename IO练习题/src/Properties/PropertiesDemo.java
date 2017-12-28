package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Properties;
import java.util.Set;

/**
 * Properties���Լ�����:
 *      1:��һ��������IO�����ʹ�õļ�����
 *      2:���ݿɱ���������,������м�������
 *      3:��HashMap������,˵����һ��Map����.
 *
 */

/*
    ע��:
        1:��Ȼ��Map���ϵ�����,����,���಻��һ��������,���ܼӷ���
        2:ÿһ����Ӧ��key��value����String���͵�.
 */

public class PropertiesDemo {
    public static void main(String[] args) {

        //��������
        Properties properties = new Properties();

        //���Ԫ��
        properties.put("01", "hello0");
        properties.put("02", "hello1");
        properties.put("03", "hello2");
        properties.put("04", "hello3");

        //��������
        //�õ�Set����
        Set<Object> set = properties.keySet();

        for (Object key : set) {
            //����key�õ�value
            Object o = properties.get(key);

            System.out.println(key + "----" + o);

        }

    }
}
