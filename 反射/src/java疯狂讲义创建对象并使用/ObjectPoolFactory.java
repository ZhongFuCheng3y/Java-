package java疯狂讲义创建对象并使用;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ozc on 2016/8/30.
 */
/*
    需求：
        根据配置文件的内容创建对象
    实现：
        1：将配置文件的内容加载到Properties中
        2：创建一个Map对象---用来存放配置文件的key和value(对象)
        3：根据value的值利用反射直接创建实例
        4：根据key的值获取value(也就是上一步创建出来的实例)并输出在控制台上
 */
public class ObjectPoolFactory {

    //创建一个Map对象
    private Map<String, Object> objectPool = new HashMap<>();

    //定义一个创建对象的方法
    private Object createObject(String clazzName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //获得Class对象
        Class clazz = Class.forName(clazzName);

        //使用clazz对应的类默认构造器创建实例
        return clazz.newInstance();

    }

    //根据指定文件初始化对象池，并根据配置文件创建对象
    public void initPool(String fileName) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        //获得输入流
        FileInputStream fis = new FileInputStream(fileName);

        //创建Properties对象，让文件的数据加载到Properties中
        Properties props = new Properties();
        props.load(fis);

        //每取出一对key-value值就根据value值创建对象
        //并把数据添加到Map中
        for(String name : props.stringPropertyNames()) {
            objectPool.put(name,createObject(props.getProperty(name)));
        }

        fis.close();

    }

    //根据key从Map中取出对应的对象
    public Object getObject(String name) {
        return objectPool.get(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IOException {

        ObjectPoolFactory pf = new ObjectPoolFactory();
        pf.initPool("obj.txt");

        System.out.println(pf.getObject("a"));
        System.out.println(pf.getObject("b"));
    }
}
