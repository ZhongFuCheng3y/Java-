package ������;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by asd on 2016/10/10.
 */
/*
    ʹ��PreparedStatementִ��������
 */
public class JDBCDemo2 {
    public static void main(String[] args) {
        try {
            Connection connection = DBUtil.getConnection();
            String sql = "INSERT INTO member VALUES(?,?)";

            PreparedStatement preparedStatement  = connection.prepareStatement(sql);;
            for (int i =400; i < 900; i++) {
                preparedStatement.setInt(1, i);
                preparedStatement.setString(2, "zfc" + i);
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
            System.out.println("����ɹ�");

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection();

        }
    }
}
