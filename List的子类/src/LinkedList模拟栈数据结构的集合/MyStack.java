package LinkedListģ��ջ���ݽṹ�ļ���;

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

    //ȡ��Ԫ����ȡ���������
    public Object get() {
        return link.removeLast();

    }

    //�жϼ����Ƿ�Ϊ��
    public boolean isEmpty() {
        return link.isEmpty();
    }

}
