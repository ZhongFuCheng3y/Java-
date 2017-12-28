package java����崴������ʹ��;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ozc on 2016/8/30.
 */
/*
    ����
        ���������ļ������ݴ�������
    ʵ�֣�
        1���������ļ������ݼ��ص�Properties��
        2������һ��Map����---������������ļ���key��value(����)
        3������value��ֵ���÷���ֱ�Ӵ���ʵ��
        4������key��ֵ��ȡvalue(Ҳ������һ������������ʵ��)������ڿ���̨��
 */
public class ObjectPoolFactory {

    //����һ��Map����
    private Map<String, Object> objectPool = new HashMap<>();

    //����һ����������ķ���
    private Object createObject(String clazzName) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        //���Class����
        Class clazz = Class.forName(clazzName);

        //ʹ��clazz��Ӧ����Ĭ�Ϲ���������ʵ��
        return clazz.newInstance();

    }

    //����ָ���ļ���ʼ������أ������������ļ���������
    public void initPool(String fileName) throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {

        //���������
        FileInputStream fis = new FileInputStream(fileName);

        //����Properties�������ļ������ݼ��ص�Properties��
        Properties props = new Properties();
        props.load(fis);

        //ÿȡ��һ��key-valueֵ�͸���valueֵ��������
        //����������ӵ�Map��
        for(String name : props.stringPropertyNames()) {
            objectPool.put(name,createObject(props.getProperty(name)));
        }

        fis.close();

    }

    //����key��Map��ȡ����Ӧ�Ķ���
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
