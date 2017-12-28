package ArrayList去除集合中重复的值;

import java.util.ArrayList;

/**
 * Created by asd on 2016/9/13.
 */
/*
    需求:
        ArrayList去除集合中重复的值,只能在同一个集合中做

    分析:
        1:创建集合对象
        2:添加元素到集合对象里面
        3:选择排序的思想
        4:第一个元素跟其他后面的元素比较,如果相同,就remove掉了




 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList arrayList = new ArrayList();

        //添加元素
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("world");
        arrayList.add("hello");
        arrayList.add("java");
        arrayList.add("java");

        //选择排序的思想
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    arrayList.remove(j);
                    j--;
                }
            }
        }

        //最后遍历
        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            System.out.println(s);

        }

    }
}
