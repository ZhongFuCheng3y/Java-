package 通用设置某个对象的某个属性为指定的值;

/**
 * Created by ozc on 2016/8/29.
 */
public class ToolDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Person p = new Person();
        Tool t = new Tool();
        t.setProperty(p,"name","ozc");

        System.out.println(p);
    }
}

class Person {
    private String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
