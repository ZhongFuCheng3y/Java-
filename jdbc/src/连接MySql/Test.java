package 连接MySql;

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
            //加载驱动类
            Class.forName("com.mysql.jdbc.Driver");

            //获取连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydata", "root", "root");

            //获取Statement对象
            Statement statement = connection.createStatement();
            statement.executeUpdate("insert into article(id,title) VALUES (6,'e')");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
