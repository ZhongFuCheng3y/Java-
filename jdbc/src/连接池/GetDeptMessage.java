package ���ӳ�;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
public class GetDeptMessage {
    public static void main(String[] args) {
        try {
            //��ȡConnection����,�������ݿ�
            Connection connection = DBUtil.getConnection();

            //��ȡStatement����,����ִ��sql���
            Statement statement = connection.createStatement();

            ResultSet set = statement.executeQuery("SELECT * FROM dept");

            //���������
            while (set.next()) {
                String deptno = set.getString("deptno");
                String dname = set.getString("dname");
                String loc = set.getString("loc");

                System.out.println(deptno + "  " + dname + "  " + loc);
            }

            //�ر���Դ
            set.close();
            statement.close();
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
