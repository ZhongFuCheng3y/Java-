package 简单工厂模式;

/**
 * Created by asd on 2016/9/27.
 */
public class AnimalFactory {
     public static Dog createDog() {
     return new Dog();
     }

     public static Cat createCat() {
     return new Cat();
     }

    public static Animal createAniaml(String type) {
        if ("dog".equals(type)) {
            return new Dog();
        } else if ("cat".equals(type)) {
            return new Cat();
        } else {
            return null;
        }
    }
}
