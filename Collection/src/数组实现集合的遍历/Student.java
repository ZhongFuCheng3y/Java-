package 数组实现集合的遍历;

/**
 * Created by asd on 2016/9/12.
 */
public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {

    }

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }
}
