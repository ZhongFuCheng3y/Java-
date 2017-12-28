package 替换功能;

/**
 * Created by asd on 2016/10/19.
 */
/*
    替换功能:
        String类的public String replaceAll(String regex, String replacement)
        使用给定的replacement替换次字符串所有匹配给定的正则表达式的子字符串
 */
public class Demo1 {
    public static void main(String[] args) {
        //定义一个字符串
        String s = "helloqq12345worldkh622112345678java";

        //把数字全部干掉
        String regex = "\\d";
        String ss = " ";

        String result = s.replaceAll(regex, ss);
        System.out.println(result);

    }
}
