package java17.Studentai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String studentuFailas = new File("").getAbsolutePath() + "/src/java17/Studentai/Studentai.txt";
        Map<String, List<Studentas>> studentai = skaitytiStudentus(studentuFailas);
        String ieskomaGrupe = "IF-6";
        System.out.println("Studentai grupes IF-5: " + studentai.get(ieskomaGrupe).size() );
        System.out.println(studentai.get(ieskomaGrupe));
    }

    public static Map<String, List<Studentas>> skaitytiStudentus(String failas) {
        Map<String, List<Studentas>> objektuMapas = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                String grupe = objektas[2];
                Studentas stud = new Studentas(vardas, pavarde, grupe);
                if (objektuMapas.containsKey(grupe)) {
                    objektuMapas.get(grupe).add(stud);
                } else {
                    objektuMapas.put(grupe, new ArrayList<>());
                    objektuMapas.get(grupe).add(stud);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMapas;
    }
}
