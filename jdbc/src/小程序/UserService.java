package С����;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/10.
 */
/*
    ����:
        �û�����
            1:ע��
            2:��½
            3:ת��

 */
public class UserService {
    public static void main(String[] args) {

        System.out.println("��ð�");
        System.out.println("1:ע��");
        System.out.println("2:��½");
        System.out.println("3:ת��");
        System.out.println("��������Ĳ���");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        switch (number) {
            case "1":
                register1(scanner);
                break;
            case "2":
                login1(scanner);
                break;
            case "3":
                giveMoney(scanner);
                break;
        }
    }

    /*
        ����:
            1:��ȡ�û��������Ϣ
            2:��Ҫ����֤,����ת���˻�����Ƿ��㹻
            ----����ʼ�ĵط�
            3:����ת���˻������
            4:����ת���˻������
            ---�ύ����ĵط�

     */
    private static void giveMoney(Scanner scanner) {
        //��ȡ�û��������Ϣ
        System.out.println("������ת�˲���!!!!");
        System.out.println("�����������˺�:");
        String fromUser = scanner.nextLine().trim();
        System.out.println("�������տ��˵��˻�:");
        String toUser = scanner.nextLine().trim();
        System.out.println("������ת�����");
        String money = scanner.nextLine().trim();




        try {

            //��Ҫ����֤
            String countSql = "SELECT money FROM user_table WHERE name=?";

            //��ȡ����
            Connection connection = DBUtil.getConnection();

            //��ȡpreparedStatement����
            PreparedStatement preparedStatement = connection.prepareStatement(countSql);

            //����?�ŵ�ֵ
            preparedStatement.setString(1, fromUser);

            //ִ��sql���
            ResultSet resultSet = preparedStatement.executeQuery();
            int result = 0;
            if (resultSet.next()) {
                result = resultSet.getInt("money");
            }else{
                System.out.println("û�и��û�"+fromUser);
                System.exit(-1);
            }

            //�ж�����Ƿ��㹻
            if (Integer.parseInt(money) > result) {
                System.out.println("���Ǯ����ת");
            }else{

                //�������ͬһ������,��ʹת���˻����˲�����,ת�����˵�Ǯ������.
                //�Ȱ�ת�����˵����ĵ�

                //�ر��Զ��ύ
                //��ʼ�����������,��Ϊ��ʼִ��DML������.
                connection.setAutoCommit(false);
                String fromSql = "UPDATE user_table SET money = money-? WHERE name=?";
                PreparedStatement preparedStatement2 = connection.prepareStatement(fromSql);
                preparedStatement2.setInt(1,Integer.parseInt(money));
                preparedStatement2.setString(2,fromUser);
                preparedStatement2.executeUpdate();

                //��ת���˻����˵����ĵ�
                String toSql = "UPDATE user_table SET money=money+? WHERE name = ?";
                PreparedStatement preparedStatement3 = connection.prepareStatement(toSql);
                preparedStatement3.setInt(1,Integer.parseInt(money));
                preparedStatement3.setString(2,toUser);
                if (preparedStatement3.executeUpdate() > 0) {
                    System.out.println("ת�˳ɹ�");
                    connection.commit();
                } else {
                    System.out.println("ת��ʧ��:û������տ���");
                    //����ڶ��θ��β���ʧ��,��ô���β����͵�����ʧ��,Ӧ�ûع�����
                    connection.rollback();

                }

                connection.setAutoCommit(true);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
        ����:
            1:�û������˺ź�����
            2:�������ݿ�
            3:ִ�в�ѯ���,�鿴�Ƿ��м�¼
     */
    private static void login1(Scanner scanner) {
        System.out.println("�����ǵ�½����!!");

        System.out.println("��������qq�˺�");
        String string = scanner.nextLine();
        int user = Integer.parseInt(string);

        System.out.println("������������");
        String pwd = scanner.nextLine();


        try {
            //�������ݿ�
            Connection connection = DBUtil.getConnection();

            //ִ�в�ѯ���,�鿴�Ƿ��м�¼
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user_table WHERE id=? AND password=?");
            preparedStatement.setInt(1, user);
            preparedStatement.setString(2, pwd);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("��½�ɹ���!!");
            } else {
                System.out.println("�û������������д�!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /*
        ����:
            1:�û�����˺�,����,����,Ǯ,����
            2:��ȡ���ݿ�����
            3:�����ݿ��������

        id��������,���ǿ��Բ�ѯ����id��,�ټ�1,�����Ͳ����ظ���
   */
    private static void register1(Scanner scanner) {
        System.out.println("������ע�����");

        System.out.println("������������");
        String name = scanner.nextLine();

        System.out.println("��������qq�˺�");
        String string = scanner.nextLine();
        int user = Integer.parseInt(string);

        System.out.println("������������");
        String pwd = scanner.nextLine();

        System.out.println("������������");
        String email = scanner.nextLine();

        System.out.println("�����������");
        int money = scanner.nextInt();


        try {
            //��ȡ���ݿ�����
            Connection connection = DBUtil.getConnection();

            //�����ݿ��������
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user_table VALUES(?,?,?,?,?)");
            preparedStatement.setInt(1, user);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, pwd);
            preparedStatement.setInt(4, money);
            preparedStatement.setString(5, email);
            preparedStatement.executeUpdate();

            System.out.println("ע��ɹ�!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBUtil.closeConnection();
        }
    }

}
