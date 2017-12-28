package 小程序;

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
    需求:
        用户输入
            1:注册
            2:登陆
            3:转账

 */
public class UserService {
    public static void main(String[] args) {

        System.out.println("你好啊");
        System.out.println("1:注册");
        System.out.println("2:登陆");
        System.out.println("3:转账");
        System.out.println("请输入你的操作");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();


        switch (number) {
            case "1":
                register1(scanner);
                break;
            case "2":
                login1(scanner);
                break;
            case "3":
                giveMoney(scanner);
                break;
        }
    }

    /*
        步骤:
            1:获取用户输入的信息
            2:必要的验证,看看转出账户余额是否足够
            ----事务开始的地方
            3:更新转出账户的余额
            4:更新转入账户的余额
            ---提交事务的地方

     */
    private static void giveMoney(Scanner scanner) {
        //获取用户输入的信息
        System.out.println("现在是转账操作!!!!");
        System.out.println("请输入您的账号:");
        String fromUser = scanner.nextLine().trim();
        System.out.println("请输入收款人的账户:");
        String toUser = scanner.nextLine().trim();
        System.out.println("请输入转出金额");
        String money = scanner.nextLine().trim();




        try {

            //必要的验证
            String countSql = "SELECT money FROM user_table WHERE name=?";

            //获取连接
            Connection connection = DBUtil.getConnection();

            //获取preparedStatement对象
            PreparedStatement preparedStatement = connection.prepareStatement(countSql);

            //设置?号的值
            preparedStatement.setString(1, fromUser);

            //执行sql语句
            ResultSet resultSet = preparedStatement.executeQuery();
            int result = 0;
            if (resultSet.next()) {
                result = resultSet.getInt("money");
            }else{
                System.out.println("没有该用户"+fromUser);
                System.exit(-1);
            }

            //判断余额是否足够
            if (Integer.parseInt(money) > result) {
                System.out.println("你的钱不够转");
            }else{

                //如果不是同一个事物,即使转入账户的人不存在,转出的人的钱都扣了.
                //先把转出的人的余额改掉

                //关闭自动提交
                //开始纳入事务控制,因为开始执行DML操作了.
                connection.setAutoCommit(false);
                String fromSql = "UPDATE user_table SET money = money-? WHERE name=?";
                PreparedStatement preparedStatement2 = connection.prepareStatement(fromSql);
                preparedStatement2.setInt(1,Integer.parseInt(money));
                preparedStatement2.setString(2,fromUser);
                preparedStatement2.executeUpdate();

                //把转入账户的人的余额改掉
                String toSql = "UPDATE user_table SET money=money+? WHERE name = ?";
                PreparedStatement preparedStatement3 = connection.prepareStatement(toSql);
                preparedStatement3.setInt(1,Integer.parseInt(money));
                preparedStatement3.setString(2,toUser);
                if (preparedStatement3.executeUpdate() > 0) {
                    System.out.println("转账成功");
                    connection.commit();
                } else {
                    System.out.println("转账失败:没有这个收款人");
                    //如果第二次更次操作失败,那么整次操作就当成是失败,应该回滚事务
                    connection.rollback();

                }

                connection.setAutoCommit(true);


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    /*
        步骤:
            1:用户输入账号和密码
            2:连接数据库
            3:执行查询语句,查看是否有记录
     */
    private static void login1(Scanner scanner) {
        System.out.println("现在是登陆操作!!");

        System.out.println("请你输入qq账号");
        String string = scanner.nextLine();
        int user = Integer.parseInt(string);

        System.out.println("请你输入密码");
        String pwd = scanner.nextLine();


        try {
            //连接数据库
            Connection connection = DBUtil.getConnection();

            //执行查询语句,查看是否有记录
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user_table WHERE id=? AND password=?");
            preparedStatement.setInt(1, user);
            preparedStatement.setString(2, pwd);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("登陆成功了!!");
            } else {
                System.out.println("用户名或者密码有错!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    /*
        步骤:
            1:用户输出账号,密码,名字,钱,邮箱
            2:获取数据库连接
            3:往数据库添加数据

        id就是主键,我们可以查询最大的id号,再加1,这样就不会重复了
   */
    private static void register1(Scanner scanner) {
        System.out.println("现在是注册操作");

        System.out.println("请你输入姓名");
        String name = scanner.nextLine();

        System.out.println("请你输入qq账号");
        String string = scanner.nextLine();
        int user = Integer.parseInt(string);

        System.out.println("请你输入密码");
        String pwd = scanner.nextLine();

        System.out.println("请你输入邮箱");
        String email = scanner.nextLine();

        System.out.println("请你输入余额");
        int money = scanner.nextInt();


        try {
            //获取数据库连接
            Connection connection = DBUtil.getConnection();

            //往数据库添加数据
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user_table VALUES(?,?,?,?,?)");
            preparedStatement.setInt(1, user);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, pwd);
            preparedStatement.setInt(4, money);
            preparedStatement.setString(5, email);
            preparedStatement.executeUpdate();

            System.out.println("注册成功!!!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBUtil.closeConnection();
        }
    }

}
