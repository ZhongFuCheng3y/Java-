package java疯狂讲义调用方法并使用;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ozc on 2016/8/30.
 */

/**
 * 配置文件上是：
 *           a=javax.swing.JFrame
             b=javax.swing.JLabel
             #set the title of a
             a%title=Test Title
 */
/*
    1：创建properties对象，将配置文件的内容加载properties上
    2：创建Map对象，将Properties上的内容根据key和vaule(对象)存放起来
    3：value开始并不是对象，用反射创建实例，存放到Map中
    4：根据key可以获得value--也就是对象
    5：拿到对象我们就可以调用方法。
 */
public class ExtendedObjectPoolFactory {

    //定义一个Map对象，前面是对象名，后面是实际对象
    private Map<String, Object> objectPool = new HashMap<>();

    //创建Properties对象，让指定属性文件加载到Properties中
    private Properties config = new Properties();

    //将文件数据加载到Properties中
    public void init(String fileName) throws IOException {

        //获取输入流
        FileInputStream fis = new FileInputStream(fileName);

        //加载数据
        config.load(fis);

        //关闭流
        fis.close();
    }

    //定义一个创建对象的方法，根据类名就可以创建对应的实例
    private Object createObject(String clazzName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //获取Class对象
        Class clazz = Class.forName(clazzName);

        //使用clazz对应类的默认构造器创建实例
        return clazz.newInstance();
    }

    //初始化对象池
    public void initPool() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        for (String name : config.stringPropertyNames()) {

            //如果key不包含%(百分号)就直接创建对象，并将对象添加到Map中
            if (!name.contains("%")) {
                objectPool.put(name, createObject(config.getProperty(name)));
            }
        }
    }

    //key如果含%(百分号)就表示    %(百分号)前是变量名字，后是控制setter方法名
    public void initProperty() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        for (String name : config.stringPropertyNames())
            if (name.contains("%")) {

                //将配置文件的key按%分割
                String[] objAndProp = name.split("%");

                //取出百分号前(变量名)----根据key取出value---也就是对象
                Object target = getObject(objAndProp[0]);

                //获取setter方法名：set + “首字母大写” + 剩下部分
                String mtdName = "set" + objAndProp[1].substring(0, 1).toUpperCase() + objAndProp[1].substring(1);

                //获取目标对象的Class
                Class targetClass = target.getClass();

                //获取Method对象,希望调用的是setter方法
                Method mtd = targetClass.getMethod(mtdName,String.class);

                //通过Method的invoke()执行setter方法,参数是value
                mtd.invoke(target,config.getProperty(name));



            }
    }

    //根据key取出value---也就是对象
    public Object getObject(String name) {
        return objectPool.get(name);
    }

    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        ExtendedObjectPoolFactory epf = new ExtendedObjectPoolFactory();
        epf.init("extObj.txt");
        epf.initPool();
        epf.initProperty();
        System.out.println(epf.getObject("a"));

    }


}
