package �����Զ�����;

import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by asd on 2016/10/10.
 */
/*
    Ϊuser_table�½�һ������
        CREATE sequence user_seq
        START WITH 1000;
    Ϊuser_table׷��һ����,deptno
        ALTER TABLE user_table
        ADD(deptno NUMBER(2));
    ��deptno����Ҳ���һ������
        CREATE SEQUENCE dept_seq
        START WITH 60;
    ����dept�� �ṹ
        CREATE TABLE mydept
        AS SELECT * FROM dept WHERE 1=2;

    ����:
        ��dept�������һ���µĲ���
        ͬʱ��ò������һ���µ��û�
    ˼·:
        1:�Ȳ���һ���µĲ��ż�¼
        2:user���в���һ��Ա������Ϣ
        3:ͬʱ��Ա���Ĳ��ű��Ӧ�����²���Ĳ��ż�¼������ֵ
        */
public class Demo {
    public static void main(String[] args) {

        try {
            //��ȡ����
            Connection connection = DBUtil.getConnection();
            connection.setAutoCommit(false);
            //�Ȳ���һ������
            String deptSql = "INSERT INTO mydept VALUES(dept_seq.NEXTVAL,'java','guangzhou')";

            //��ȡStatement����,����ִ��sql���
            Statement statement = connection.createStatement();
            statement.executeUpdate(deptSql);

            //��ȡ�ող��벿�ŵ�����ֵ,������Ϊuser���е��¼�¼�����ֵ
            int id = 0;
            String idSql = "SELECT MAX(deptno) FROM mydept";
            ResultSet resultSet = statement.executeQuery(idSql);
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }

            //�ر�resultSet����Դ
            resultSet.close();

            String userSql = "INSERT INTO user_table (id,name,deptno) " +
                    " VALUES(user_seq.NEXTVAL,'zfc'," + id + ")";
            statement.executeUpdate(userSql);
            connection.commit();
            connection.setAutoCommit(true);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            DBUtil.closeConnection();

        }
    }
}
