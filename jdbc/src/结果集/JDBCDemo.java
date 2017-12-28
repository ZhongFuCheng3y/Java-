package 结果集;

import 数据库练习.DBUtil;

import java.sql.*;

/**
 * Created by asd on 2016/10/10.
 */
/*
    取得结果集的元数据
        元数据:
            id  name pwd   也就是列的数据

 */
public class JDBCDemo {
    public static void main(String[] args) {
        try {
            //获取连接
            Connection connection = DBUtil.getConnection();

            //获取Statement对象
            Statement statement = connection.createStatement();

            //执行sql语句,返回ResultSet结果集对象
            String sql = "SELECT * FROM emp";
            ResultSet resultSet = statement.executeQuery(sql);

            //根据resultset对象调用getmetaData(),获取ResultSetMetaData对象
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            //查询当前结果集的列总共有多少个
            int columnCont = resultSetMetaData.getColumnCount();
            System.out.println(columnCont);

            //查询元数据的名称
            for (int i = 1; i <= columnCont; i++) {
                String columnName = resultSetMetaData.getColumnName(i);
                System.out.println(columnName);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConnection();
        }
    }
}
