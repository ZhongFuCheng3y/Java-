package 简单工厂模式具体案例;

/**
 * Created by asd on 2016/9/27.
 */
public class Printer implements Output {

    private String[] printDate = new String[MAX_CACHE_LINE];
    private int dateNumber = 0;

    @Override
    public void out() {
        while (dateNumber > 0) {

            System.out.println("打印机正在打印" + printDate[0]);
            //把作业队列整体向前移动一位,并将剩下的作业数减1
            System.arraycopy(printDate, 1, printDate, 0, dateNumber--);
        }
    }

    @Override
    public void getDate(String msg) {
        if (dateNumber >= MAX_CACHE_LINE) {
            System.out.println("输出队列已满,添加失败");

        } else {
            printDate[dateNumber++] = msg;
        }
    }
}
