package 序列化;

import java.io.*;

/**
 * Created by asd on 2016/9/11.
 */
/*
    序列化:
        把对象像流一样的方式存入文本文件中或网络中,对象----流数据(ObjectOutputStream)
        --简单讲就是把对象写到文本文件
    反序列化:
        把文本文件中的流对象数据或网络中的流对象数据还原成对象..流数据---对象(ObjectInputStream)

    Serializable
        1:是一个标记性接口,没有任何的实现方法
        2:实现Serializable才能对类进行序列化或反序列化

    transient
        1:该关键字声明不需要序列化的成员变量

    序列化步骤:
        1:创建序列化对象
        2:创建要被序列化的对象
        3:调用writeObject()方法
        4:关闭资源

    反序列化步骤:
        1:创建反序列化对象
        2:调用readObject()方法
        3:关闭资源
 */

/**
 *  要点:
 *      1:实现序列化的类本身就有一个标记值
 *      2:每次修改java文件的时候,class文件的id值就会发生改变
 *      3:在读取文件的时候,class文件的id会和原来的读取id比较,如果不相等就会出问题
 *      4:只要将id固定下来,不管java文件怎么改变,读取的还是原来的那个class文件.
 */



public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        write();
        read();
    }

    private static void write() throws IOException {
        //创建序列化对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("n.txt"));

        //创建被序列化的对象
        Person p = new Person("你好", 18);

        //调用writeObject()方法.
        oos.writeObject(p);

        //关闭资源
        oos.close();
    }

    private static void read() throws IOException, ClassNotFoundException {
        //创建反序列化对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("n.txt"));

        //调用readObject()方法
        Object o = ois.readObject();
        System.out.println(o);

        //关闭资源
        ois.close();
    }
}
