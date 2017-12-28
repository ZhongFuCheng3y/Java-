package 键盘录入信息写到文本文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by asd on 2016/9/9.
 */
/*
    需求:
        键盘录入5个学生信息(姓名,语文成绩,数学成绩,英语成绩),按照总分从高到低存入文本文件
    分析:
        1:从高到低存---TreeSet
        2:录入键盘数据,写到TreeSet中
        3:将TreeSet的数据写到文本文件中
 */
public class StudentDemo {

    public static void main(String[] args) throws IOException {
        //创建TreeSet对象
        TreeSet<Student> treeSet = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num1 = s2.getSum() - s1.getSum();
                int num = num1 == 0 ? s2.getChinese() - s1.getChinese() : num1;
                int num2 = num == 0 ? s2.getMath() - s1.getMath() : num;
                int num3 = num2 == 0 ? s2.getEnglish() - s1.getEnglish() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;

                return num4;

            }
        });

        //键盘录入存入5个学生的数据
        for(int i=1; i<=5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入学生的名字");
            String name = scanner.nextLine();
            System.out.println("语文成绩是:");
            int chinese = scanner.nextInt();
            System.out.println("数学成绩是:");
            int math = scanner.nextInt();
            System.out.println("英语成绩是:");
            int english = scanner.nextInt();

            Student student = new Student();
            student.setName(name);
            student.setChinese(chinese);
            student.setEnglish(english);
            student.setMath(math);

            treeSet.add(student);
        }

        //遍历集合,把数据写到文本文件

        //封装目的地
        BufferedWriter bw = new BufferedWriter(new FileWriter("ooo.txt"));

        bw.write("学生的信息如下:");
        bw.newLine();
        bw.flush();

        //遍历结合
        for(Student s : treeSet) {
            //由于我们需要用到字符串的拼接,所以我们用StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()+", "+s.getChinese() + ", " + s.getMath()+ ", " +s.getEnglish()+", " + s.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //关闭资源
        bw.close();


    }
}
