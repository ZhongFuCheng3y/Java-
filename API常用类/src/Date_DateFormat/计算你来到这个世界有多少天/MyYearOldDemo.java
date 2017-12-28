package Date_DateFormat.������������������ж�����;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/20.
 */
/*
    ����:
        1:����¼����ĳ�������
        2:���ַ���ת��������
        3:ͨ�����ڻ�ú���ֵ
        4:�õ�ǰ�ĺ���ֵ-������ĺ���ֵ
        5:���������
 */
public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("������ĳ�������");
        String s = scanner.nextLine();

        //���ַ���ת��������
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dd = sdf.parse(s);

        //��ȡ���ڵĺ���ֵ
        long myTime = dd.getTime();

        long nowTime = System.currentTimeMillis();

        long time = nowTime - myTime;

        long day = time / 1000 / 60 / 60 / 24;
        System.out.println(day);

    }
}
