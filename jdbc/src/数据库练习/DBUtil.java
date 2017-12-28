package 数据库练习;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by asd on 2016/10/8.
 */
/*
    使用配置文件来配置JDBC数据库连接
    这个类是用来管理数据库的连接

    目的:
        1:你给我什么,我就返回一个连接给你
        2:创建Statement对象,执行sql语句
 */

/*
    ThreadLoacl原理:
        1:我们可以创建一个Map对象,key是Thread,value是Connection
        2:我们创建的Connection都是在同一个线程中的
        3:所以,可以根据Thread找到Connection

    作用:
        用于管理不同线程所获取的连接
 */

public class DBUtil {

    //连接数据库的url
    private static String url;

    //连接数据库的密码
    private static String pwd;

    //连接数据库的用户名
    private static String user;

    //创建ThreadLocal对象,key永远是线程
    private static ThreadLocal<Connection> local = new ThreadLocal();





    //静态块
    static {
        try {
            //读取配置文件
            Properties properties = new Properties();

            //读取配置文件常用于这种形式写,相当于在src目录下
            InputStream stream = DBUtil.class.getClassLoader().getResourceAsStream("数据库练习/config.properties");
            //FileInputStream stream = new FileInputStream("config.properties");
            properties.load(stream);

            //关闭读取流
            stream.close();

            //获取驱动
            String driver = properties.getProperty("driver");

            //获取地址
            url = properties.getProperty("url");

            //获取用户名
            user = properties.getProperty("user");

            //获取密码
            pwd = properties.getProperty("pwd");

            //加载驱动类
            Class.forName(driver);


        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取一个连接
     *
     * @return
     */
    public static Connection getConnection() throws SQLException {
        //通过DriverManager创建数据库的连接,并返回
        //为了上面初始化的用户名,url,密码能够在这个方法中使用,把他们定义成static

        try {
            Connection connection =  DriverManager.getConnection(url, user, pwd);

            //会将当前线程作为key,并将指定的值作为value存入内部Map保存
            local.set(connection);

            return connection;

        } catch (SQLException e) {
            e.printStackTrace();

            //如果出错了,我们把异常抛出,通知外界,连接数据库失败了!
            throw e;
        }
    }


    public static void closeConnection() {

        try {
            //拿到Connection对象
            Connection connection = local.get();
            if (connection != null) {
                connection.close();

                //connection对象已经被删除了,就没用了
                local.remove();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
