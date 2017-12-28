package ����Խ�����ͼ��;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    ����
        �Ҹ���һ��ArrayList<Integer>��һ������������������������һ��String���͵����ݣ���ν����
    ������
        1����ͨ������£������ǲ������String���ͽ����ϵģ���Ϊ���͹涨��Integer����
        2�������е�Integer�����Ǹ����������ģ��������õ������ֽ����ļ�����--Ҳ����Դ��
        3�����͵�Ĭ��������Object
   ʵ�֣�
        1:  �������϶���
        2�� ͨ�����϶����ȡClass����
        3�� ͨ��Class�����ȡMethod����
        4�� ����invoke����ʵ�ֹ���
 */
public class ArrayListDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //�������϶���
        ArrayList<Integer> array = new ArrayList<>();

        //��ȡClass����
        Class c = array.getClass();

        //����Class�����ȡMethod����
        Method method = c.getMethod("add",Object.class);

        //���÷���
        method.invoke(array,"hello");
        method.invoke(array,"world");
        method.invoke(array,"java");

        System.out.println(array);
    }

}
