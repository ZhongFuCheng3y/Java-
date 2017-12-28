package 执行dml语句;

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
            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //获取Connection对象
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //获取Statement对象
            statement = connection.createStatement();

            //Statement对象调用executeUpdate方法,实现对数据更新
            String sql = "insert into advice(adid,content,mid)values(5,'2',1)";
            statement.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
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
