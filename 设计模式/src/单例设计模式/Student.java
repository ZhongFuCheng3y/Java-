package 单例设计模式;

/**
 * Created by asd on 2016/9/28.
 */
/*
    步骤:
        1:将构造函数私有
        2:在成员变量自己创建一个对象
        3:通过共有方法访问
 */
/*
    饿汉式:
        直接在成员变量中创建对象
        提供一个公有方法返回对象
 */
public class Student {
    private Student(){}

    private static Student s = new Student();

    public static Student getStudent() {
        return s;
    }
}
