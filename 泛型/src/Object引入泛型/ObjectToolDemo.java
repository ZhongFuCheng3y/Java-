package Object引入泛型;

/**
 * Created by asd on 2016/9/13.
 */
/*
    Object引入泛型:
        1:早期的时候,我们使用Object来代表任意的类型
        2:向上转型是没有任何问题的,但是在向下转型的时候就隐含了类型转换的问题
        3:其实这样的程序是不安全的,所以在jdk5以后引入了泛型,提高了程序的安全性.
 */
public class ObjectToolDemo {

    public static void main(String[] args) {

        ObjectTool ot = new ObjectTool();
        // 正常使用
        ot.setObject(new Integer(27));
        Integer i = (Integer) ot.getObject();
        System.out.println("年龄是：" + i);

        ot.setObject(new String("林青霞"));
        String s = (String) ot.getObject();
        System.out.println("姓名是：" + s);

        System.out.println("---------");
        ot.setObject(new Integer(30));
        // ClassCastException
        String ss = (String) ot.getObject();
        System.out.println("姓名是：" + ss);
    }
}
