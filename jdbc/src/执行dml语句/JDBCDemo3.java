package ִ��dml���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    ʹ��Statementִ���޸�sql������

 */
public class JDBCDemo3 {
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

            int falg = -1;
            falg = statement.executeUpdate("UPDATE advice SET content = '88' WHERE adid = 99");
            if (falg > 0) {
                System.out.println("�޸ĳɹ�");

            } else {
                System.out.println("�޸�ʧ��");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
