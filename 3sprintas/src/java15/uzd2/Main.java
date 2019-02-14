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
        ArrayList<Employee> atfiltruoti = rastiVienodus(list);
        spausdinti(atfiltruoti, "Rasti vienodi");
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


    public static ArrayList<Employee> rastiVienodus(List<Employee> list) {
        ArrayList<Employee> vienodi = new ArrayList<>();
        vienodi.add(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            if(!vienodi.contains(list.get(i))) {
                vienodi.add(list.get(i));
            }
        }
//        Set<Employee> unikalus = new HashSet<>(list);
//
//        for(Employee obj: unikalus) {
//            System.out.println(obj);
//        }
//        unikalus.add(list.get)
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if(list.get(i).equals(list.get(j))){
//                    unikalus.add(list.get(j));
////                    if(!vienodi.contains(list.get(j))) {
////                        vienodi.add(list.get(j));
////                    }
//                }
//            }
//        }
//        System.out.println(unikalus);
        return vienodi;
    }
}
