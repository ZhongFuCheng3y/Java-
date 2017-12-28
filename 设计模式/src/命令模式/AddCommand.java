package ÃüÁîÄ£Ê½;

/**
 * Created by asd on 2016/9/28.
 */
public class AddCommand implements Command {

    int sum = 0;
    @Override
    public void process(int[] arr) {
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
