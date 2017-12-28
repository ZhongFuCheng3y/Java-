package StringBuffer练习;

/**
 * Created by asd on 2016/9/19.
 */
/*
    为什么我们需要用到类之间的转换?
        1:我们把A转为B,其实就是为了用B功能
        2:我们把B转为A,我们要的是A类型,所以要转回来

    String和StringBuffer的相互转换
         String  - StringBuffer
            1:StringBuffer sb = new StringBuffer()
                sb.append(s)
            2:StringBuffer sb = new StringBuffer(s)
         StringBuffer - String
            1:sb.toString()
            2:String s = new String(sb);
 */
/*
    需求:
        把数组拼接成一个字符串
    分析:
        1:我们可以用String做拼接
        2:我们也可以用StringBuffer做拼接
            显然,我们会使用StringBuffer
 */
public class StringBufferTest {
    public static void main(String[] args) {
        // 定义一个数组
        int[] arr = { 44, 33, 55, 11, 22 };
        String s = arrayToString(arr);
        System.out.println(s);
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else if (i < arr.length) {
                sb.append(arr[i] + ", ");
            }

        }
        sb.append("]");


        return sb.toString();
    }

}
