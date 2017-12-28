package 分页查询;



import 连接池.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/10.
 */
/*
    分页机制
        真分页
            在数据库做
            记录数据大
        假分页
            在内存中做---相应效率高--减少数据库压力
                    ----如果数据多,内存压力大
            记录数据小
 */
/*
    DAO(Data Access Object)数据访问对象
        ----数据持久层
        ----数据存到硬盘
    建立在数据库和业务层之间,封装所有对数据库的访问
    目的:
        数据访问逻辑和业务逻辑分开
        让我们操作数据库变成面向对象化
 */
public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查看的表名:");
        String tableName = scanner.nextLine().trim();
        System.out.println("请输入要排序的列名:");
        String colName = scanner.nextLine().trim();
        System.out.println("请输入一页显示的条数:");
        int pagesize = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("请输入查看的页数:");
        int page = Integer.parseInt(scanner.nextLine().trim());

        /**SELECT * FROM (
         *  SELECT ROWNUM rn,t.* FROM (
         *     SELECT * FROM t ORDER BY c
         *  )t
         * )
         *  WHERE rn BETWEEN ? AND ?
         */
        try {
            //连接数据库
            Connection connection = DBUtil.getConnection();

            /**
             * SELECT * FROM (
             *   SELECT ROWNUM rn,t.* FROM (
             *      SELECT * FROM t ORDER BY c
             *   )t
             *  )
             *  WHERE rn BETWEEN ? AND ?
             */
            String sql = "SELECT * FROM ( "
                   + "SELECT ROWNUM rn,t.* FROM ( "
                        + "SELECT * FROM "+tableName+" ORDER BY "+colName +" "
                        + ")t "
                        + ") "
                        + "WHERE rn BETWEEN ? AND ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int start = (page - 1) * pagesize + 1;
            int end = page * pagesize;
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, end);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int rw = resultSet.getInt(1);
                int id = resultSet.getInt(2);
                String name = resultSet.getString(3);
                System.out.println(rw + "  " + id + "   " + name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
