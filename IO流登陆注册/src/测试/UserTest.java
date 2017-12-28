package 测试;

import dao.UserDao;
import game.GuessNumber;
import impl.UserDaoImpl;
import pojo.User;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/12.
 */
public class UserTest {
    public static void main(String[] args) throws IOException {
        while (true) {
            //欢迎界面
            System.out.println("---------欢迎光临----------");
            System.out.println("1 : 登陆");
            System.out.println("2 : 注册");
            System.out.println("3 : 退出");
            System.out.println("请做出你的选择:");

            //键盘录入
            Scanner scanner = new Scanner(System.in);

            //为了后面的录入信息方便,将所有数据录入全部用字符串
            String choiceString = scanner.nextLine();

            //由于实现Dao接口的类经常要在while里面用到,所以我定义在外面
            UserDao ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("------登陆界面-------");

                    System.out.println("请输入用户名:");
                    String username = scanner.nextLine();

                    System.out.println("请输入密码:");
                    String passworld = scanner.nextLine();

                    //调用登陆的功能
                    boolean flag = ud.isLogin(username, passworld);

                    if (flag) {
                        System.out.println("登陆成功了,你可以玩游戏了");
                        System.out.println("你想玩吗? y/n");
                        while (true) {
                            String result = scanner.nextLine();
                            if (result.equalsIgnoreCase("y")) {
                                GuessNumber.start();
                                System.out.println("你还想继续玩吗? y/m");
                            }else {
                                break;
                            }
                        }
                        System.out.println("谢谢使用,欢迎下次再来玩");
                        System.exit(0);

                    }else {
                        System.out.println("你输入的用户名或密码有错误.登陆失败!");

                    }
                    break;
                case "2":
                    System.out.println("------注册界面-------");
                    System.out.println("请输入用户名:");
                    String newUserName = scanner.nextLine();
                    System.out.println("请输入密码:");
                    String newPassWorld = scanner.nextLine();

                    //把用户名和密码封装到对象里面
                    User user = new User();
                    user.setPassworld(newPassWorld);
                    user.setUsername(newUserName);

                    //调用UserDao的实现类的注册功能
                    ud.regist(user);
                    System.out.println("注册成功");
                    break;
                case "3":
                    System.out.println("谢谢使用,欢迎下次再来");
                    System.exit(0);
                    break;
            }
        }
    }
}
