package java18.demo5_Factory_method;

public class Villager implements IPerson {

    @Override
    public String getName() {
        return "Village Person";
    }

    @Override
    public String toString() {
        return "Villager{" + getName() + "}";
    }
}
