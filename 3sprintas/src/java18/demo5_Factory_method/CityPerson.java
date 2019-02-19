package java18.demo5_Factory_method;

public class CityPerson implements IPerson {

    @Override
    public String getName() {
        return "City Person";
    }

    @Override
    public String toString() {
        return "CityPerson{" + getName() + "}";
    }
}
