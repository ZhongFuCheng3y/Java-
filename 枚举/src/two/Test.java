package two;

/**
 * Created by asd on 2016/11/15.
 */
public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setGrade(Grade.C);


        String c = Grade.C.getValue();
        System.out.println(c);
    }

}
