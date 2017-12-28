package 结果集;

import java.sql.*;

/**
 * Created by asd on 2016/10/8.
 */
/*
    可滚动结果集:
        1:创建结果集时,多了两个参数
        2:可以随便移动指针,往哪移,就哪移

 */
public class ScorllDemo {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement  = null;
        try {
            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //连接数据库,获取Connection对象
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //获取Statement对象,可用于执行sql语句
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = statement.executeQuery("SELECT * FROM emp ORDER BY sal");
            rs.next();

            //1是代表第几列,跟empno是一样的
            System.out.println(rs.getInt(1));
            rs.last();
            System.out.println(rs.isLast());
            System.out.println(rs.isAfterLast());
            System.out.println(rs.getRow());
            rs.previous();
            rs.absolute(6);
            System.out.println(rs.getString(1));

            //关闭资源
            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
