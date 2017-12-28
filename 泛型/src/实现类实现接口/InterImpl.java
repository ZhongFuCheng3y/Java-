package 实现类实现接口;

/**
 * Created by asd on 2016/9/17.
 */
/*
    实现类实现接口,分两种情况
        1:已经知道是什么类型了
        2:还不知道是什么类型--实现类也需要有<T>
            总体来说,第二种情况更常见
 */

/**
 * 第一种情况:
 */
/*
public class InterImpl implements Inter<String> {
    @Override
    public void show(String s) {
        System.out.println(s);

    }
}
*/

/**
 * 第二种情况:
 *      实现类也要有<T>类型的传入.
 *
 */
public class InterImpl<T> implements Inter<T> {

    @Override
    public void show(T t) {
        System.out.println(t);

    }
}
