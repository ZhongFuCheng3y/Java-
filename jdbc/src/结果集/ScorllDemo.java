package �����;

import java.sql.*;

/**
 * Created by asd on 2016/10/8.
 */
/*
    �ɹ��������:
        1:���������ʱ,������������
        2:��������ƶ�ָ��,������,������

 */
public class ScorllDemo {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement  = null;
        try {
            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");

            //�������ݿ�,��ȡConnection����
            connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            //��ȡStatement����,������ִ��sql���
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = statement.executeQuery("SELECT * FROM emp ORDER BY sal");
            rs.next();

            //1�Ǵ���ڼ���,��empno��һ����
            System.out.println(rs.getInt(1));
            rs.last();
            System.out.println(rs.isLast());
            System.out.println(rs.isAfterLast());
            System.out.println(rs.getRow());
            rs.previous();
            rs.absolute(6);
            System.out.println(rs.getString(1));

            //�ر���Դ
            rs.close();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
