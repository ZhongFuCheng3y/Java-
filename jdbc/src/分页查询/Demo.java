package ��ҳ��ѯ;



import ���ӳ�.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created by asd on 2016/10/10.
 */
/*
    ��ҳ����
        ���ҳ
            �����ݿ���
            ��¼���ݴ�
        �ٷ�ҳ
            ���ڴ�����---��ӦЧ�ʸ�--�������ݿ�ѹ��
                    ----������ݶ�,�ڴ�ѹ����
            ��¼����С
 */
/*
    DAO(Data Access Object)���ݷ��ʶ���
        ----���ݳ־ò�
        ----���ݴ浽Ӳ��
    ���������ݿ��ҵ���֮��,��װ���ж����ݿ�ķ���
    Ŀ��:
        ���ݷ����߼���ҵ���߼��ֿ�
        �����ǲ������ݿ����������
 */
public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫ�鿴�ı���:");
        String tableName = scanner.nextLine().trim();
        System.out.println("������Ҫ���������:");
        String colName = scanner.nextLine().trim();
        System.out.println("������һҳ��ʾ������:");
        int pagesize = Integer.parseInt(scanner.nextLine().trim());
        System.out.println("������鿴��ҳ��:");
        int page = Integer.parseInt(scanner.nextLine().trim());

        /**SELECT * FROM (
         *  SELECT ROWNUM rn,t.* FROM (
         *     SELECT * FROM t ORDER BY c
         *  )t
         * )
         *  WHERE rn BETWEEN ? AND ?
         */
        try {
            //�������ݿ�
            Connection connection = DBUtil.getConnection();

            /**
             * SELECT * FROM (
             *   SELECT ROWNUM rn,t.* FROM (
             *      SELECT * FROM t ORDER BY c
             *   )t
             *  )
             *  WHERE rn BETWEEN ? AND ?
             */
            String sql = "SELECT * FROM ( "
                   + "SELECT ROWNUM rn,t.* FROM ( "
                        + "SELECT * FROM "+tableName+" ORDER BY "+colName +" "
                        + ")t "
                        + ") "
                        + "WHERE rn BETWEEN ? AND ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int start = (page - 1) * pagesize + 1;
            int end = page * pagesize;
            preparedStatement.setInt(1, start);
            preparedStatement.setInt(2, end);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int rw = resultSet.getInt(1);
                int id = resultSet.getInt(2);
                String name = resultSet.getString(3);
                System.out.println(rw + "  " + id + "   " + name);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
