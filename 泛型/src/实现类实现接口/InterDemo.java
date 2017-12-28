package 实现类实现接口;

/**
 * Created by asd on 2016/9/17.
 */
public class InterDemo {
    public static void main(String[] args) {
        //测试第一种情况
        //Inter<String> i = new InterImpl();
        // i.show("hello");

        //第二种情况测试
        Inter<String> ii = new InterImpl<>();
        ii.show("100");


    }
}
