package 动态代理;

/**
 * Created by ozc on 2016/8/29.
 */
/*
    用户操作接口
 */
public interface UserDao {
    public abstract void add();

    public abstract void delete();

    public abstract void update();

    public abstract void find();
}
