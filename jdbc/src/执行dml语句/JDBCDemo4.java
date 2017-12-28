package 执行dml语句;

import 连接池.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    Statement删除操作

 */
public class JDBCDemo4 {
    public static void main(String[] args) {

        try {
            //获取连接
            Connection connection = DBUtil.getConnection();

            //获取Statement对象
            Statement statement = connection.createStatement();

            String sql = "DELETE FROM advice WHERE adid = 99";
            if ((statement.executeUpdate(sql)) > 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");

            }
            //关闭资源
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
