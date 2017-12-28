package 了解Integer;

/**
 * Created by asd on 2016/9/18.
 */
/*
    如果要我们求int最大的数值和最小的数值,我们会很难
    如果我们要任意把一个整数转换成8,16,2进制,这也有些麻烦

    所以,java针对基本数据类型进行更多的操作,更方便的操作,提供了相对应的类型
        包装类型

    构造方法:
        public Integer(int value)
        public Integer(String s):这个字符串必须是数字组成


    int类型和String类型转换:
        int -String
            String.valueOf(number)
        String - int
            Integer.ParseInt(s)

    常用的基本进制转换:
        1:public static String toBinaryString(int i)
        2:public static String toOctalString(int i)
        3:public static String toHexString(int i)

    十进制到其他进制的转换
        public static String toString(int i,int radix)

    其他进制到十进制
        public static int parseInt(String s,int radix)

    要点:
        Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据

 */
public class IntegerDemo {
}
