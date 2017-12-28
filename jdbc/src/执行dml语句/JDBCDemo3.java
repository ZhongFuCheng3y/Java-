package 执行dml语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    使用Statement执行修改sql语句操作

 */
public class JDBCDemo3 {
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

            int falg = -1;
            falg = statement.executeUpdate("UPDATE advice SET content = '88' WHERE adid = 99");
            if (falg > 0) {
                System.out.println("修改成功");

            } else {
                System.out.println("修改失败");

            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
