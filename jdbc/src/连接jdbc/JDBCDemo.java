package 连接jdbc;

import java.sql.*;


/**
 * Created by asd on 2016/10/8.
 */
/*
    步骤:
        1:加载驱动类
            ORACLE:
                Class.forName("oracle.jdbc.OracleDriver");

            MYSQL:
                Class.forName("com.mysql.jdbc.Driver");

            同时导入jar包
        2:连接数据库
            通过DriveManage.getConnection()获取Connection对象
        3:获取statement对象--用来执行sql语句
            通过connection对象.createStatement获取Statement对象
        4:关闭数据库
            conn.close;
 */

/*
    execute方法,只要你是条sql语句,他就能执行.
    execute :
        ddl操作,创建表,删除表
    executeQuery :
        dql操作,Select语句,查询
    executeUpdate:
        dml操作,更新数据
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        //加载驱动
        /*
            java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
            这个异常时,说明数据库的驱动jar包没有导入项目,若导入了jar包,书写的驱动有错误
         */
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //通过DriveManage获取数据库连接
        /*
            注意:导入的包都在java.sql下的

            DriverManage连接Oracle时的路径格式:
                jdbc:oracle:thin:@<host>:<port>:<sid>
            连接MYSql的路径
                jdbc:mysql://<host>:<post>/<dbname>(实例名,也相当于oracle sid)
            MYSQL的端口号一般是3306
         */
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //通过Connection创建Statement用来执行sql语句
        /*
            查询emp表中的数据
               SELECT empno , ename,sal,deptno
               FROM emp;
         */
        Statement state = null;
        try {
            state = conn.createStatement();

            //输出sql用于检查sql拼写是否有错误.
            String sql = "SELECT empno,ename,sal,deptno FROM emp";
            System.out.println(sql);

            //调用executeQuery方法,返回的是ResultSet的类型的,也就是结果集
            /*注意:
                     ResultSet表示的是结果集,但实际上,查询的结果集在Oracle数据库服务器上,
                     并没有全部保存在本地,所以,我们通过ResultSet的next方法获取下一条记录时
                     ResultSet会发送请求到服务端获取数据,若连接关闭,就会抛出异常
            */
            ResultSet re = state.executeQuery(sql);


            //遍历结果集
            while (re.next()) {
                int empno = re.getInt("empno");
                String ename = re.getString("ename");
                int sal = re.getInt("sal");
                int deptno = re.getInt("deptno");
                System.out.println(empno + "    " + ename + "  " + sal + "    " + deptno);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            conn.close();

        }



    }
}
