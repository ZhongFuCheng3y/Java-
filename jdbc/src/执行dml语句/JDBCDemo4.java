package ִ��dml���;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    Statementɾ������

 */
public class JDBCDemo4 {
    public static void main(String[] args) {

        try {
            //��ȡ����
            Connection connection = DBUtil.getConnection();

            //��ȡStatement����
            Statement statement = connection.createStatement();

            String sql = "DELETE FROM advice WHERE adid = 99";
            if ((statement.executeUpdate(sql)) > 0) {
                System.out.println("ɾ���ɹ�");
            } else {
                System.out.println("ɾ��ʧ��");

            }
            //�ر���Դ
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
