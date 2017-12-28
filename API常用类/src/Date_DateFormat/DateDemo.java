package Date_DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by asd on 2016/9/19.
 */
/*
    Date:
        ��ʾ�ض���˲��,��ȷ������

    ���췽��:
        1:Date():���ݵ�ǰĬ��è��ֽ�������ڶ���
        2:Date(long date):����ָ���ĺ���ֵ�������ڶ���

    ����:
        public long getTime():��ȡʱ��,�Ժ���Ϊ��λ  --��Date�õ�һ������ֵ
        public void setTime(long time):����ʱ��----��һ������ֵת��ΪDate

    ת��:
        Date --- String(��ʽ��)
            public final String format(Date date)

        String --- Date(����)
            public Date parse(String source)

        DateFormat:
            ���Խ������ں��ַ����ĸ�ʽ���ͽ���,�������ǳ�����,����ֻ���þ���ʵ����SimpleDateFormat

    SimpleDateFormat���췽��:
        SimpleDateFormat():Ĭ��ģʽ
        SimpleDateFormat(String Pattern):������ģʽ
        ��  y
        ��  M
        ��  d
        ʱ  H
        ��  m
        ��  s


 */
public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //�������ڶ���
        Date d = new Date();

        //������ʽ������,����ģʽ
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");

        //���÷���,�õ�һ���ַ���
        String s = sdf.format(d);
        System.out.println(s);

        //----------------------------------------------------------------------

        //��һ���ַ���������Date����
        String str = "2008-08-08 12:12:12";

        //���������ַ������󲢸���ģʽ
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(str);
        System.out.println(dd);

    }
}
