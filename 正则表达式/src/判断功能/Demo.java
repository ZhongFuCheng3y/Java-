package �жϹ���;

/**
 * Created by asd on 2016/10/19.
 */

import java.util.Scanner;

/**
 * String���public boolean matches(String regex)
 * <p>
 * ����:
 * �ж��ֻ������Ƿ�����Ҫ��?
 */
/*

     :�����ֻ�����Ĺ���
     * 			13436975980
     * 			13688886868
     * 			13866668888
     * 			13456789012
     * 			13123456789
     * 			18912345678
     * 			18886867878
     * 			18638833883
    ����:
        1:����¼���ֻ�����
        2:�����ֻ�����
        3:���ù����ж�
        4:������
 */
public class Demo {

    public static void main(String[] args) {
        //����¼���ֻ�����
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������ֻ�����:");
        String phone = scanner.nextLine();

        //�����ֻ�����
        String regex = "1[38]\\d{9}";

        //���ù���,�ж�
        boolean flag = phone.matches(regex);

        //������
        System.out.println("flag:" + flag);
    }
}
