package java15.uzd2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String duomenys = new File("").getAbsolutePath() + "/src/java15/uzd2/DarbuotojuDuomenys.txt";
        List<Employee> list = skaityti(duomenys);
//        spausdinti(list, "Pradiniai duomenys");
//        Collections.sort(list);
//        spausdinti(list, "Surikiuoti duomenys");
        Map<Employee, Integer> atfiltruoti = rastiVienodus(list);
        atfiltruoti.entrySet().forEach(x -> System.out.println("Darbuotojas " + x.getKey() + " Kiekis: " + x.getValue()));
//        spausdinti(atfiltruoti, "Rasti vienodi");
    }

    public static void spausdinti(List<Employee> list, String atliktaUzduotis) {
        System.out.println("----------------------------------------");
        System.out.println("-----------"+ atliktaUzduotis+"-----------");
        System.out.println("----------------------------------------");

        for(Employee obj: list) {
            System.out.println(obj);
        }
    }

    public static ArrayList<Employee> skaityti(String failas) {
        ArrayList<Employee>  objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                String departamentas = objektas[2];
                Double alga = Double.parseDouble(objektas[3]);
                Employee obj = new Employee(vardas, pavarde, departamentas, alga);
                objektuMasyvas.add(obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }

        return objektuMasyvas;
    }


    public static Map<Employee, Integer> rastiVienodus(List<Employee> list) {
        Map<Employee, Integer> counts = new HashMap<>();

        for (Employee obj: list) {
            if (counts.containsKey(obj)) {
                counts.put(obj, counts.get(obj) + 1);
            } else {
                counts.put(obj, 1);
            }
        }
        return counts;
    }
}
