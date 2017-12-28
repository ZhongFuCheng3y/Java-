package ���ݿ���ϰ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */
/*
    ͨ��DBUtil��ȡ����,ִ��sql���

 */
public class JDBCDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet set = null;
        try {

            //��ȡ����
            connection = DBUtil.getConnection();
            System.out.println("���ݿ��Ѿ�����!");

            //��ȡStatement����,�ܹ�ִ��sql���Ķ���
            statement = connection.createStatement();

            String sql = "SELECT * FROM emp";

            //ִ��sql,�õ������
            set = statement.executeQuery(sql);

            //���������
            while (set.next()) {
                int empno = set.getInt("empno");
                String ename = set.getString("ename");
                int sal = set.getInt("sal");
                System.out.println(empno + " " + ename + "  " + sal);

            }
            DBUtil.closeConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (set != null) {
                    set.close();
                }
                if (statement != null) {
                    statement.close();

                }
                if (connection != null) {
                    connection.close();

                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
