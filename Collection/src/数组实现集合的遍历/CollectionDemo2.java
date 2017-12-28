package 数组实现集合的遍历;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by asd on 2016/9/12.
 */
/*
    需求:
        用集合存储5个学生对象,并把学生对象进行遍历
    分析:
        1:创建学生类
        2:创建学生对象
        3:创建集合对象
        4:把学生对象添加到集合
        5:集合转换成数组
        6:遍历数组

 */
public class CollectionDemo2 {

    public static void main(String[] args) {
        //创建学生对象
        Student student = new Student("1", 2);
        Student student1 = new Student("2", 3);
        Student student2 = new Student("3", 4);

        //创建集合对象
        Collection c = new ArrayList();

        //把学生对象添加到集合
        c.add(student);
        c.add(student1);
        c.add(student2);

        //把集合转换成数组
        Object[] objects = c.toArray();

        //遍历数组
        for (Object object : objects) {
            //向下转型,变成是Student类型的
            Student student3 = (Student) object;
            System.out.println(student3.getName() + " ::::" + student3.getAge());

        }
    }
}
