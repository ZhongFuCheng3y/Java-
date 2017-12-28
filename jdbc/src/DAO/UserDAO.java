package DAO;

import ?????.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asd on 2016/10/12.
 */
/*
    userDAO
        ?????????????user??
 */
public class UserDAO {

    private static final String FIND_BY_ID_SQL = "SELECT * FROM user_table WHERE id = ?";
    private static final String FIND_BY_ALL_SQL = "SELECT * FROM user_table ";

    //id??????,??????????????
    private static final String SAVE_SQL = "INSERT INTO user_table VALUES(user_seq.nextval,?,?,?,?,?)";




    //????id???User???
    public User findById(int id) {
        try {

            //???????
            Connection connection = DBUtil.getConnection();

            //???PreparedStatement????,???sql
            PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID_SQL);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            //????????,?????????,???????user???????
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                int money = resultSet.getInt("money");
                String email = resultSet.getString("email");
                int deptno = resultSet.getInt("deptno");

                User user = new User(id, name, password, money, email, deptno);
                return user;
            }

            //??????
            resultSet.close();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();
        }
        return null;
    }

    //?????????User???
    public List<User> findByAll() {
        try {
            //???????
            Connection connection = DBUtil.getConnection();

            //???Statement????,???sql???
            Statement statement = connection.createStatement();

            //????????
            ResultSet resultSet = statement.executeQuery(FIND_BY_ALL_SQL);

            //????List????,?User????
            List<User> list = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String password = resultSet.getString("password");
                int money = resultSet.getInt("money");
                String email = resultSet.getString("email");
                int deptno = resultSet.getInt("deptno");
                User user = new User(id, name, password, money, email, deptno);

                //??user????????list??????
                list.add(user);
            }


            //??????
            resultSet.close();
            statement.close();
            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();
        }

        return null;
    }

    //???????user?????
    public boolean save(User user) {
        try {
            //?????????
            Connection connection = DBUtil.getConnection();

            //???PreparedStatement????,???sql???
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_SQL, new String[]{"id"});

            //???????????
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassworld());
            preparedStatement.setInt(3, user.getMoney());
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setInt(5, user.getDeptno());

            //????????,?????????????????????,id??????????,????????????????id???
            if (preparedStatement.executeUpdate() > 0) {
                //??????????
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                resultSet.next();
                int id = resultSet.getInt(1);
                user.setId(id);
                resultSet.close();

                //??????
                preparedStatement.close();

                return true;
            }

            //???????????????,???????????
            //??????
            preparedStatement.close();



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            DBUtil.closeConnection();

        }


        return false;

    }

    //????user???
    public boolean update(User user) {
        return false;
    }

    //????id??????user???
    public boolean deleteById(int id) {
        return false;
    }


}
