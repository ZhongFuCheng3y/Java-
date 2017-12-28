package 连接池;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
public class GetDeptMessage {
    public static void main(String[] args) {
        try {
            //获取Connection对象,连接数据库
            Connection connection = DBUtil.getConnection();

            //获取Statement对象,用于执行sql语句
            Statement statement = connection.createStatement();

            ResultSet set = statement.executeQuery("SELECT * FROM dept");

            //遍历结果集
            while (set.next()) {
                String deptno = set.getString("deptno");
                String dname = set.getString("dname");
                String loc = set.getString("loc");

                System.out.println(deptno + "  " + dname + "  " + loc);
            }

            //关闭资源
            set.close();
            statement.close();
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
