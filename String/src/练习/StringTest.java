package ��ϰ;

/**
 * Created by asd on 2016/9/18.
 */
/*
 * ����
 *      �������е����ݰ���ָ������ʽƴ�ӳ�һ���ַ���
 * ������
 * 		int[] arr = {1,2,3};
 * ��������
 *		"[1, 2, 3]"
 *
 * ����:
 *      1:����һ������
 *      2:����һ�����ַ���
 *      3:��������,������ݲ������һ��Ԫ��,��ƴ��Ԫ��,�ո�Ͷ���
 *      4:��������һ��Ԫ��,�ͼ������һ��Ԫ�ز�����"]"
 *      4:����ַ���
 */
public class StringTest {
    public static void main(String[] args) {
        //����һ������
        int[] arr = {1, 2, 3};

        //����һ�����ַ���
        String s = "[";

        //��������
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {

                s = s + arr[i];
                s = s + "]";
            } else {
                s = s + arr[i] + ", ";
            }
        }
        System.out.println(s);


    }
}
