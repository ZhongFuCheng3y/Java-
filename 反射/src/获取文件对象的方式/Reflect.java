package 获取文件对象的方式;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    反射其实就是通过class文件对象，去使用该对象的成员变量，构造方法，成员方法

    想要使用反射，我先要得到class文件对象，其实也就是得到Class类的对象

    Class类中分别又用三个类代表的成员变量，成员方法，构造方法
    Class类：
        成员变量  - Field
        成员方法  - Constructor
        构造方法  - Method

    获取class文件对象的方式：
        1：Object类的getClass()方法
        2：数据类型的静态属性class
        3：Class类中的静态方法：
                public static Class ForName(String className)

    一般我们要使用哪一种呢？
        在开发中我们一般使用第三种，因为它是一个字符串，而不是一个具体的类型，我们可以把这样的字符串配置到配置文件中

 */
public class Reflect {

    public static void main(String[] args) throws ClassNotFoundException {
        //方式1：Objcet类的getClass()方法
        Person p = new Person();
        Class c = p.getClass();

        //方式2：数据类型的静态属性class
        Class c2 = Person.class;

        //方式3：
        Class c3 = Class.forName("获取文件对象的方式.Person");

        //三种方式拿的都是同一个class文件，所以返回true
        System.out.println(c3 == c);

    }


}
