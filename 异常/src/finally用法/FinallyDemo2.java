package finally用法;

/**
 * Created by asd on 2016/9/6.
 */

/**
 * final:最终----可以修饰类,成员变量,成员方法
 * finally:用于释放资源,代码肯定会被执行---除非jvm提前退出了
 * finalize:是Object类的一个方法,用于垃圾回收
 */

public class FinallyDemo2 {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    /**
     * 1:catch里面的return a;-----实际上是return 30;
     * 2:返回路径已经形成了
     * 3:发现了finally,执行finally内容  return a; a=40;
     * 4:再次回到以前的返回路径,继续走return 30;
     */
    private static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
        } finally {
            a = 40;
         //   return a;
        }
        return a;


    }


}
