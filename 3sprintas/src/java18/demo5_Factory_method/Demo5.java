package java18.demo5_Factory_method;

public class Demo5 {

    public static void main(String[] args) {

        IPerson person = Factory.createPerson(PersonType.Rural);

        System.out.println(person);

        person = Factory.createPerson(PersonType.Urban);

        System.out.println(person);

        person = Factory.createPerson(PersonType.Kaunietis);

        System.out.println(person);
    }
}
