package Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */
/*
    1:修改数据,要同时执行成功,或同时不执行成功.
    2:jdbc会自动提交dml数据
    3:同时插入三条语句,第一条自动提交,第二条也自动提交
    4:如果在中间出错了,就会出现数据不一致的问题

    步骤:
        1:关闭自动提交
        2:手动提交
        3:执行完语句后,打开自动提交
        4:如果在中途就出现错误了,我们要在catch语句中回滚数据,并打开自动提交

 */
public class TransactionDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //连接数据库,获取Connection对象
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //关闭自动提交
            connection.setAutoCommit(false);

            statement = connection.createStatement();

            //加入批处理
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'8',2)");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'9',2)");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'9',2)");
            statement.executeBatch();

            //手动提交
            connection.commit();

            //还原成自动提交
            connection.setAutoCommit(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

            //如果出现了错误,并且连接不是为null的
            //我们需要把数据还原,并且把自动提交打开
            if (connection != null) {
                try {
                    connection.rollback();
                    connection.setAutoCommit(true);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        } finally {
            try {
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
