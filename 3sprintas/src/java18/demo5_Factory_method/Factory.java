package java18.demo5_Factory_method;

public class Factory {

    public static IPerson createPerson(PersonType type)
    {
        switch (type)
        {
            case Rural:
                return new Villager();

            case Urban:
                return new CityPerson();

            case Kaunietis:
                return new Kaunietis();
            default:
                throw new IllegalArgumentException();
        }
    }
}
