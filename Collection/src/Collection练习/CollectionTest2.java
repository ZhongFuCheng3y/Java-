package Collection练习;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    需求:
        存储自定义对象并遍历Student(name,age)
    分析:
        1:创建学生类
        2:创建学生对象
        3:创建集合对象
        4:把学生对象添加到集合中
        5:获取迭代器对象
        6:遍历迭代器
 */
public class CollectionTest2 {
    public static void main(String[] args) {
        //创建学生对象
        Student student = new Student("ozc", 20);
        Student student1 = new Student("ozc1", 201);

        //创建集合对象
        Collection c = new ArrayList();

        //把学生对象添加到集合中
        c.add(student);
        c.add(student1);

        //获取迭代器对象
        Iterator iterator = c.iterator();

        //遍历迭代器
        while (iterator.hasNext()) {
            //强制转换
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + s.getAge());


        }
    }
}
