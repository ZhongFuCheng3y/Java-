package impl;

import dao.UserDao;
import pojo.User;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/17.
 */
public class UserDaoImpl implements UserDao {

    /*
        Ϊ���ö�������ܹ�ʹ��ͬһ������,�Ѽ��϶���Ϊ��Ա����
        Ϊ�˲������˿���,˽�л�
        Ϊ�����ö��������һ����Ա����,�þ�̬
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
