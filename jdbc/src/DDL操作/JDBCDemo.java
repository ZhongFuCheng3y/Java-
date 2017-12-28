package DDL����;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/9.
 */
/*
    ������: user
    �ֶ�:
        id          NUMBER,
        name        VARCHAR2(30),
        password    VARCHAR2(30),
        money       NUMBER,
        email       VARCHAR2(60)
 */
public class JDBCDemo {
    public static void main(String[] args) {

        try {
            //��ȡ����
            Connection connection = DBUtil.getConnection();

            //��ȡStatement����
            Statement statement = connection.createStatement();

            // sql���
            String sql = "CREATE TABLE user_table ("
                    + "id  NUMBER,"
                    + "name VARCHAR2(20),"
                    + "password  VARCHAR2(20),"
                    + "money NUMBER,"
                    + "email VARCHAR2(60)"
                    + ")";
            //�����һ�����Ϊ ResultSet �����򷵻� true��
            //�����Ϊ���¼������߲������κν�����򷵻� false
            //����,false�ͱ��������ɹ���.
            if (!statement.execute(sql)) {
                System.out.println("�����ɹ�");
            } else {
                System.out.println("����ʧ��");
            }
            DBUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
