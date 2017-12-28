package ����jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * ���������ļ���ȡ
 * config.properties
 *
 * @author zfc
 */
/*
    ʹ��Propertier����������Map����ʽ��ȡ�����ļ��е�����
    Propertier�����ݸ�ʽ:
        user=opental
    �Ⱥ���߾���key   �Ⱥ��ұ߾���value


 */
public class JDBCDemo2 {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("config.properties");
            Properties prop = new Properties();
            prop.load(fis);
            fis.close();


            System.out.println("�ɹ����������ļ�");
            String driver = prop.getProperty("driver").trim();
            String url = prop.getProperty("url").trim();
            String user = prop.getProperty("user").trim();
            String pwd = prop.getProperty("pwd").trim();
            System.out.println(driver + url + user + pwd);

            //����������
            Class.forName(driver);

            //��ȡconnection����,�������ݿ�
            Connection conn = DriverManager.getConnection(url, user, pwd);

            //��ȡstatement����,��������ִ��sql���
            Statement statement = conn.createStatement();
            String sql = "SELECT empno,ename,sal,deptno FROM emp";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");
                int sal = rs.getInt("sal");
                int deptno = rs.getInt("deptno");
                System.out.println(empno + "    " + ename + "  " + sal + "    " + deptno);

            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
