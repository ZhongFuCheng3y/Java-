package �򵥹���ģʽ���尸��;

/**
 * Created by asd on 2016/9/27.
 */
public class Printer implements Output {

    private String[] printDate = new String[MAX_CACHE_LINE];
    private int dateNumber = 0;

    @Override
    public void out() {
        while (dateNumber > 0) {

            System.out.println("��ӡ�����ڴ�ӡ" + printDate[0]);
            //����ҵ����������ǰ�ƶ�һλ,����ʣ�µ���ҵ����1
            System.arraycopy(printDate, 1, printDate, 0, dateNumber--);
        }
    }

    @Override
    public void getDate(String msg) {
        if (dateNumber >= MAX_CACHE_LINE) {
            System.out.println("�����������,���ʧ��");

        } else {
            printDate[dateNumber++] = msg;
        }
    }
}
