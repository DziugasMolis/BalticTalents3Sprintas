package java15.uzd1;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Saskaita> list = new ArrayList<>();
        list.add(new Saskaita("Petras", LocalDate.parse("2019-01-01"), BigDecimal.valueOf(500.0)));
        list.add(new Saskaita("Jonas", LocalDate.parse("2019-01-05"), BigDecimal.valueOf(600.0)));
        list.add(new Saskaita("Darius", LocalDate.parse("2019-05-01"), BigDecimal.valueOf(800.0)));
        list.add(new Saskaita("Andrius", LocalDate.parse("2019-08-01"), BigDecimal.valueOf(300.0)));
        list.add(new Saskaita("Benas", LocalDate.parse("2019-08-01"), BigDecimal.valueOf(1000.0)));
        list.add(new Saskaita("Petras", LocalDate.parse("2019-11-01"), BigDecimal.valueOf(2000.0)));
        list.add(new Saskaita("Petras", LocalDate.parse("2019-09-01"), BigDecimal.valueOf(500.0)));
        list.add(new Saskaita("Jonas", LocalDate.parse("2019-10-05"), BigDecimal.valueOf(600.0)));
        list.add(new Saskaita("Darius", LocalDate.parse("2019-11-01"), BigDecimal.valueOf(800.0)));
        list.add(new Saskaita("Andrius", LocalDate.parse("2019-04-01"), BigDecimal.valueOf(300.0)));
        list.add(new Saskaita("Benas", LocalDate.parse("2019-02-01"), BigDecimal.valueOf(1000.0)));
        list.add(new Saskaita("Petras", LocalDate.parse("2019-12-01"), BigDecimal.valueOf(2000.0)));
        list.add(new Saskaita("Petras", LocalDate.parse("2019-10-01"), BigDecimal.valueOf(500.0)));
        list.add(new Saskaita("Jonas", LocalDate.parse("2019-06-05"), BigDecimal.valueOf(600.0)));
        list.add(new Saskaita("Darius", LocalDate.parse("2019-08-01"), BigDecimal.valueOf(800.0)));
        list.add(new Saskaita("Andrius", LocalDate.parse("2019-07-01"), BigDecimal.valueOf(300.0)));
        list.add(new Saskaita("Benas", LocalDate.parse("2019-04-01"), BigDecimal.valueOf(1000.0)));
        list.add(new Saskaita("Petras", LocalDate.parse("2019-12-01"), BigDecimal.valueOf(2000.0)));
        Map<Integer,Double> map = new HashMap<>();
//        Spausdinti(list, "Pradinis list");
        atrinktiSaskaitasPagalKetvircius(list, map);
        System.out.println(map);
    }

    public static void Spausdinti(List<Saskaita> list, String spausdinimoPav) {
        System.out.println(spausdinimoPav);
        for(Saskaita obj: list) {
            System.out.println(obj);
        }
        System.out.println("-------------------------------------------------");
    }

    public static void atrinktiSaskaitasPagalKetvircius(List<Saskaita> list, Map<Integer,Double> map) {
        for(Saskaita obj: list) {
            PridetiReiksmeMap(map, obj);
        }
    }

    public static void PridetiReiksmeMap(Map<Integer,Double> map, Saskaita obj) {
        switch (obj.getSaskaitosData().getMonthValue()) {
            case 1:
            case 2:
            case 3: {
                map.put(1,((map.containsKey(1) ? map.get(1)
                        + obj.getSuma().doubleValue() : obj.getSuma().doubleValue())));
                break;
            }
            case 4:
            case 5:
            case 6: {
                map.put(2,((map.containsKey(2) ? map.get(2)
                        + obj.getSuma().doubleValue() : obj.getSuma().doubleValue())));
                break;
            }
            case 7:
            case 8:
            case 9: {
                map.put(3,((map.containsKey(3) ? map.get(3)
                        + obj.getSuma().doubleValue() : obj.getSuma().doubleValue())));
                break;
            }
            default: {
                map.put(4,((map.containsKey(4) ? map.get(4)
                        + obj.getSuma().doubleValue() : obj.getSuma().doubleValue())));
            }
        }

    }
}
