package �ָ��;

import java.util.Scanner;

/**
 * Created by asd on 2016/10/19.
 */
/*
    �ָ��:
        String���public String[] split(String regex)
        ���ݸ���������ʽ��ƥ�����ַ���

    ����:
        �ٺ��������ͼ�Ե,�䰮��,QQ
  		��������
  			�Ա�Ů
  			��Χ��"18-24"

  		age>=18 && age<=24
 */
/*
    ����:
        1:����һ������������Χ
        2:�������
        3:���÷���,����ַ���
        4:��ȡ��ֺ��ַ���������
        5:�ж�ֵ�Ƿ��ڷ�����
 */
public class Demo1 {
    public static void main(String[] args) {

        //�������䷶Χ
        String ages = "18-24";

        //�������
        String regex = "-";

        //���÷���,����ַ���
        String[] strings = ages.split(regex);

        //��ȡ��ֺ���ַ���������
        int start = Integer.parseInt(strings[0]);
        int end = Integer.parseInt(strings[1]);

        //����¼������
        Scanner scanner = new Scanner(System.in);
        System.out.println("�������������:");
        int age = scanner.nextInt();

        //�ж�ֵ�Ƿ��ڷ�����

        if (age >= start && age <= end) {
            System.out.println("�������Ҫ�ҵ���");
        } else {
            System.out.println("������䲻�԰�");
        }


    }
}
