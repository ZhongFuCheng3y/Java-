package Properties;

/**
 * Created by asd on 2016/9/11.
 */

import java.util.Random;
import java.util.Scanner;

/**
 * ����һ�����ֵ�С��Ϸ
 */
/*
    ����:
        1:����һ���������
        2:����һ��ͳ�Ʊ���
        3:����¼������,ֱ�����������
 */
public class NumberGame {
    private NumberGame() {

    }

    public static void start() {
        //����һ�� 0 ~ 100 �������
        Random random = new Random();
        int number = random.nextInt(100);

        //����һ��ͳ�Ʊ���
        int count = 0;

        //����¼������,ֱ����������
        System.out.println("��Ҫ����0-100������:");
        while (true) {
            //����¼������,����ȡ������

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();

            if (i > number) {
                System.out.println("��µ�����" + i + "����");
                count++;
            } else if (i < number) {
                System.out.println("��µ�����" + i + "С��");
                ++count;
            } else {
                System.out.println("��¶���!!" + "�����" + ++count + "����");
                break;
            }
        }

    }
}
