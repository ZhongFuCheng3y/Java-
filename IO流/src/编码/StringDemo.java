package 编码;

import java.util.Arrays;

/**
 * Created by asd on 2016/9/7.
                */
/*
    1:
        String(byte[] bytes, String charsetName):通过指定的字符集解码字符数组
    2:
        byte[] getBytes(String charsetName):通过指定的字符集把字符串编码为字符数组

    编码:
        把看得懂的变成看不懂的
        String ---byte[]
    解码:
        把看不懂的变成看得懂的
        byte[] ---String


    编码的问题其实很简单:
        只要编码解码的格式是一致就行了.
 */
        public class StringDemo {
            public static void main(String[] args) {
                String s= "你好";

                //String ---byte[]
        /**
         * 默认的编码是GBK
         */
        byte[] bytes = s.getBytes();
        //[-60, -29, -70, -61]
        System.out.println(Arrays.toString(bytes));

        //byte[] --- String
        String ss = new String(bytes);
        System.out.println(ss);

    }
}
