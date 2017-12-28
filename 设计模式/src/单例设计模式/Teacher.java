package 单例设计模式;

/**
 * Created by asd on 2016/9/28.
 */
/*
    懒汉式
 */
public class Teacher {
    private Teacher() {
    }

    private static Teacher t = null;

    public synchronized Teacher getTeacher() {
        if (t == null) {
            t = new Teacher();
        }
        return t;
    }
}
