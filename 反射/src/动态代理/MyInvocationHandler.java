package ��̬����;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ozc on 2016/8/29.
 */
public class MyInvocationHandler implements InvocationHandler {
    //��Ϊʵ���ϵ���ɾ�Ĳ���������Լ�Ū�ģ�������Ҫ�����Լ��ķ�����
    private Object target;//Ŀ�����

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Ȩ��У��");
        //������õ�ʵ���Ͼ���UserDaoImpel�ķ���
        Object result = method.invoke(target,args);

        System.out.println("��־��¼");

        //���淵�ص��Ǵ������
        return result;

    }
}
