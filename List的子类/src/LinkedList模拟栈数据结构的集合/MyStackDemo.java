package LinkedListģ��ջ���ݽṹ�ļ���;

/**
 * Created by asd on 2016/9/13.
 */
/*
    ����:
        LinkedListģ��ջ���ݽṹ�ļ���
    ����:
        1:������Ҫ����һ����,ȥģ��ջ,�ײ����LinkedList(��ʵ���ǰ�װ)
        2:ջ���ص�----�Ƚ����
        3:����ȡ��Ԫ�غ�isEmpty()���,�����ǿ���,���ǾͲ�ȡ��
        4:ȡ��Ԫ������ʹ��removeLast(),�Ƚ����


 */
public class MyStackDemo {
    public static void main(String[] args) {
        //��������
        MyStack myStack = new MyStack();

        //���Ԫ��
        myStack.add("hello");
        myStack.add("world");
        myStack.add("java");

        //ȡ��Ԫ��
        while (!myStack.isEmpty()) {
            System.out.println(myStack.get());
        }
    }

}
