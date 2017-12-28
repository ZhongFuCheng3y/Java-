package 了解StringBuffer;

/**
 * Created by asd on 2016/9/19.
 */
/*
    StringBuffer:
        线程安全的可变字符串

    StringBuffer和String的区别:
        1:前者长度和内容可变,后者不可变
        2:前者做字符串的拼接,不会浪费太多的资源

 */

/**
 *  构造函数:
 *      public StringBuffer()
 *      public StringBuffer(int capacity):指定容量
 *      public StringBuffer(String str):指定字符串内容
 *
 *  方法:
 *      public int capacity():容量 ---理论值
 *      public int length():长度(字符数)--实际值
 *
 *  添加功能:
 *      public StringBuffer append(String str):可以把任何类型的数据添加到字符串缓冲区,返回的是字符串缓冲区本身
 *      public StringBuffer insert(int offset, String str):可以把任意的类型插入到字符串缓冲区,返回的是字符串缓冲区本身
 *
 *  删除功能:
 *      public StringBuffer deleteCharAt(int index):删除指定位置的字符,返回本身
 *      public StringBuffer delete(int start, int end):删除指定开始位置到指定结束位置的内容
 *
 *  替换功能:
 *      public StringBuffer replace(int start, int end ,String str):从start到end用str替换
 *
 *  反转功能:
 *      public StringBuffer reverse()
 *
 *  截取功能:
 *      注意,返回值类型不再是StringBuffer
 *      public String substring(int start)
 *      public String substring(int start, int end)
 */

public class StringBufferDemo {
}
