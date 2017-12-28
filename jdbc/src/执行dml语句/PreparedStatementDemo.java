package 执行dml语句;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/8.
 */
/*

    如果是字符串录入,要执行dml语句
    这会非常麻烦,因为需要不断的拼接成是一个sql可执行的语句

    所以,我们出现了PreparedStatement,此类往往用于sql语句有变量的情况下.

 */
public class PreparedStatementDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入内容");
        String content = scanner.nextLine();
        System.out.println("请输入编号");
        int  adid = scanner.nextInt();
        System.out.println("请输入你的id");
        int mid = scanner.nextInt();

        Connection connection = null;
        PreparedStatement statement = null;
        try {

            //加载驱动类
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //获取连接,Connection
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //获取PreParedStatement对象
            statement = connection.prepareStatement("insert into advice(adid,content,mid) values(?,?,?)");
            statement.setInt(1, adid);
            statement.setString(2, content);
            statement.setInt(3, mid);
            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
