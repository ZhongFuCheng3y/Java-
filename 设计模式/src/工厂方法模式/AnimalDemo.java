package 工厂方法模式;

/**
 * Created by asd on 2016/9/27.
 */

/**
 *  简单工厂模式:
 *      在工厂类中创建对象,如果有对象增加,对象需要重构,就要改写工厂类的代码,维护不方便
 *
 *  工厂方法:
 *      在抽象工厂类中定义接口,具体创建对象的工作又继承抽象工厂的具体类实现.
 *
 */
/*
    工厂方法模式概述:
        1:工厂方法模式中抽象工厂类负责定义创建对象的接口
        2:具体对象的创建工作由继承抽象工厂的具体类实现

    优点:
        1:客户端不需要在负责对象的创建,明确了各个类的职责
        2:如果有新的对象增加,只需要增加一个具体的类和具体的工厂类即可
        3:不会影响已有的代码,后期维护容易,增强系统的扩展性
    缺点:
        1:需要额外的编写代码,增加了工作量

 */
public class AnimalDemo {
    public static void main(String[] args) {
        //我需要买一只狗
        /**
         * 运用了多态
         *  能够隐藏具体的实现方式.
         */
        Factory f = new DogFactory();
        Animal a = f.createAnimal();
        a.eat();
        System.out.println("-----------");

        //我要买一只猫
        Factory ff = new CatFactory();
        Animal aa = ff.createAnimal();
        aa.eat();

    }
}
