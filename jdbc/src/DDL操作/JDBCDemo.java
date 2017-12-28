package DDL操作;

import 连接池.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    创建表: user
    字段:
        id          NUMBER,
        name        VARCHAR2(30),
        password    VARCHAR2(30),
        money       NUMBER,
        email       VARCHAR2(60)
 */
public class JDBCDemo {
    public static void main(String[] args) {

        try {
            //获取连接
            Connection connection = DBUtil.getConnection();

            //获取Statement对象
            Statement statement = connection.createStatement();

            // sql语句
            String sql = "CREATE TABLE user_table ("
                    + "id  NUMBER,"
                    + "name VARCHAR2(20),"
                    + "password  VARCHAR2(20),"
                    + "money NUMBER,"
                    + "email VARCHAR2(60)"
                    + ")";
            //如果第一个结果为 ResultSet 对象，则返回 true；
            //如果其为更新计数或者不存在任何结果，则返回 false
            //所以,false就表明创建成功了.
            if (!statement.execute(sql)) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
