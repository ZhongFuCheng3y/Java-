package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Properties;
import java.util.Set;

/**
 * Properties属性集合类:
 *      1:是一个可以与IO流结合使用的集合类
 *      2:数据可保存在流中,或从流中加载数据
 *      3:是HashMap的子类,说明是一个Map集合.
 *
 */

/*
    注意:
        1:虽然是Map集合的子类,但是,该类不是一个泛型类,不能加泛型
        2:每一个对应的key和value都是String类型的.
 */

public class PropertiesDemo {
    public static void main(String[] args) {

        //创建对象
        Properties properties = new Properties();

        //添加元素
        properties.put("01", "hello0");
        properties.put("02", "hello1");
        properties.put("03", "hello2");
        properties.put("04", "hello3");

        //遍历集合
        //拿到Set集合
        Set<Object> set = properties.keySet();

        for (Object key : set) {
            //根据key拿到value
            Object o = properties.get(key);

            System.out.println(key + "----" + o);

        }

    }
}
