package 泛型方法;

/**
 * Created by asd on 2016/9/17.
 */
/*
    我们学习了泛型了,但是谁说我的方法要跟类的类型一致呢?
        ----引出了泛型方法

    泛型方法:
        把方法定义在方法上,方法可以接受任意类型的参数
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        //创建对象
        ObjectTool tool = new ObjectTool();

        //调用方法,传入的参数是什么类型,返回值就是什么类型
        tool.show("hello");
        tool.show(12);
        tool.show(12.5);

    }
}
