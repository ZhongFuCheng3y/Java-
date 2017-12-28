package 集合的嵌套遍历;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/17.
 */
/*
    需求:
        1:一个学生代表一个对象
        2:一个集合代表一个班级
        3:每个班级都是ArrayList<Student>
        4:现在我有多个集合存储,应该是这样的ArrayList<ArrayList<Student>>
        5:ArrayList<ArrayList<Student>>,里面的ArrayList<Student>仅仅是一个元素
    分析:
        1:创建学生对象
        2:将学生对象存进集合中
        3:将班级存进大集合中
        4:遍历大集合

 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //创建大集合对象
        ArrayList<ArrayList<Student>> arrayLists = new ArrayList<>();


        //创建第一个班级
        ArrayList<Student> students = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("唐僧", 30);
        Student s2 = new Student("孙悟空", 29);
        Student s3 = new Student("猪八戒", 28);
        Student s4 = new Student("沙僧", 27);
        Student s5 = new Student("白龙马", 26);

        //学生进班级
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        //班级进入大集合
        arrayLists.add(students);

        //创建第二个班级
        ArrayList<Student> students1 = new ArrayList<>();

        //创建学生对象
        Student s11 = new Student("诸葛亮", 30);
        Student s22 = new Student("司马懿", 28);
        Student s33 = new Student("周瑜", 26);

        //学生进班
        students1.add(s11);
        students1.add(s22);
        students1.add(s33);

        //班级进入大集合
        arrayLists.add(students1);

        //遍历学生系统的人
        for (ArrayList<Student> arrayList : arrayLists) {
            for (Student student : arrayList) {
                System.out.println(student.getName() + "::::" + student.getAge());

            }
        }





    }
}
