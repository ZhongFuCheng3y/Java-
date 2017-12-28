package impl;

import dao.UserDao;
import pojo.User;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/17.
 */
public class UserDaoImpl implements UserDao {

    /*
        为了让多个方法能够使用同一个集合,把集合定义为成员变量
        为了不让外人看见,私有化
        为了能让多个对象共享一个成员变量,用静态
     */
    private static ArrayList<User> arrayList = new ArrayList<>();


    @Override
    public boolean isLogin(String username, String password) {
        boolean flag = false;
        for (User user : arrayList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {

        arrayList.add(user);

    }
}
