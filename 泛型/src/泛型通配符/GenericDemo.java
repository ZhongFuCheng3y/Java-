package 泛型通配符;

/**
 * Created by asd on 2016/9/17.
 */
/*
    ?:
        任意类型,如果没有明确,就是Object以及任意java类
    ? extends E :
        向下限定,只要是E或者是E的子类就可以了
    ? super E :
        向上限定,只要是E或者是E的父类就可以了

    要点:
        1:泛型要是明确写的时候,前后必须是一致的
        2:?表示任意的类型都可以
        3:? extends E 向下限定,只要是E或E的子类就可以了
        4:? super E 向上限定,只要是E或者是E的父类就可以了
 */

public class GenericDemo {

}







class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}
