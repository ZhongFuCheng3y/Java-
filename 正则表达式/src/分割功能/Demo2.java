package 分割功能;

/**
 * Created by asd on 2016/10/19.
 */
/*
    分割字符串练习
 */
public class Demo2 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "aa,bb,cc";

        //直接分割
        String[] strings = s.split(",");

        //遍历被分割的字符串
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("----------------");

        //定义一个字符串
        String s1 = "aa.bb.cc";
        String[] strings1 = s1.split("\\.");

        //遍历被分割的字符串
        for (String s2 : strings1) {
            System.out.println(s2);
        }
        System.out.println("-------------");

        String s3 = "aa    bb                cc";
        String[] str3Array = s3.split(" +");
        for (int x = 0; x < str3Array.length; x++) {
            System.out.println(str3Array[x]);
        }
        System.out.println("---------------------");

        //硬盘上的路径，我们应该用\\替代\
        String s4 = "E:\\JavaSE\\day14\\avi";
        String[] str4Array = s4.split("\\\\");
        for (int x = 0; x < str4Array.length; x++) {
            System.out.println(str4Array[x]);
        }
        System.out.println("---------------------");

    }
}
