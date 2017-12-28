package 简单使用List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        List存储自定义对象

    分析:
        1:创建List对象
        2:创建学生对象
        3:把学生对象添加到List集合中
        4:获取Iterator对象
        5:遍历集合

 */
public class ListDemo2 {

    public static void main(String[] args) {
        //创建List对象
        List list = new ArrayList();

        //创建学生对象
        Student student = new Student("q", 2);
        Student student1 = new Student("w", 3);
        Student student2 = new Student("e", 4);

        //把学生对象添加到List对象中
        list.add(student);
        list.add(student1);
        list.add(student2);

        //获取Iterator对象
        Iterator iterator = list.iterator();

        //遍历集合
        while (iterator.hasNext()) {

            Student student3 = (Student) iterator.next();
            System.out.println(student3.getName() + ":::" + student3.getAge());


        }

    }

}
