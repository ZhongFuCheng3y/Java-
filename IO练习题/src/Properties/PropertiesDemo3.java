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
    集合与IO流的操作就体现在一下的两个方法:
        1:public void load(Reader reader):把文件中的数据读取到集合中
        2:public void store(Writer writer, String comments):把集合中的数据存储到文件

    load ---加载---把文件的数据加载到集合
    store ---储存--把集合的数据储存到文件
 */
/*
    把集合中的数据写到文件:
        1:创建集合对象
        2:向集合添加数据
        3:集合对象调用store(),把集合中的数据写到文件

    把文件上的数据加载到集合:
        1:创建集合对象
        2:集合对象调用load(),读取文件的数据到集合.
        3:输出集合的内容
        4:获取集合中的所有键集
        5:在控制台输出键值对
 */
public class PropertiesDemo3 {

    public static void main(String[] args) throws IOException {
        //myStore();
        myLoad();

    }

    private static void myLoad() throws IOException {
        //创建集合对象
        Properties properties = new Properties();

        //对象调用load方法,读取文件中的数据到集合中
        properties.load(new FileReader("bb.txt"));

        //输出集合的内容
        Set<String> set = properties.stringPropertyNames();

        for (String key : set) {
            String value = properties.getProperty(key);
            System.out.println(key + "   :" + value);
        }

    }

    private static void myStore() throws IOException {
        //创建集合对象
        Properties properties = new Properties();

        //往集合添加数据
        properties.setProperty("a", "1");
        properties.setProperty("b", "2");
        properties.setProperty("c", "3");
        properties.setProperty("d", "4");

        //调用store(),把集合中的数据写到文件
        properties.store(new FileWriter("bb.txt"), "helloworld");


    }
}
