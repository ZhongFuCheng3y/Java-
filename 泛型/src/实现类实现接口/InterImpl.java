package ʵ����ʵ�ֽӿ�;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ʵ����ʵ�ֽӿ�,���������
        1:�Ѿ�֪����ʲô������
        2:����֪����ʲô����--ʵ����Ҳ��Ҫ��<T>
            ������˵,�ڶ������������
 */

/**
 * ��һ�����:
 */
/*
public class InterImpl implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);

    }
}
*/

/**
 * �ڶ������:
 *      ʵ����ҲҪ��<T>���͵Ĵ���.
 *
 */
public class InterImpl<T> implements Inter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);

    }
}
