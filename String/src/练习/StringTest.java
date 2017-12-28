package 练习;

/**
 * Created by asd on 2016/9/18.
 */
/*
 * 需求：
 *      把数组中的数据按照指定个格式拼接成一个字符串
 * 举例：
 * 		int[] arr = {1,2,3};
 * 输出结果：
 *		"[1, 2, 3]"
 *
 * 分析:
 *      1:创建一个数组
 *      2:创建一个空字符串
 *      3:遍历数组,如果数据不是最后一个元素,就拼接元素,空格和逗号
 *      4:如果是最后一个元素,就加上最后一个元素并且是"]"
 *      4:输出字符串
 */
public class StringTest {
    public static void main(String[] args) {
        //创建一个数组
        int[] arr = {1, 2, 3};

        //创建一个空字符串
        String s = "[";

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {

                s = s + arr[i];
                s = s + "]";
            } else {
                s = s + arr[i] + ", ";
            }
        }
        System.out.println(s);


    }
}
