package impl;

import dao.UserDao;
import pojo.User;

import java.io.*;

/**
 * Created by asd on 2016/9/12.
 */
/*
    IO流实现用户登录注册

    步骤:
        1:
 */
public class UserDaoImpl implements UserDao {
    //为了保证类一加载,文件就已经存在了
    private static File file = new File("user2.txt");

    static {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("创建文件失败了!!");
        }
    }


    @Override
    public boolean isLogin(String username, String passworld) {
        //标记变量
        boolean flag = false;

        //读取数据
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                //拆开字符串
                String[] strings = line.split("=");
                if (strings[0].equals(username) && strings[1].equals(passworld)) {
                    flag = true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("系统找不到文件");
        } catch (IOException e) {
            System.out.println("用户登录失败");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("用户登陆释放资源失败");

                }
            }
        }
        return flag;


    }

    @Override
    public void regist(User user) {
        //让注册的数据有一定的规则,我就自己定义规则: 用户名 = 密码

        //写入数据
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter(file, true));
            bw.write(user.getUsername() + "=" + user.getPassworld());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("用户注册失败了");
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("用户注册释放资源失败");
                }
            }
        }


    }
}
