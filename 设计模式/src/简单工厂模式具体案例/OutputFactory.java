package �򵥹���ģʽ���尸��;

/**
 * Created by asd on 2016/9/27.
 */
public class OutputFactory {
    public Output getOutput() {
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory of = new OutputFactory();
        Computer c = new Computer(of.getOutput());
        c.keyIn("zhongfucheng");
        c.keyIn("ouzicheng");
        c.print();

    }
}
