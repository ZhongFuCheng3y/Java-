package List的特有功能;

import java.util.*;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        存储自定义对象并遍历,用普通for循环。(size()和get()结合)
    分析:
        1:创建集合对象
        2:创建学生对象
        3:把学生对象添加到集合对象中
        4:遍历,size()和get的结合
 */
public class ListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        List list = new ArrayList();

        //创建学生对象
        Student student = new Student("1", 02);
        Student student1 = new Student("2", 12);
        Student student2 = new Student("4", 22);
        Student student3 = new Student("3", 32);

        //把学生对象添加到集合中
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //for遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student student4 = (Student) list.get(i);
            System.out.println(student4.getName()+"`````````"+ student4.getAge());
        }
    }
}
