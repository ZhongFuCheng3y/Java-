package List�����й���;

/**
 * Created by asd on 2016/9/13.
 */

/*
    List�������еı�������:
        size()��get()�������ʹ��
    ����:
        1:�������϶���
        2:���Ԫ�ص����϶���
        3:for��������,��size()��get()���
 */


import java.util.ArrayList;
import java.util.List;

/**
 * ��ӹ���:
 *      void add(int index , Object element):��ָ����λ�����Ԫ��
 * ��ȡ����:
 *      Object get(int index):��ָ��λ�û�ȡԪ��
 * �б������:
 *      ListIterator listIterator():List�������еĵ�����
 * ɾ������:
 *      Object remove(int index):��������ɾ��Ԫ��,���ر�ɾ����Ԫ��
 * �޸Ĺ���:
 *      Object set(int index, Object element):���������޸�Ԫ��,���ر��޸ĵ�Ԫ��
 */
public class ListDemo {

    public static void main(String[] args) {
        //�������϶���
        List list = new ArrayList();

        //���Ԫ�ص����϶���
        list.add("hello");
        list.add("world");
        list.add("java");

        //����
        for (int i = 0; i < list.size(); i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }

}
