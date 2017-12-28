package 练习;

/**
 * Created by asd on 2016/9/18.
 */
/*
 * 统计大串中小串出现的次数
 * 举例：
 * 		在字符串"woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun"
 * 结果：
 * 		java出现了5次
 *
 * 分析:
 	*   1:获取出现java的下标,下标+3截取字符串
 	*   2:循环条件就是-1
 *
 */
public class StringTest2 {
    public static void main(String[] args) {
        String maxString = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String minString = "java";

        /*
        int count = 0;
        while (true) {
            int i = 0;
            i = s.indexOf("java");
            if (i != -1) {
                count++;
                s = s.substring(i + 3);
            } else {
                break;
            }
        }
        */

        /**
         * 简化版的
         */
        int index=0;
        int count=0;
        //先查，赋值，判断
        while((index=maxString.indexOf(minString))!=-1){
            count++;
            maxString = maxString.substring(index + minString.length());
        }

        System.out.println(count);
    }
}
