package Character;

/**
 * Created by asd on 2016/9/19.
 */
/*
    Character���ڶ����װ��һ����������,charֵ
    �����ṩ�˼��ַ���,ȷ���ַ������(Сд��ĸ,��д��ĸ,�ȵ�)�����ַ��Ӵ�дת����Сд

 */

import java.util.Scanner;

/**
 * ���췽��:
 * Character(char value)
 * <p>
 * �жϷ���:
 * public static boolean isUpperCase(char ch)
 * public static boolean isLowerCase(char ch)
 * public static boolean isDigit(char ch)
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 * <p>
 * ת��:
 * public static char toUpperCase(char ch)
 * public static char toLowerCase(char ch)
 */
/*
    ����:
         ͳ��һ���ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ�����(�����������ַ�)
    ����:
        1:����¼��һ���ַ���
        2:��������ͳ�Ʊ���
        3:���ַ���ת�����ַ�����
        4:�����ַ�����,�ж��ַ��Ǵ�Сд��������
        5:���ͳ�Ʊ���

 */
public class CharacterDemo {

    public static void main(String[] args) {
        //����¼���ַ���
        Scanner scanner = new Scanner(System.in);
        System.out.println("������һ���ַ���:");
        String s = scanner.nextLine();

        //��������ͳ�Ʊ���
        int number = 0;
        int low = 0;
        int upper = 0;


        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                number++;
            } else if (Character.isUpperCase(chars[i])) {
                upper++;
            } else if (Character.isLowerCase(chars[i])) {
                low++;
            }
        }

        //�������ͳ�Ʊ���
        System.out.println("����:"+number);
        System.out.println("��д:"+upper);
        System.out.println("Сд:" + low);
    }
}
