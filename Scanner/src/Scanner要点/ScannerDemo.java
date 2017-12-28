package Scanner要点;

/**
 * Created by asd on 2016/9/18.
 */
/*
    要点:
        1:用于接收键盘录入数据
        2:InputStream in  = System.in
        3:InputMismatchException：输入的和你想要的不匹配

 */

/**
 *  常用方法:
 *      public int nextInt():获取一个int类型
 *      public String nextLine():获取一个String类型的值
 *
 */
/*
    问题:
        先获取一个数值,再获取一个字符串,会出现问题
    原因:
        就是那个换行符号的问题
            --我输入了10,按回车,它以为我的字符串就是回车.所以出了问题
    解决:
        1:先获取一个数值后,在创建一个新的键盘录入对象获取字符串
        2:把所有的数据都先按照字符串获取,然后要什么,你就转换什么.
 */
public class ScannerDemo {
}
