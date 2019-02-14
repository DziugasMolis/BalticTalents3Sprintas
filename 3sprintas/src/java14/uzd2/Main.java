package java14.uzd2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Automobilis> list = new ArrayList<>();
        list.add(new Automobilis("12", "VW", "Jonas", "Petraitis"));
        list.add(new Automobilis("22", "BMW", "Andrius", "Juozaitis"));
        list.add(new Automobilis("11", "A", "Baba", "Cezaris"));


        list.stream().sorted().forEach(automobilis -> System.out.println(automobilis));
        Collections.sort(list, (o1, o2) -> o1.getNumeris().compareTo(o2.getNumeris()));
        System.out.println();
        list.forEach(automobilis -> System.out.println(automobilis));
    }

}
