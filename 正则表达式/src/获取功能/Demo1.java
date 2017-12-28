package 获取功能;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asd on 2016/10/19.
 */
/*
    获取功能:
        Pattern 和Matcher类的使用

    Pattern:
        指定为字符串的正则表达式必须首先被编译为此类的实例
        可将得到的模式用于创建 Matcher 对象，依照正则表达式，该对象可以与任意字符序列匹配
        执行匹配所涉及的所有状态都驻留在匹配器中，所以多个匹配器可以共享同一模式。

    Matcher:
        通过解释 Pattern 对 character sequence 执行匹配操作的引擎。

        通过调用模式的 matcher 方法从模式创建匹配器。创建匹配器后，可以使用它执行三种不同的匹配操作：

            matches 方法尝试将整个输入序列与该模式匹配。

            lookingAt 尝试将输入序列从头开始与该模式匹配。

            find 方法扫描输入序列以查找与该模式匹配的下一个子序列。



    模式和匹配器的基本使用顺序:
        1:把正则表达式编译成模式对象
            Pattern p = Pattern.compile("a*b");
        2:通过模式对象获取匹配器对象,这个时候传入的参数是被匹配的字符串
            Matcher m = p.matcher("aaaaab");
        3:调用匹配器对象的功能
            boolean b = m.matches();

    如果只匹配一次,可以就直接使用字符串的形式来匹配
        String s = "aaaaab";
		String regex = "a*b";
		boolean bb = s.matches(regex);
		System.out.println(bb);

 */
public class Demo1 {

    public static void main(String[] args) {
        //把正则表达式编译成模式对象
        Pattern pattern = Pattern.compile("a*b");

        //通过模式对象获取匹配器对象,这个时候传入的参数是被匹配的字符串
        Matcher matcher = pattern.matcher("aaaab");

        //调用匹配器对象的功能
        boolean b = matcher.matches();

        System.out.println(b);
    }


}
