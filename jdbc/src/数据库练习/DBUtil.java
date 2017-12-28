package ���ݿ���ϰ;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by asd on 2016/10/8.
 */
/*
    ʹ�������ļ�������JDBC���ݿ�����
    ������������������ݿ������

    Ŀ��:
        1:�����ʲô,�Ҿͷ���һ�����Ӹ���
        2:����Statement����,ִ��sql���
 */

/*
    ThreadLoaclԭ��:
        1:���ǿ��Դ���һ��Map����,key��Thread,value��Connection
        2:���Ǵ�����Connection������ͬһ���߳��е�
        3:����,���Ը���Thread�ҵ�Connection

    ����:
        ���ڹ���ͬ�߳�����ȡ������
 */

public class DBUtil {

    //�������ݿ��url
    private static String url;

    //�������ݿ������
    private static String pwd;

    //�������ݿ���û���
    private static String user;

    //����ThreadLocal����,key��Զ���߳�
    private static ThreadLocal<Connection> local = new ThreadLocal();





    //��̬��
    static {
        try {
            //��ȡ�����ļ�
            Properties properties = new Properties();

            //��ȡ�����ļ�������������ʽд,�൱����srcĿ¼��
            InputStream stream = DBUtil.class.getClassLoader().getResourceAsStream("���ݿ���ϰ/config.properties");
            //FileInputStream stream = new FileInputStream("config.properties");
            properties.load(stream);

            //�رն�ȡ��
            stream.close();

            //��ȡ����
            String driver = properties.getProperty("driver");

            //��ȡ��ַ
            url = properties.getProperty("url");

            //��ȡ�û���
            user = properties.getProperty("user");

            //��ȡ����
            pwd = properties.getProperty("pwd");

            //����������
            Class.forName(driver);


        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * ��ȡһ������
     *
     * @return
     */
    public static Connection getConnection() throws SQLException {
        //ͨ��DriverManager�������ݿ������,������
        //Ϊ�������ʼ�����û���,url,�����ܹ������������ʹ��,�����Ƕ����static

        try {
            Connection connection =  DriverManager.getConnection(url, user, pwd);

            //�Ὣ��ǰ�߳���Ϊkey,����ָ����ֵ��Ϊvalue�����ڲ�Map����
            local.set(connection);

            return connection;

        } catch (SQLException e) {
            e.printStackTrace();

            //���������,���ǰ��쳣�׳�,֪ͨ���,�������ݿ�ʧ����!
            throw e;
        }
    }


    public static void closeConnection() {

        try {
            //�õ�Connection����
            Connection connection = local.get();
            if (connection != null) {
                connection.close();

                //connection�����Ѿ���ɾ����,��û����
                local.remove();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
