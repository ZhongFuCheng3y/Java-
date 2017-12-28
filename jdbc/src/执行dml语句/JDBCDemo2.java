package 执行dml语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    使用Statement执行插入操作
 */

public class JDBCDemo2 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {

            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //获取Connection对象,连接数据库
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //获取Statement,用于执行sql语句
            statement = connection.createStatement();

            //执行插入语句
            int flag = -1;
            flag = statement.executeUpdate("INSERT INTO advice(adid,content,mid) VALUES(99,'99',2)");
            if (flag > 0) {
                System.out.println("插入成功");

            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
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
