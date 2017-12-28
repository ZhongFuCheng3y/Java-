package 自定义异常;

/**
 * Created by asd on 2016/9/6.
 */
public class Teacher {
    public void check(int score) throws MyException {
        if(score >100 || score <0) {
            throw new MyException("分数一定要在0-100之间");

        }else {
            System.out.println("分数没有问题");
        }
    }
}
