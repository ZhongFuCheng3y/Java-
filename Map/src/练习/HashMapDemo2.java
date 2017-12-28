package 练习;

import HashMap.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by asd on 2016/9/18.
 */
/* 广外南国
 * 		gz	广州校区
 * 			jc	基础班
 * 					王力宏		30
 * 					李静磊		32
 * 			jy	就业班
 * 					郎朗		    31
 * 					柳岩		    33
 * 	大集合:HashMap<String,HashMap<String,ArrayList<Student>>>
 *
 * 	分析:
 * 	    1:传智播客有多个校区
 * 	    2:广州校区
 * 	        -就业班
 * 	            -学生
 * 	        -基础班
 * 	            -学生
 * 	    3:广州作为key,就业班和基础班作为value
 * 	    4:就业班有学生对象
 * 	    5:基础班也有学生对象
 * 	    6:就业班作为key,学生对象作为value
 * 	    7:基础班作为key,学生对象作为value
 *
 *
 *
 */
/*
    分析:
        1:创建大集合对象
        2:创建小HashMap对象
        3:创建学生对象
        4:创建ArrayList对象
        5:把学生对象存进ArrayList,以及ArrayList和String存进小HashMap对象中
        6:把小HashMap以及String存进大集合对象中
        7:遍历
            a:获取大集合的所有key
            b:遍历key找到value
            c:value是一个HashMap,再找到小HashMap所有的key
            d:遍历小key找到value
            e:value是一个ArrayList
            f:遍历ArrayList
 */
public class HashMapDemo2 {
    public static void main(String[] args) {
        //创建大集合对象
        HashMap<String, HashMap<String, ArrayList<Student>>> map = new HashMap<>();

        //创建小HashMap对象
        HashMap<String, ArrayList<Student>> hashMap = new HashMap<>();

        //创建学生对象
        Student student1 = new Student("王力宏", 30);
        Student student2 = new Student("李靓蕾", 32);

        //创建ArrayList对象
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(student1);
        list.add(student2);

        //ArrayList以及String存进小HashMap对象中
        hashMap.put("基础班", list);

        //创建学生对象
        Student student3 = new Student("郎朗", 31);
        Student student4 = new Student("柳岩", 33);

        //创建ArrayList对象
        ArrayList<Student> list2 = new ArrayList<Student>();
        list2.add(student3);
        list2.add(student4);

        //ArrayList以及String存进小HashMap对象中
        hashMap.put("就业班", list2);

        //把小HashMap以及String存进大集合对象中
        map.put("广州", hashMap);

        //获取大集合的key
        Set<String> set = map.keySet();

        //遍历大集合的key集合
        for (String s : set) {
            System.out.println(s);

            //根据key获取value
            HashMap<String, ArrayList<Student>> listHashMap = map.get(s);

            //获取小集合的key
            Set<String> set1 = listHashMap.keySet();

            //遍历小集合的key
            for (String s1 : set1) {
                System.out.println(s1);

                //根据key获取value
                ArrayList<Student> arrayList = listHashMap.get(s1);

                //遍历ArrayList集合
                for (Student student8 : arrayList) {
                    System.out.println(student8.getName() + "---" + student8.getAge());
                }
            }
        }



    }
}
