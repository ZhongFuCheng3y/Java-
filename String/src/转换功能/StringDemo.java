package 转换功能;

/**
 * Created by asd on 2016/9/18.
 */
/*
    String类的valueOf():可以把任何的类型转换成字符串
    byte[] getBytes():把字符串转换成字节数组
    char[] toCharArray():把字符串转换成字符数组
    String toLowerCase():把字符串转换成小写
    String toUpperCase():把字符串转换成大写
    String concat(String str):把字符串拼接

 */
/*
     需求：
        把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
     分析:
        1:获取第一个字母
        2:获取其他的字母
        3:将第一个字母大写
        4:将其余字母小写
        5:拼接
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "jfsdakWWWERdsf";

        String result = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(result);

    }
}
