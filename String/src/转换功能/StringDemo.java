package ת������;

/**
 * Created by asd on 2016/9/18.
 */
/*
    String���valueOf():���԰��κε�����ת�����ַ���
    byte[] getBytes():���ַ���ת�����ֽ�����
    char[] toCharArray():���ַ���ת�����ַ�����
    String toLowerCase():���ַ���ת����Сд
    String toUpperCase():���ַ���ת���ɴ�д
    String concat(String str):���ַ���ƴ��

 */
/*
     ����
        ��һ���ַ���������ĸת�ɴ�д������ΪСд��(ֻ����Ӣ�Ĵ�Сд��ĸ�ַ�)
     ����:
        1:��ȡ��һ����ĸ
        2:��ȡ��������ĸ
        3:����һ����ĸ��д
        4:��������ĸСд
        5:ƴ��
 */
public class StringDemo {
    public static void main(String[] args) {
        String s = "jfsdakWWWERdsf";

        String result = s.substring(0, 1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(result);

    }
}
