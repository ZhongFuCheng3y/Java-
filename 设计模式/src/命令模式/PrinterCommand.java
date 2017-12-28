package ÃüÁîÄ£Ê½;

/**
 * Created by asd on 2016/9/28.
 */
public class PrinterCommand implements Command {

    @Override
    public void process(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
