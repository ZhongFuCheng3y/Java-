package ִ��dml���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    ʹ��Statementִ�в������
 */

public class JDBCDemo2 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {

            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //��ȡConnection����,�������ݿ�
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //��ȡStatement,����ִ��sql���
            statement = connection.createStatement();

            //ִ�в������
            int flag = -1;
            flag = statement.executeUpdate("INSERT INTO advice(adid,content,mid) VALUES(99,'99',2)");
            if (flag > 0) {
                System.out.println("����ɹ�");

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //�ر���Դ
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }
}
