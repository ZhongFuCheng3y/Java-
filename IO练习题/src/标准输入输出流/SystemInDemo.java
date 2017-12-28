package 标准输入输出流;

/**
 * Created by asd on 2016/9/11.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * System.in 标准输入流,是从键盘获取数据的
 * InputStream is = System.in;
 */
/*
    键盘录入数据:
        1:main()的args接收参数
        2:Scanner(JDK5以后)
            Scanner sc = new Scanner(System.in);
            String SystemOutDemo2 = sc.nextLine();
            int x = sc.nextInt();
        3:通过字符缓冲流包装标准输入流实现
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
/*
    标准输入流如何一次获取一行数据
        1:我们知道,readLine()方法在BufferedReader才有
        2:BufferedReader是操作字符的
        3:我们需要用到转换流---InputStreamReader
        4:代码:
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */
public class SystemInDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        System.out.println("请输入一个字符串:");
        line = br.readLine();
        System.out.println(line);

        System.out.println("请输入一个数子");
        line = br.readLine();
        System.out.println(line);

    }


}
