package ִ��dml���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/8.
 */
/*

    ������ַ���¼��,Ҫִ��dml���
    ���ǳ��鷳,��Ϊ��Ҫ���ϵ�ƴ�ӳ���һ��sql��ִ�е����

    ����,���ǳ�����PreparedStatement,������������sql����б����������.

 */
public class PreparedStatementDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("����������");
        String content = scanner.nextLine();
        System.out.println("��������");
        int  adid = scanner.nextInt();
        System.out.println("���������id");
        int mid = scanner.nextInt();

        Connection connection = null;
        PreparedStatement statement = null;
        try {

            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //��ȡ����,Connection
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //��ȡPreParedStatement����
            statement = connection.prepareStatement("insert into advice(adid,content,mid) values(?,?,?)");
            statement.setInt(1, adid);
            statement.setString(2, content);
            statement.setInt(3, mid);
            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
