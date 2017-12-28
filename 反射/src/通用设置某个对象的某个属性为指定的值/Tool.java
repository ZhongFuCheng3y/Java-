package ͨ������ĳ�������ĳ������Ϊָ����ֵ;

import java.lang.reflect.Field;

/**
 * Created by ozc on 2016/8/29.
 */

/*
    1������Ҫ��ȡ��������Class����
    2��ͨ��Class�����ȡField����----getDeclaredField
    3��ȡ�����ʼ��--------setAccessible
    4��Field.set()ʵ�ֹ���
 */
public class Tool {
    public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {

        //��ȡClass����
        Class c = obj.getClass();

        //��ȡ�ö����propertyName��Ա����
        Field field = c.getDeclaredField(propertyName);

        //ȡ�����ʼ��
        field.setAccessible(true);

        //������ĳ�Ա������ֵΪָ����ֵ
        field.set(obj,value);
    }
}
