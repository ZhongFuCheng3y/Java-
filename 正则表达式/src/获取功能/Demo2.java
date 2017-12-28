package 获取功能;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by asd on 2016/10/19.
 */
/*
  获取功能：
          获取下面这个字符串中由三个字符组成的单词
          da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?
*/
/*
    步骤:
        1:将正则表达式编译成模式对象
        2:通过模式对象获取匹配器,传入的参数是要匹配的字符串
        3:调用匹配器的方法
 */
public class Demo2 {
    public static void main(String[] args) {

        //将正则表达式编译成模式对象
        Pattern pattern = Pattern.compile("\\b\\w{3}\\b");

        //通过模式对象获取匹配器对象
        Matcher matcher = pattern.matcher("da jia ting wo shuo,jin tian yao xia yu,bu shang wan zi xi,gao xing bu?");

        //调用匹配器的方法
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }

}
