package DAO;

/**
 * Created by asd on 2016/10/12.
 */
public class UserSeriver {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        /*
        根据id获取user对象
        User user = userDAO.findById(123);
        System.out.println(user);
        */

        /*
        获取全部的user记录
        List<User> list = userDAO.findByAll();
        for (User user : list) {
            System.out.println(user);
        }
        */

        //保存数据
        User user = new User();
        user.setDeptno(30);
        user.setEmail("403686131@qq.com");
        user.setMoney(10000);
        user.setName("ozc");
        user.setPassworld("zfc");

        if (userDAO.save(user)) {
            System.out.println("数据保存成功!!");
            System.out.println("id是:" + user.getId());

        }

    }
}
