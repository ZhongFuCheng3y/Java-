package view;

import dao.StudentForDom4j;
import domain.Student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("添加学生 (a)  查找学生(b)  删除学生(c)");
        System.out.print("请输入操作类型：");


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String type = br.readLine();

        if(type.equalsIgnoreCase("a")){
            //添加学生

            try{
                System.out.print("请输入学生姓名：");
                String name = br.readLine();

                System.out.print("请输入学生准考证号：");
                String examid = br.readLine();

                System.out.print("请输入学生身份证号：");
                String idcard = br.readLine();

                System.out.print("请输入学生所在地：");
                String location = br.readLine();

                System.out.print("请输入学生成绩：");
                String grade = br.readLine();


                Student student = new Student();
                student.setExamid(examid);
                student.setGrade((int) Double.parseDouble(grade));
                student.setIdcard(idcard);
                student.setLocation(location);
                student.setName(name);

                StudentForDom4j dao = new StudentForDom4j();
                dao.add(student);
                System.out.println("恭喜，录入成功！！！");
            }catch (Exception e) {
                System.out.println("对不起，录入失败！！");
            }


        }else if(type.equalsIgnoreCase("b")){

            try {
                //查找学生
                StudentForDom4j dao = new StudentForDom4j();

                System.out.println("你要查询的学生的考号是多少");

                String examid = br.readLine();
                Student student = dao.find(examid);
                if (student != null) {
                    System.out.println("学生的名字是:" + student.getName());
                    System.out.println("学生的成绩是:" + student.getGrade());
                    System.out.println("学生的地点是:" + student.getLocation());
                    System.out.println("学生的身份证号是:" + student.getIdcard());
                    System.out.println("学生的考号是:" + student.getExamid());

                } else {
                    System.out.println("你输入的是什么垃圾玩意");

                }


            } catch (Exception e) {
                e.getMessage();
            }



        }else if(type.equalsIgnoreCase("c")){
            //删除学生
        }else{
            System.out.println("不支持此类操作！！！");
        }

    }

}
