package DAO;

/**
 * Created by asd on 2016/10/12.
 */
public class UserSeriver {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();

        /*
        ����id��ȡuser����
        User user = userDAO.findById(123);
        System.out.println(user);
        */

        /*
        ��ȡȫ����user��¼
        List<User> list = userDAO.findByAll();
        for (User user : list) {
            System.out.println(user);
        }
        */

        //��������
        User user = new User();
        user.setDeptno(30);
        user.setEmail("403686131@qq.com");
        user.setMoney(10000);
        user.setName("ozc");
        user.setPassworld("zfc");

        if (userDAO.save(user)) {
            System.out.println("���ݱ���ɹ�!!");
            System.out.println("id��:" + user.getId());

        }

    }
}
