package �����Զ�����;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by asd on 2016/10/10.
 */

/*
    PreparedStatement֧��һ������
        ������ִ�в��������,��ȡ������������ݿ��в����ļ�¼��ÿ���ֶε�ֵ

    �����������,������в�������ʱ,���Ի�ȡ��������Ϊ�������
    ��������Ҫ��ȡ�����е�������ֵ������һ�β�ѯ.
 */

public class Demo2 {
    public static void main(String[] args) {
        try {
            //�������ݿ�
            Connection connection = DBUtil.getConnection();


            //��ȡPreparedStatement����
            //�ڶ�������,��ʾ��Ҫ����sql��ֵ���ڵ��ֶ���,���Ի�ȡ������ֶ��ϵ�ֵ.
            String sql = "INSERT INTO mydept VALUES(dept_seq.NEXTVAL,?,?)";
            PreparedStatement preparedStatement
                    = connection.prepareStatement(sql, new String[]{"deptno", "dname"});
            preparedStatement.setString(1, "ORACLE");
            preparedStatement.setString(2, "BEIJING");

            if (preparedStatement.executeUpdate() > 0) {

                //��ȡ�ող����ȥ�ļ�¼�еĹ�ע�Ǽ��е�ֵ
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                if (resultSet.next()) {
                    //��ȡdeptno��ֵ
                    int deptno = resultSet.getInt(1);
                    System.out.println("�ղ����ȥ�Ĳ��ű����:" + deptno);
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection();

        }
    }
}
