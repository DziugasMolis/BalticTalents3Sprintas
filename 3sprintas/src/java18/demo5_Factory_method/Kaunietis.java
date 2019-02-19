package java18.demo5_Factory_method;

public class Kaunietis implements IPerson {
    @Override
    public String getName() {
        return "Kaunietis";
    }

    @Override
    public String toString() {
        return "KaunietisPerson{" + getName() + "}";
    }
}
