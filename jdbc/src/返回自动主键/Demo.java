package 返回自动主键;

import 连接池.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/10.
 */
/*
    为user_table新建一个序列
        CREATE sequence user_seq
        START WITH 1000;
    为user_table追加一个列,deptno
        ALTER TABLE user_table
        ADD(deptno NUMBER(2));
    给deptno表中也添加一个序列
        CREATE SEQUENCE dept_seq
        START WITH 60;
    复制dept表 结构
        CREATE TABLE mydept
        AS SELECT * FROM dept WHERE 1=2;

    操作:
        向dept表中添加一个新的部门
        同时向该部门添加一个新的用户
    思路:
        1:先插入一个新的部门记录
        2:user表中插入一个员工的信息
        3:同时该员工的部门编号应该是新插入的部门记录的主键值
        */
public class Demo {
    public static void main(String[] args) {

        try {
            //获取连接
            Connection connection = DBUtil.getConnection();
            connection.setAutoCommit(false);
            //先插入一个部门
            String deptSql = "INSERT INTO mydept VALUES(dept_seq.NEXTVAL,'java','guangzhou')";

            //获取Statement对象,用于执行sql语句
            Statement statement = connection.createStatement();
            statement.executeUpdate(deptSql);

            //获取刚刚插入部门的主键值,用于作为user表中的新纪录外键的值
            int id = 0;
            String idSql = "SELECT MAX(deptno) FROM mydept";
            ResultSet resultSet = statement.executeQuery(idSql);
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }

            //关闭resultSet的资源
            resultSet.close();

            String userSql = "INSERT INTO user_table (id,name,deptno) " +
                    " VALUES(user_seq.NEXTVAL,'zfc'," + id + ")";
            statement.executeUpdate(userSql);
            connection.commit();
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBUtil.closeConnection();

        }
    }
}
