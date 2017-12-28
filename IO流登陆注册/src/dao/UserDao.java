package dao;

import pojo.User;

import java.io.IOException;

/**
 * Created by asd on 2016/9/12.
 */
public interface UserDao {

    //登陆是否成功
    public abstract boolean isLogin(String username, String passworld);

    // 要注册用户的信息
    public abstract void regist(User user) throws IOException;


}
