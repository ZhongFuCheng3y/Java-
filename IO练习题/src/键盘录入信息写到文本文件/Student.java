package 键盘录入信息写到文本文件;

/**
 * Created by asd on 2016/9/9.
 */
public class Student {
    //姓名
    private String name;

    //语文成绩
    private int chinese;

    //英语成绩
    private int english;

    //数学成绩
    private int math;


    public Student() {
    }

    public Student(String name, int chinese, int english, int math) {
        this.name = name;
        this.chinese = chinese;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getChinese() {
        return chinese;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }

    public int getSum() {
        return this.chinese + this.math + this.english;
    }
}
