package ArrayList去除集合中重复的值;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求：
        去除集合中自定义对象的重复值(对象的成员变量值都相同)
    分析:
        1:创建集合对象
        2:创建学生对象
        3:把学生对象添加到集合对象中
        4:创建一个新的集合对象
        5:遍历旧的集合对象,判断元素在新的集合中是否存在
            不是:添加进去
            是:不搭理
    要点:
        contains()方法依赖的的equals(),所以,我们要在Student类中重写euquals()
 */
public class ArrayListDemo3 {

    public static void main(String[] args) {
        //创建集合对象
        ArrayList arrayList = new ArrayList();

        //创建学生对象
        Student student = new Student("你好", 1);
        Student student5 = new Student("你好", 1);
        Student student1 = new Student("你好1", 1);
        Student student2 = new Student("你好2", 1);
        Student student3 = new Student("你好1", 1);
        Student student4 = new Student("你好2", 1);
        Student student6 = new Student("你好3", 1);

        //把对象添加到集合中去
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        arrayList.add(student4);
        arrayList.add(student5);
        arrayList.add(student6);

        //创建新的集合
        ArrayList arrayList1 = new ArrayList();


        //遍历旧的集合,判断元素在新的集合中是否存在
        for (int i = 0; i < arrayList.size(); i++) {
            Student student7 = (Student) arrayList.get(i);
            if (!arrayList1.contains(student7)) {
                arrayList1.add(student7);

            }
        }

        //遍历新的集合
        Iterator iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            Student student7 = (Student) iterator.next();

            System.out.println(student7.getName()+"``````"+ student7.getAge());

        }


    }
}
