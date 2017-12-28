package LinkedList模拟栈数据结构的集合;

import java.util.LinkedList;

/**
 * Created by asd on 2016/9/13.
 */

public class MyStack {
    LinkedList link;

    public MyStack() {
        link = new LinkedList();
    }


    public void add(Object o){
        link.add(o);
    }

    //取出元素是取出最上面的
    public Object get() {
        return link.removeLast();

    }

    //判断集合是否为空
    public boolean isEmpty() {
        return link.isEmpty();
    }

}
