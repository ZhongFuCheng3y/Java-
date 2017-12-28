package 简单工厂模式具体案例;

/**
 * Created by asd on 2016/9/27.
 */
public interface Output {

    int MAX_CACHE_LINE = 50;
    void out();

    void getDate(String msg);


}
