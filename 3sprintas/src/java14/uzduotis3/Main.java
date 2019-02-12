package java14.uzduotis3;

import java14.data.Employee;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Salary> list = new ArrayList<>();
        list.add(new Salary(new Employee("Kazys", 1400.0, "administration"), 200d));
        list.add(new Salary(new Employee("Jonas", 800.0, "store"), 100d));
        list.add(new Salary(new Employee("Ona", 900.0, "sales"), 300d));
        list.add(new Salary(new Employee("Petras", 1200.0, "sales"), 500d));
        list.add(new Salary(new Employee("Ada", 1500.0, "administration"), 200d));
        list.add(new Salary(new Employee("Kazys", 1400.0, "administration"), 150d));
        list.add(new Salary(new Employee("Jonas", 800.0, "store"), 200d));
        list.add(new Salary(new Employee("Ona", 900.0, "sales"), 100d));
        list.add(new Salary(new Employee("Petras", 1200.0, "sales"), 400d));
        list.add(new Salary(new Employee("Ada", 1500.0, "administration"), 300d));

//       1 uzd
        Map<String, Double> s1 = list.stream()
                .collect(Collectors.groupingBy(
        o -> o.getEmployee().getName(),
        Collectors.reducing(0.0, o -> o.getAtlyginimas(), Double::sum)));
//        Collections.sort(s1, new Comparator<Map.Entry<String, Double> >() {
//            @Override
//            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
//                return (o1.getValue().compareTo(o2.getValue()));
//            }
//        });
//        LinkedHashMap<String, Double> newMap = new LinkedHashMap<>(s1);
//        Collections.sort(newMap, Comparator.comparing(LinkedHashMap.Entry.));
        System.out.println("Palei atlyginima " + s1);
//        Collections.sort(s1, (o1, o2) ->);

        Map<String, Long> s2 = list.stream()
                .collect(Collectors.groupingBy(
                        o -> o.getEmployee().getName(), Collectors.counting()
                        ));

        System.out.println("Map<String, Double>: " + s2);
    }
}
