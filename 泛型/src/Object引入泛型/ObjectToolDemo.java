package Object���뷺��;

/**
 * Created by asd on 2016/9/13.
 */
/*
    Object���뷺��:
        1:���ڵ�ʱ��,����ʹ��Object���������������
        2:����ת����û���κ������,����������ת�͵�ʱ�������������ת��������
        3:��ʵ�����ĳ����ǲ���ȫ��,������jdk5�Ժ������˷���,����˳���İ�ȫ��.
 */
public class ObjectToolDemo {

    public static void main(String[] args) {

        ObjectTool ot = new ObjectTool();
        // ����ʹ��
        ot.setObject(new Integer(27));
        Integer i = (Integer) ot.getObject();
        System.out.println("�����ǣ�" + i);

        ot.setObject(new String("����ϼ"));
        String s = (String) ot.getObject();
        System.out.println("�����ǣ�" + s);

        System.out.println("---------");
        ot.setObject(new Integer(30));
        // ClassCastException
        String ss = (String) ot.getObject();
        System.out.println("�����ǣ�" + ss);
    }
}
