package 通用设置某个对象的某个属性为指定的值;

import java.lang.reflect.Field;

/**
 * Created by ozc on 2016/8/29.
 */

/*
    1：首先要获取传入对象的Class对象
    2：通过Class对象获取Field对象----getDeclaredField
    3：取消访问检查--------setAccessible
    4：Field.set()实现功能
 */
public class Tool {
    public void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {

        //获取Class对象
        Class c = obj.getClass();

        //获取该对象的propertyName成员变量
        Field field = c.getDeclaredField(propertyName);

        //取消访问检查
        field.setAccessible(true);

        //给对象的成员变量赋值为指定的值
        field.set(obj,value);
    }
}
