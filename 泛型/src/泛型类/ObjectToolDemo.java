package ������;

/**
 * Created by asd on 2016/9/13.
 */
/*
    1:���Բ���ǿת��
    2:�ڱ���ʱ�ھͿ��Գ�������
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        //��������ָ��Ԫ������
        ObjectTool<String> tool = new ObjectTool<>();

        tool.setObj(new String("�Ӹ���"));
        String s = tool.getObj();
        System.out.println(s);


        //��������ָ��Ԫ������
        ObjectTool<Integer> objectTool = new ObjectTool<>();
        /**
         * ���������������ﴫ�����String���͵�,���ڱ���ʱ�ھ�ͨ��������.
         */
        objectTool.setObj(10);
        int i = objectTool.getObj();
        System.out.println(i);
    }
}
