package �򵥹���ģʽ���尸��;

/**
 * Created by asd on 2016/9/27.
 */
/*
    1:Computer����Ҫ���һ������豸,��ֱ�����ʵ����Printer����Output�ӿ�
    2:���������Printer��,�պ���Ҫ�ع�,����Ҫ�Ĵ����Ĵ���,�ⲻ���ڶԳ����ά��
    3:����ѡ�����Output�ӿ�
 */
/*
    1:Computer���Output�ӿ�,ʵ����Ҳ�����Printer��BetterPrinterʵ����
    2:ֻ������Computer��ȫ͸������
    3:Ϊ�˸��������������,����Outputʵ����Ӧ��ר�Ŷ���һ����(Ҳ���ǹ���)������
    4:����������Output������߼�������OutputFactory�������й���
    5:������Ҫʹ��Output�������ֻ��Ҫ��Output�ӿ����,������������ʵ�������.
 */
public class Computer {

    private Output out;

    public Computer(Output out) {
        this.out = out;

    }
    public void keyIn(String msg) {
        out.getDate(msg);
    }

    public void print() {
        out.out();
    }
}
