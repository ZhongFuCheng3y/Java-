package �ָ��;

/**
 * Created by asd on 2016/10/19.
 */
/*
    �ָ��ַ�����ϰ
 */
public class Demo2 {
    public static void main(String[] args) {
        //����һ���ַ���
        String s = "aa,bb,cc";

        //ֱ�ӷָ�
        String[] strings = s.split(",");

        //�������ָ���ַ���
        for (String string : strings) {
            System.out.println(string);
        }
        System.out.println("----------------");

        //����һ���ַ���
        String s1 = "aa.bb.cc";
        String[] strings1 = s1.split("\\.");

        //�������ָ���ַ���
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

        //Ӳ���ϵ�·��������Ӧ����\\���\
        String s4 = "E:\\JavaSE\\day14\\avi";
        String[] str4Array = s4.split("\\\\");
        for (int x = 0; x < str4Array.length; x++) {
            System.out.println(str4Array[x]);
        }
        System.out.println("---------------------");

    }
}
