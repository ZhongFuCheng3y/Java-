package ������;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */

/*
    ����:
        ���ڶ������ͬʱ�ɹ�ִ�л�ʧ��
    ������:
        �ύЧ��.
 */
/*
    ������:
        1:����statement���ô������,ֻҪ��statement��ӵ���������,�������Ч��
        2:һ��ִ��DML���

 */
public class jdbcDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //�������ݿ�,��ȡConnection����
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //��ȡstatement����
            statement = connection.createStatement();
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(7,'7','2')");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(8,'8','1')");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES(9,'9','2')");
            statement.executeBatch();



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
