package ����MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
public class Test {
    public static void main(String[] args) {

        try {
            //����������
            Class.forName("com.mysql.jdbc.Driver");

            //��ȡ����
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");

            //��ȡStatement����
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into article(id,title) VALUES (6,'e')");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
