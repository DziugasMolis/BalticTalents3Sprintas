package java18.demo6_Prototype;

public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(int a) {
        super(a);
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype1)super.clone();
    }
}
