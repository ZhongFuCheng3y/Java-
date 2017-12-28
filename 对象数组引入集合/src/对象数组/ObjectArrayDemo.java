package 对象数组;

/**
 * Created by asd on 2016/9/12.
 */
/*
    需求:
        我有2个学生,把学生的信息存储到数组中,遍历数组.获取学生的信息
    分析:
        1:创建学生类
        2:创建学生数组
        3:创建学生对象,并赋值
        4:把对象添加到数组
        5:遍历学生数组

 */
public class ObjectArrayDemo {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[2];

        //创建学生对象,并赋值
        Student student = new Student("1", 22);
        Student student1 = new Student("2", 23);

        //把对象添加到数组
        students[0] = student;
        students[1] = student1;

        //遍历学生数组,获取信息
        int x = 1;
        for (Student s : students) {
            System.out.println("第" +x+"个学生的名字是:" + s.getName() + "年龄是:" + s.getAge());

        }
    }
}
