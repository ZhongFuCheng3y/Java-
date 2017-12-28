package 处理异常;

/**
 * Created by asd on 2016/9/5.
 */

/**
 * 在jdk7出现了一个新的异常方案：
 * try{
 * <p>
 * }catch(异常名1| 异常名2| ....变量) {
 * <p>
 * }
 * 注意：
 * 1：处理方式是一致的
 * 2：多个异常间必须是平级关系
 */
public class ExceptionDemo3 {

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = {1, 2, 4};

        //jdk7处理方案
        try{
            System.out.println(a/b);
            System.out.println(arr[3]);
        }catch (ArithmeticException |ArrayIndexOutOfBoundsException e) {
            System.out.println("出问题了");
        }
        System.out.println("over");
    }
}
