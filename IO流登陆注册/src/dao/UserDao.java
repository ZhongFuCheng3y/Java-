package dao;

import pojo.User;

import java.io.IOException;

/**
 * Created by asd on 2016/9/12.
 */
public interface UserDao {

    //��½�Ƿ�ɹ�
    public abstract boolean isLogin(String username, String passworld);

    // Ҫע���û�����Ϣ
    public abstract void regist(User user) throws IOException;


}
