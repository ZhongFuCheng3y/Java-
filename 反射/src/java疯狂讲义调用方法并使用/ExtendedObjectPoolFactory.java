package java�������÷�����ʹ��;

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
 * �����ļ����ǣ�
 *           a=javax.swing.JFrame
             b=javax.swing.JLabel
             #set the title of a
             a%title=Test Title
 */
/*
    1������properties���󣬽������ļ������ݼ���properties��
    2������Map���󣬽�Properties�ϵ����ݸ���key��vaule(����)�������
    3��value��ʼ�����Ƕ����÷��䴴��ʵ������ŵ�Map��
    4������key���Ի��value--Ҳ���Ƕ���
    5���õ��������ǾͿ��Ե��÷�����
 */
public class ExtendedObjectPoolFactory {

    //����һ��Map����ǰ���Ƕ�������������ʵ�ʶ���
    private Map<String, Object> objectPool = new HashMap<>();

    //����Properties������ָ�������ļ����ص�Properties��
    private Properties config = new Properties();

    //���ļ����ݼ��ص�Properties��
    public void init(String fileName) throws IOException {

        //��ȡ������
        FileInputStream fis = new FileInputStream(fileName);

        //��������
        config.load(fis);

        //�ر���
        fis.close();
    }

    //����һ����������ķ��������������Ϳ��Դ�����Ӧ��ʵ��
    private Object createObject(String clazzName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //��ȡClass����
        Class clazz = Class.forName(clazzName);

        //ʹ��clazz��Ӧ���Ĭ�Ϲ���������ʵ��
        return clazz.newInstance();
    }

    //��ʼ�������
    public void initPool() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        for (String name : config.stringPropertyNames()) {

            //���key������%(�ٷֺ�)��ֱ�Ӵ������󣬲���������ӵ�Map��
            if (!name.contains("%")) {
                objectPool.put(name, createObject(config.getProperty(name)));
            }
        }
    }

    //key�����%(�ٷֺ�)�ͱ�ʾ    %(�ٷֺ�)ǰ�Ǳ������֣����ǿ���setter������
    public void initProperty() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        for (String name : config.stringPropertyNames())
            if (name.contains("%")) {

                //�������ļ���key��%�ָ�
                String[] objAndProp = name.split("%");

                //ȡ���ٷֺ�ǰ(������)----����keyȡ��value---Ҳ���Ƕ���
                Object target = getObject(objAndProp[0]);

                //��ȡsetter��������set + ������ĸ��д�� + ʣ�²���
                String mtdName = "set" + objAndProp[1].substring(0, 1).toUpperCase() + objAndProp[1].substring(1);

                //��ȡĿ������Class
                Class targetClass = target.getClass();

                //��ȡMethod����,ϣ�����õ���setter����
                Method mtd = targetClass.getMethod(mtdName,String.class);

                //ͨ��Method��invoke()ִ��setter����,������value
                mtd.invoke(target,config.getProperty(name));



            }
    }

    //����keyȡ��value---Ҳ���Ƕ���
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
