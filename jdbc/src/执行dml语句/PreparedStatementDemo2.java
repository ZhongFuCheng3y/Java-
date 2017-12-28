package 执行dml语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by asd on 2016/10/9.
 */
/*
    使用预编译SQL提高执行效率
 */
public class PreparedStatementDemo2 {
    public static void main(String[] args) {
        try {
            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //获取连接
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            String sql = "INSERT INTO advice (adid,content,mid) VALUES(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            for (int i = 3000; i < 4000; i++) {
                statement.setInt(1, i);
                statement.setString(2,"2222");
                statement.setInt(3,1);
                statement.executeUpdate();
            }



            System.out.println("插入成功");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
