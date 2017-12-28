package ���ӳ�;

import org.apache.commons.dbcp.BasicDataSource;

import javax.xml.transform.Source;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Created by asd on 2016/10/9.
 */
/*
    ʹ�����ӳؼ����������ݿ�����

    Ϊʲô���ڹ��췽����߳�ʼ��,���ھ�̬��?
        1:���ǵķ���ȫ�����Ǿ�̬��
        2:�����ڶ���
 */
public class DBUtil {
    //���ݿ����ӳ�
    private static BasicDataSource source;

    //Ϊ��ͬ���̹߳�������
    private static ThreadLocal<Connection> local;


    static {
        try {
            //���������ļ�
            Properties properties = new Properties();

            //��ȡ��ȡ��
            InputStream stream = DBUtil.class.getClassLoader().getResourceAsStream("���ӳ�/config.properties");

            //�������ļ��ж�ȡ����
            properties.load(stream);

            //�ر���
            stream.close();

            //��ʼ�����ӳ�
            source = new BasicDataSource();

            //��������
            source.setDriverClassName(properties.getProperty("driver"));

            //����url
            source.setUrl(properties.getProperty("url"));

            //�����û���
            source.setUsername(properties.getProperty("user"));

            //��������
            source.setPassword(properties.getProperty("pwd"));

            //���ó�ʼ��������
            source.setInitialSize(Integer.parseInt(properties.getProperty("initsize")));

            //����������������
            source.setMaxActive(Integer.parseInt(properties.getProperty("maxactive")));

            //������ĵȴ�ʱ��
            source.setMaxWait(Integer.parseInt(properties.getProperty("maxwait")));

            //������С������
            source.setMinIdle(Integer.parseInt(properties.getProperty("minidle")));

            //��ʼ���̱߳���
            local = new ThreadLocal<>();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        //��ȡConnection����
        Connection connection = source.getConnection();

        //��Connection�Ž�ThreadLocal����
        local.set(connection);

        //����Connection����
        return connection;
    }

    //�ر����ݿ�����
    public static void closeConnection() {
        //���߳����õ�Connection����
        Connection connection = local.get();

        try {
            if (connection != null) {
                //�ָ�����Ϊ�Զ��ύ
                connection.setAutoCommit(true);

                //���ﲻ����İ����ӹ���,ֻ�ǽ������ӹ黹�����ӳ�
                connection.close();

                //��Ȼ�����Ѿ��黹�����ӳ���,ThreadLocal�����Connction����Ҳ�Ѿ�û����
                local.remove();

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
