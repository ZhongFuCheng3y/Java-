package 返回自动主键;

import 连接池.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by asd on 2016/10/10.
 */

/*
    PreparedStatement支持一个方法
        可以在执行插入操作后,获取该条语句在数据库中产生的记录中每个字段的值

    有了这个功能,在向表中插入数据时,可以获取该主键作为外键插入
    而不再需要获取主表中的主键的值而进行一次查询.
 */

public class Demo2 {
    public static void main(String[] args) {
        try {
            //连接数据库
            Connection connection = DBUtil.getConnection();


            //获取PreparedStatement对象
            //第二个参数,表示你要关心sql的值所在的字段名,可以获取插入后字段上的值.
            String sql = "INSERT INTO mydept VALUES(dept_seq.NEXTVAL,?,?)";
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql, new String[]{"deptno", "dname"});
            preparedStatement.setString(1, "ORACLE");
            preparedStatement.setString(2, "BEIJING");

            if (preparedStatement.executeUpdate() > 0) {

                //获取刚刚插入进去的记录中的关注那几列的值
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    //获取deptno的值
                    int deptno = resultSet.getInt(1);
                    System.out.println("刚插入进去的部门编号是:" + deptno);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();

        }
    }
}
