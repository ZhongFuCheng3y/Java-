package 工厂方法模式;

public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

}
