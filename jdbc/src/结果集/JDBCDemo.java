package �����;

import ���ݿ���ϰ.DBUtil;

import java.sql.*;

/**
 * Created by asd on 2016/10/10.
 */
/*
    ȡ�ý������Ԫ����
        Ԫ����:
            id  name pwd   Ҳ�����е�����

 */
public class JDBCDemo {
    public static void main(String[] args) {
        try {
            //��ȡ����
            Connection connection = DBUtil.getConnection();

            //��ȡStatement����
            Statement statement = connection.createStatement();

            //ִ��sql���,����ResultSet���������
            String sql = "SELECT * FROM emp";
            ResultSet resultSet = statement.executeQuery(sql);

            //����resultset�������getmetaData(),��ȡResultSetMetaData����
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();

            //��ѯ��ǰ����������ܹ��ж��ٸ�
            int columnCont = resultSetMetaData.getColumnCount();
            System.out.println(columnCont);

            //��ѯԪ���ݵ�����
            for (int i = 1; i <= columnCont; i++) {
                String columnName = resultSetMetaData.getColumnName(i);
                System.out.println(columnName);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            DBUtil.closeConnection();
        }
    }
}
