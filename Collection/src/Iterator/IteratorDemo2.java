package Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/12.
 */
/*
    需求:
        用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历
    分析:
        1:创建集合对象
        2:创建学生对象
        3:把学生对象添加到集合中
        4:获取迭代器对象
        5:迭代器遍历
 */
public class IteratorDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c = new ArrayList();

        //创建学生对象
        Student student = new Student("nihao", 02);
        Student student1 = new Student("nihao1", 12);
        Student student2 = new Student("nihao2", 22);

        //把学生对象添加到集合中
        c.add(student);
        c.add(student1);
        c.add(student2);

        //获取迭代器对象
        Iterator iterator = c.iterator();

         System.out.println(((Student) iterator.next()).getName() + "---"
         + ((Student) iterator.next()).getAge());

        //迭代器遍历
//        while (iterator.hasNext()) {
//            //强制转换
//            Student student3 = (Student) iterator.next();
//
//            System.out.println(student3.getName() + "---" + student3.getAge());
//
//        }
    }
}
