package Transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/8.
 */
/*
    1:�޸�����,Ҫͬʱִ�гɹ�,��ͬʱ��ִ�гɹ�.
    2:jdbc���Զ��ύdml����
    3:ͬʱ�����������,��һ���Զ��ύ,�ڶ���Ҳ�Զ��ύ
    4:������м������,�ͻ�������ݲ�һ�µ�����

    ����:
        1:�ر��Զ��ύ
        2:�ֶ��ύ
        3:ִ��������,���Զ��ύ
        4:�������;�ͳ��ִ�����,����Ҫ��catch����лع�����,�����Զ��ύ

 */
public class TransactionDemo {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        try {
            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //�������ݿ�,��ȡConnection����
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //�ر��Զ��ύ
            connection.setAutoCommit(false);

            statement = connection.createStatement();

            //����������
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'8',2)");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'9',2)");
            statement.addBatch("INSERT INTO advice(adid,content,mid)VALUES (8,'9',2)");
            statement.executeBatch();

            //�ֶ��ύ
            connection.commit();

            //��ԭ���Զ��ύ
            connection.setAutoCommit(true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

            //��������˴���,�������Ӳ���Ϊnull��
            //������Ҫ�����ݻ�ԭ,���Ұ��Զ��ύ��
            if (connection != null) {
                try {
                    connection.rollback();
                    connection.setAutoCommit(true);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }

            }
        } finally {
            try {
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
