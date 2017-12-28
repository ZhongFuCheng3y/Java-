package throw和throws区别;

/**
 * Created by asd on 2016/9/6.
 */
/*
    throw:
        如果出现了异常情况,我们可以把异常抛出,这个时候抛出的应该是异常的对象

    throws:
        1:用在方法声明的后面,跟的是异常类名
        2:可以跟多个异常类名,用逗号隔开
        3:表示抛出异常,由该方法的调用者处理
        4:throws表示出现异常的一种可能性,并不一定会发生

    throw:
        1:用在方法体内,跟的是异常对象名
        2:只能抛出一个异常对象名
        3:表示抛出异常,由方法体内的语句处理
        4:throw是抛出了异常,执行了throw则一定抛出了某种异常

 */
public class ExceptionDemo {
    public static void main(String[] args) {
        method();
    }

    /**
     * method和method2两个方法的区别就是方法声明上有没有抛出
     * 运行期异常完全可以不用在方法声明上抛出异常
     */

    private static void method() {
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }
    }


    public static void method2() throws Exception{
        int a = 10;
        int b = 0;
        if (b == 0) {
            throw new ArithmeticException();
        } else {
            System.out.println(a / b);
        }
    }


}
