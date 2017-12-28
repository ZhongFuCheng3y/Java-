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
    需求:
        我有一个文本文件(user.txt),数据是键值对形式的,但不知道内容是什么
        判断是否有"lisi"的键存在,如果有就改变为"100"
    分析:
        1:创建集合对象
        2:读取文件中的数据到集合中.---load
        3:获取集合中的所有键集
        4:遍历集合
        5:遍历键是否有"lisi",如果有就改变值为"100"
            setsetProperty();
        6:把集合中的数据重新存到文件中---store
 */
public class PropertiesDemo4 {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        Properties properties = new Properties();

        //读取文件中的数据到集合中
        properties.load(new FileReader("user.txt"));

        //获取集合中的所有键集
        Set<String> set = properties.stringPropertyNames();

        //遍历集合
        for (String key : set) {
            if (key.equals("lisi") ) {
                //修改值,就直接把数据再添加一次到集合中
                properties.setProperty("lisi", "100");
            }
        }

        //把集合中的数据重新写到文件上
        properties.store(new FileWriter("user.txt"),"nihao");




    }
}
