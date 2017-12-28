package 连接jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * 测试配置文件读取
 * config.properties
 *
 * @author zfc
 */
/*
    使用Propertier可以以类似Map的形式读取配置文件中的内容
    Propertier的内容格式:
        user=opental
    等号左边就是key   等号右边就是value


 */
public class JDBCDemo2 {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            fis.close();


            System.out.println("成功加载配置文件");
            String driver = prop.getProperty("driver").trim();
            String url = prop.getProperty("url").trim();
            String user = prop.getProperty("user").trim();
            String pwd = prop.getProperty("pwd").trim();
            System.out.println(driver + url + user + pwd);

            //加载驱动类
            Class.forName(driver);

            //获取connection对象,连接数据库
            Connection conn = DriverManager.getConnection(url, user, pwd);

            //获取statement对象,对象用于执行sql语句
            Statement statement = conn.createStatement();
            String sql = "SELECT empno,ename,sal,deptno FROM emp";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                int sal = rs.getInt("sal");
                int deptno = rs.getInt("deptno");
                System.out.println(empno + "    " + ename + "  " + sal + "    " + deptno);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
