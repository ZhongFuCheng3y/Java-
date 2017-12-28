package 简单工厂模式具体案例;

/**
 * Created by asd on 2016/9/27.
 */
/*
    1:Computer类需要组合一个输出设备,是直接组合实现类Printer还是Output接口
    2:假如组合了Printer类,日后需要重构,就需要改大量的代码,这不利于对程序的维护
    3:所以选择组合Output接口
 */
/*
    1:Computer组合Output接口,实际上也是组合Printer或BetterPrinter实现类
    2:只不过对Computer完全透明而已
    3:为了更符合面向对象编程,创建Output实现类应该专门定义一个类(也就是工厂)来操作
    4:把所有生成Output对象的逻辑集中在OutputFactory工厂类中管理
    5:所有需要使用Output对象的类只需要与Output接口耦合,而不是与具体的实现类耦合.
 */
public class Computer {

    private Output out;

    public Computer(Output out) {
        this.out = out;

    }
    public void keyIn(String msg) {
        out.getDate(msg);
    }

    public void print() {
        out.out();
    }
}
