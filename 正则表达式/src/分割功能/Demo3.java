package 分割功能;

import java.util.Arrays;

/**
 * Created by asd on 2016/10/19.
 */
/*
  我有如下一个字符串:"91 27 46 38 50"
    请写代码实现最终输出结果是："27 38 46 50 91"

          分析：
          		A:定义一个字符串
          		B:把字符串进行分割，得到一个字符串数组
          		C:把字符串数组变换成int数组
          		    a:先获取字符串数组的长度
                    b:遍历字符串数组,将每个元素转变成是int类型,加入到int数组中
          		D:对int数组排序
          		    a:使用Arrays工具类
          		E:把排序后的int数组在组装成一个字符串
          		    a:用到StringBuilder
          		F:输出字符串

*/
public class Demo3 {
    public static void main(String[] args) {
        //定义字符串
        String s = "91 27 46 38 50";

        //对字符串进行分割,得到字符串数组
        String[] strings = s.split(" ");

        //将字符串数组转换成int数组

        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }

        //对int数组进行排序
        Arrays.sort(ints);

        //把排序后的int数组在组装成一个字符串
        StringBuilder stringBuilder = new StringBuilder();

        //遍历int数组,把数组的元素添加到StringBuilder中
        for (int i = 0; i < ints.length; i++) {
            stringBuilder.append(ints[i]).append(" ");
        }

        //将StringBuilder转换成字符串
        String s2 = stringBuilder.toString();
        System.out.println(s2);



    }
}
