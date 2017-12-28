package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Properties;
import java.util.Set;

/**
 *  特殊的功能:
 *      public Object setProperties(String key , String value):添加元素
 *      public String getProperties(String key):获取元素
 *      public Set<String> stringPropertyName():获取属性列表中所有的键的集合.
 */
public class PropertiesDemo2 {

    public static void main(String[] args) {
        //创建集合对象
        Properties properties = new Properties();

        //添加元素
        properties.setProperty("张1", "20");
        properties.setProperty("张2", "22");
        properties.setProperty("张3", "23");
        properties.setProperty("张4", "24");

        //获取所有的键的集合
        Set<String> set = properties.stringPropertyNames();

        for (String key : set) {
            String s = properties.getProperty(key);
            System.out.println(key + "-----" + s);
        }


    }
}
