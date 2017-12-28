package 泛型类;

/**
 * Created by asd on 2016/9/13.
 */
/*
    1:可以不再强转了
    2:在编译时期就可以出错误了
 */
public class ObjectToolDemo {
    public static void main(String[] args) {
        //创建对象并指定元素类型
        ObjectTool<String> tool = new ObjectTool<>();

        tool.setObj(new String("钟福成"));
        String s = tool.getObj();
        System.out.println(s);


        //创建对象并指定元素类型
        ObjectTool<Integer> objectTool = new ObjectTool<>();
        /**
         * 如果我在这个对象里传入的是String类型的,它在编译时期就通过不了了.
         */
        objectTool.setObj(10);
        int i = objectTool.getObj();
        System.out.println(i);
    }
}
