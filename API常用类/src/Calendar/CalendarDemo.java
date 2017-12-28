package Calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by asd on 2016/9/20.
 */
/*
    Calendar:
        ��Ϊ�ض�˲����һ������YEAR��MONTH��DAY_OF_MONTH��HOUR�������ֶ�֮���ת���ṩ��һЩ����
        ��Ϊ���������ֶ�(��ȡ�����ڵ�����)�ṩ��һЩ����

    public int get(int field):���ظ�ָ�������ֶε�ֵ,�������е�ÿ�������ֶζ��Ǿ�̬�ĳ�Ա����,������int����
    public void add(int field, int amount):���ݸ����������ֶκͶ�Ӧ��ʱ��,���Ե�ǰ���������в���
    public final void set(int year, int month, int date):���õ�ǰʱ���������

 */
/*
    ����:
        ��ȡ����һ��Ķ����ж�����
    ����:
        1:����¼����������
        2:�������������������
            ��:�������һ��
            ��:2��------��0��ʼ,��ʵ��������
            ��:1��
        3:��ʱ����ǰ��һ��,����2�µ����һ��
        4:�������
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //��ȡCalendar����
        Calendar calendar = Calendar.getInstance();

        System.out.println("�������һ��:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        calendar.set(year, 2, 1);

        //�������ַ����в���
        calendar.add(Calendar.DATE, -1);

        System.out.println(calendar.get(Calendar.DATE));

    }
}
