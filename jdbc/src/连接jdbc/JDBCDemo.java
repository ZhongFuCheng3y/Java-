package ����jdbc;

import java.sql.*;


/**
 * Created by asd on 2016/10/8.
 */
/*
    ����:
        1:����������
            ORACLE:
                Class.forName("oracle.jdbc.OracleDriver");

            MYSQL:
                Class.forName("com.mysql.jdbc.Driver");

            ͬʱ����jar��
        2:�������ݿ�
            ͨ��DriveManage.getConnection()��ȡConnection����
        3:��ȡstatement����--����ִ��sql���
            ͨ��connection����.createStatement��ȡStatement����
        4:�ر����ݿ�
            conn.close;
 */

/*
    execute����,ֻҪ������sql���,������ִ��.
    execute :
        ddl����,������,ɾ����
    executeQuery :
        dql����,Select���,��ѯ
    executeUpdate:
        dml����,��������
 */
public class JDBCDemo {
    public static void main(String[] args) throws SQLException {

        //��������
        /*
            java.lang.ClassNotFoundException: oracle.jdbc.driver.OracleDriver
            ����쳣ʱ,˵�����ݿ������jar��û�е�����Ŀ,��������jar��,��д�������д���
         */
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //ͨ��DriveManage��ȡ���ݿ�����
        /*
            ע��:����İ�����java.sql�µ�

            DriverManage����Oracleʱ��·����ʽ:
                jdbc:oracle:thin:@<host>:<port>:<sid>
            ����MYSql��·��
                jdbc:mysql://<host>:<post>/<dbname>(ʵ����,Ҳ�൱��oracle sid)
            MYSQL�Ķ˿ں�һ����3306
         */
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.186.149:1521:msdl", "scott", "tiger");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //ͨ��Connection����Statement����ִ��sql���
        /*
            ��ѯemp���е�����
               SELECT empno , ename,sal,deptno
               FROM emp;
         */
        Statement state = null;
        try {
            state = conn.createStatement();

            //���sql���ڼ��sqlƴд�Ƿ��д���.
            String sql = "SELECT empno,ename,sal,deptno FROM emp";
            System.out.println(sql);

            //����executeQuery����,���ص���ResultSet�����͵�,Ҳ���ǽ����
            /*ע��:
                     ResultSet��ʾ���ǽ����,��ʵ����,��ѯ�Ľ������Oracle���ݿ��������,
                     ��û��ȫ�������ڱ���,����,����ͨ��ResultSet��next������ȡ��һ����¼ʱ
                     ResultSet�ᷢ�����󵽷���˻�ȡ����,�����ӹر�,�ͻ��׳��쳣
            */
            ResultSet re = state.executeQuery(sql);


            //���������
            while (re.next()) {
                int empno = re.getInt("empno");
                String ename = re.getString("ename");
                int sal = re.getInt("sal");
                int deptno = re.getInt("deptno");
                System.out.println(empno + "    " + ename + "  " + sal + "    " + deptno);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //�ر���Դ
            conn.close();

        }



    }
}
