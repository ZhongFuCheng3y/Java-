package ͨ�����������ļ���������;

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
    ͨ���������������ļ�
        1���������ļ������ݼ��ص�Properties��
        2�����ݼ���ȡֵ
        3����ȡClass����
        4������Class�����ȡConstructor����
        5��Constructor.newInstance()��������
        6: ����Class�����ȡMethod����
        7������invoke()����
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
    /*
        ����ǰ��������
            // Student s = new Student();
            // s.love();
            // Teacher t = new Teacher();
            // t.love();
            // Worker w = new Worker();
            // w.love();
     */
        //����������
        Properties prop = new Properties();
        FileReader fr = new FileReader("class.txt");
        prop.load(fr);
        fr.close();

        //���ݼ���ȡֵ
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        //��ȡClass����
        Class c = Class.forName(className);

        //����Class�����ȡConstructor����
        Constructor con = c.getConstructor();

        //Constructor.newInstance()��������
        Object obj = con.newInstance();

        //��ȡMethod����
        Method method = c.getMethod(methodName);

        //���÷���
        method.invoke(obj);


    }


}
