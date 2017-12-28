package 数据库练习;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */
/*
    通过DBUtil获取连接,执行sql语句

 */
public class JDBCDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try {

            //获取连接
            connection = DBUtil.getConnection();
            System.out.println("数据库已经连接!");

            //获取Statement对象,能够执行sql语句的对象
            statement = connection.createStatement();

            String sql = "SELECT * FROM emp";

            //执行sql,得到结果集
            set = statement.executeQuery(sql);

            //遍历结果集
            while (set.next()) {
                int empno = set.getInt("empno");
                String ename = set.getString("ename");
                int sal = set.getInt("sal");
                System.out.println(empno + " " + ename + "  " + sal);

            }
            DBUtil.closeConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) {
                    set.close();
                }
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
