package ִ��dml���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */

public class jdbcDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //��ȡConnection����
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //��ȡStatement����
            statement = connection.createStatement();

            //Statement�������executeUpdate����,ʵ�ֶ����ݸ���
            String sql = "insert into advice(adid,content,mid)values(5,'2',1)";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
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
