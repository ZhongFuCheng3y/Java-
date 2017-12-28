package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Properties;
import java.util.Set;

/**
 *  ����Ĺ���:
 *      public Object setProperties(String key , String value):���Ԫ��
 *      public String getProperties(String key):��ȡԪ��
 *      public Set<String> stringPropertyName():��ȡ�����б������еļ��ļ���.
 */
public class PropertiesDemo2 {

    public static void main(String[] args) {
        //�������϶���
        Properties properties = new Properties();

        //���Ԫ��
        properties.setProperty("��1", "20");
        properties.setProperty("��2", "22");
        properties.setProperty("��3", "23");
        properties.setProperty("��4", "24");

        //��ȡ���еļ��ļ���
        Set<String> set = properties.stringPropertyNames();

        for (String key : set) {
            String s = properties.getProperty(key);
            System.out.println(key + "-----" + s);
        }


    }
}
