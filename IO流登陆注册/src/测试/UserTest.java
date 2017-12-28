package ����;

import dao.UserDao;
import game.GuessNumber;
import impl.UserDaoImpl;
import pojo.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/12.
 */
public class UserTest {
    public static void main(String[] args) throws IOException {
        while (true) {
            //��ӭ����
            System.out.println("---------��ӭ����----------");
            System.out.println("1 : ��½");
            System.out.println("2 : ע��");
            System.out.println("3 : �˳�");
            System.out.println("���������ѡ��:");

            //����¼��
            Scanner scanner = new Scanner(System.in);

            //Ϊ�˺����¼����Ϣ����,����������¼��ȫ�����ַ���
            String choiceString = scanner.nextLine();

            //����ʵ��Dao�ӿڵ��ྭ��Ҫ��while�����õ�,�����Ҷ���������
            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("------��½����-------");

                    System.out.println("�������û���:");
                    String username = scanner.nextLine();

                    System.out.println("����������:");
                    String passworld = scanner.nextLine();

                    //���õ�½�Ĺ���
                    boolean flag = ud.isLogin(username, passworld);

                    if (flag) {
                        System.out.println("��½�ɹ���,���������Ϸ��");
                        System.out.println("��������? y/n");
                        while (true) {
                            String result = scanner.nextLine();
                            if (result.equalsIgnoreCase("y")) {
                                GuessNumber.start();
                                System.out.println("�㻹���������? y/m");
                            }else {
                                break;
                            }
                        }
                        System.out.println("ллʹ��,��ӭ�´�������");
                        System.exit(0);

                    }else {
                        System.out.println("��������û����������д���.��½ʧ��!");

                    }
                    break;
                case "2":
                    System.out.println("------ע�����-------");
                    System.out.println("�������û���:");
                    String newUserName = scanner.nextLine();
                    System.out.println("����������:");
                    String newPassWorld = scanner.nextLine();

                    //���û����������װ����������
                    User user = new User();
                    user.setPassworld(newPassWorld);
                    user.setUsername(newUserName);

                    //����UserDao��ʵ�����ע�Ṧ��
                    ud.regist(user);
                    System.out.println("ע��ɹ�");
                    break;
                case "3":
                    System.out.println("ллʹ��,��ӭ�´�����");
                    System.exit(0);
                    break;
            }
        }
    }
}
