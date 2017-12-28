package LinkedList模拟栈数据结构的集合;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        LinkedList模拟栈数据结构的集合
    分析:
        1:我们是要创建一个类,去模拟栈,底层的是LinkedList(其实就是包装)
        2:栈的特点----先进后出
        3:我们取出元素和isEmpty()结合,集合是空了,我们就不取了
        4:取出元素我们使用removeLast(),先进后出


 */
public class MyStackDemo {
    public static void main(String[] args) {
        //创建对象
        MyStack myStack = new MyStack();

        //添加元素
        myStack.add("hello");
        myStack.add("world");
        myStack.add("java");

        //取出元素
        while (!myStack.isEmpty()) {
            System.out.println(myStack.get());
        }
    }

}
