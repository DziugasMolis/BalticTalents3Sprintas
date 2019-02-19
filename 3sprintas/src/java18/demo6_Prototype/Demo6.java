package java18.demo6_Prototype;

public class Demo6 {

    public static void main(String[] args) throws CloneNotSupportedException {

        ConcretePrototype1 cP1 = new ConcretePrototype1(10);
        ConcretePrototype2 cP2 = new ConcretePrototype2(20);

        System.out.println(cP1);
        System.out.println(cP2);

        Prototype cP1C = cP1.clone();
        Prototype cP2C = cP2.clone();

        cP1C.setA(11);
        cP2C.setA(21);

        System.out.println(cP1C);
        System.out.println(cP2C);
        System.out.println(cP2.clone());

    }
}
