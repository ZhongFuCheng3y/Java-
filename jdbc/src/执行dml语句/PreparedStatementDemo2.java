package ִ��dml���;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by asd on 2016/10/9.
 */
/*
    ʹ��Ԥ����SQL���ִ��Ч��
 */
public class PreparedStatementDemo2 {
    public static void main(String[] args) {
        try {
            //����������
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //��ȡ����
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");

            String sql = "INSERT INTO advice (adid,content,mid) VALUES(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            for (int i = 3000; i < 4000; i++) {
                statement.setInt(1, i);
                statement.setString(2,"2222");
                statement.setInt(3,1);
                statement.executeUpdate();
            }



            System.out.println("����ɹ�");


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
