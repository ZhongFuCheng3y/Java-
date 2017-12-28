package 处理异常;

/**
 * Created by asd on 2016/9/5.
 */

/**
 * 我们如何处理异常？
 * 1：try....catch...finally
 * 2:throws抛出
 */
/*
    注意：
        1：try里面的代码越少越好
        2：catch里面必须有内容，哪怕是一个简单的提醒
 */
public class ExceptionDemo {

    public static void main(String[] args) {
        //第一阶段
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);

        }catch (ArithmeticException ae) {
            System.out.println("除数不能是0");
        }

        /**
         * 当我们增加了try ...catch之后，我们就发现第二阶段是可以运行了
         * jvm没有立即终止了程序
         */
        //第二阶段
        System.out.println("over");
    }
}
