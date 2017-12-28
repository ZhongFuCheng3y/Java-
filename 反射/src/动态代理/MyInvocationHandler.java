package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by ozc on 2016/8/29.
 */
public class MyInvocationHandler implements InvocationHandler {
    //因为实际上的增删改查操作还是自己弄的，所以需要调用自己的方法。
    private Object target;//目标对象

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        //这里调用的实际上就是UserDaoImpel的方法
        Object result = method.invoke(target,args);

        System.out.println("日志记录");

        //下面返回的是代理对象
        return result;

    }
}
