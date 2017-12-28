package HashMap;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/17.
 */
/*
    HashMap:
        基于哈希表的Map接口实现
        哈希表的作用是用来保证键的唯一性

 */
/*
    需求:
        HashMap<String,Student>
        键：String	学号
        值：Student 学生对象
    分析:
        1:创建集合对象
        2:创建学生对象
        3:创建key-value键值对,添加到集合中
        4:获取集合中的所有的key
        5:遍历key集合,根据key获取值
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, Student> map = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("周星驰", 58);
        Student s2 = new Student("刘德华", 55);
        Student s3 = new Student("梁朝伟", 54);
        Student s4 = new Student("刘嘉玲", 50);

        //创建元素,并添加到集合中
        map.put("55555", s4);
        map.put("2345", s2);
        map.put("5555", s1);
        map.put("1234", s3);


        //获取HashMap集合中所有的key
        Set<String> set = map.keySet();

        //遍历key集合,根据键获取值
        for (String s : set) {
            Student student = map.get(s);
            System.out.println("学号是:" + s + "---姓名是:" + student.getName() + "---年龄是:" + student.getAge());

        }

    }
}
