package java18.demo6_Prototype;

public class Prototype implements Cloneable {

    private int a = 0;

    public Prototype(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException{
        return (Prototype) super.clone();
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "a=" + a +
                '}';
    }
}
