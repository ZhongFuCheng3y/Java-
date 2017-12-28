package TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by asd on 2016/9/17.
 */
/*
    TreeMap:是基于红黑树的Map接口的实现。
    需求:
        TreeMap<Student,String>
        键:Student
        值：String
    分析:
        1:创建集合对象,传入Comparator实现类
        2:创建学生对象
        3:创建元素并添加
        4:遍历集合
 */


public class TreeMapDemo {

    public static void main(String[] args) {
        TreeMap<Student, String> map = new TreeMap<Student, String>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //主要条件
                int num = o1.getAge() - o2.getAge();

                //次要条件
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

                return num2;
            }

        });

        //创建学生对象
        Student s1 = new Student("潘安", 30);
        Student s2 = new Student("柳下惠", 35);
        Student s3 = new Student("唐伯虎", 33);
        Student s4 = new Student("燕青", 32);
        Student s5 = new Student("唐伯虎", 33);

        //添加元素进集合
        map.put(s1, "宋朝");
        map.put(s2, "元朝");
        map.put(s3, "明朝");
        map.put(s4, "清朝");
        map.put(s5, "汉朝");

        //获取key集合
        Set<Student> set = map.keySet();

        //遍历key集合
        for (Student student : set) {
            String value = map.get(student);
            System.out.println(student + "---------" + value);
        }
    }
}
