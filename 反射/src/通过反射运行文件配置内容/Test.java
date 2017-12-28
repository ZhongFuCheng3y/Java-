package 通过反射运行文件配置内容;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    通过反射运行配置文件
        1：将配置文件的数据加载到Properties仲
        2：根据键获取值
        3：获取Class对象
        4：根据Class对象获取Constructor对象
        5：Constructor.newInstance()创建对象
        6: 根据Class对象获取Method对象
        7：调用invoke()方法
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    /*
        反射前的做法：
            // Student s = new Student();
            // s.love();
            // Teacher t = new Teacher();
            // t.love();
            // Worker w = new Worker();
            // w.love();
     */
        //反射后的做法
        Properties prop = new Properties();
        FileReader fr = new FileReader("class.txt");
        prop.load(fr);
        fr.close();

        //根据键获取值
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //获取Class对象
        Class c = Class.forName(className);

        //根据Class对象获取Constructor对象
        Constructor con = c.getConstructor();

        //Constructor.newInstance()创建对象
        Object obj = con.newInstance();

        //获取Method对象
        Method method = c.getMethod(methodName);

        //调用方法
        method.invoke(obj);


    }


}
