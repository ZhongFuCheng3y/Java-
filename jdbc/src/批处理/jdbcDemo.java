package 批处理;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */

/*
    事务:
        用于多条语句同时成功执行或失败
    批处理:
        提交效率.
 */
/*
    批处理:
        1:就是statement不用创建多个,只要把statement添加到批处理中,可以提高效率
        2:一般执行DML语句

 */
public class jdbcDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //连接数据库,获取Connection对象
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //获取statement对象
            statement = connection.createStatement();
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(7,'7','2')");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(8,'8','1')");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(9,'9','2')");
            statement.executeBatch();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
