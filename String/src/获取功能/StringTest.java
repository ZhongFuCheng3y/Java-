package 获取功能;

/**
 * Created by asd on 2016/9/18.
 */
/*
    遍历一个字符串:
        1:获取长度,length()
        2:根据位置获取元素,charAt()
 */
public class StringTest {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "fsdjkfsfda";

        //遍历
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));

        }
    }
}
