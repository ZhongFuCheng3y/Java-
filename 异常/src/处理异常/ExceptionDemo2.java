package 处理异常;

/**
 * Created by asd on 2016/9/5.
 */
/*
    注意：
        1：多个异常catch时，父子关系的异常，父必须在后面
        2：try一旦出了问题，就会在这里把问题抛出去，然后和catch匹配
 */
public class ExceptionDemo2 {

    public static void main(String[] args) {
        //method1();
        //method2();
        method4();


    }

    //最终版的
    private static void method4() {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 3};

        //最大的异常要放在最后
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);

            //我们可以用最大的异常处理
            System.out.println("这里出现了一个异常，你不太清楚是谁，怎么办");
        } catch (ArithmeticException e) {
            System.out.println("除数不能是0");
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("你访问了不该访问的索引");
        }catch (Exception e) {
            System.out.println("出问题了");
        }
    }

    // 一个异常
    public static void method1() {

        // 第一阶段
        int a = 10;
        // int b = 2;
        int b = 0;

        try {
            System.out.println(a / b);
        } catch (ArithmeticException ae) {
            System.out.println("除数不能为0");
        }

        // 第二阶段
        System.out.println("over");
    }

    //两个异常
    public static void method2() {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("除数不能是0");
        }

        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问了不该访问的索引");
        }
        System.out.println("over");
    }



}
