package java19.BuitineTechnika;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java19/BuitineTechnika/Duomenys.txt";
        String failas1 = new File("").getAbsolutePath() + "/src/java19/BuitineTechnika/Uzsakymai.txt";
        Map<Integer, Technika> buitinesMap = skaitytiTechnika(failas);
//        System.out.println(buitinesMap);
        Map<Integer, Technika> reikiaUzsakyti = skaitytiUzsakymus(failas1, buitinesMap);
        Spausdinti(buitinesMap, "Liko sandelyje: ");
        Spausdinti(reikiaUzsakyti, "Reikia uzsakyti: ");
    }

    public static void Spausdinti(Map<Integer, Technika> map, String pav) {
        System.out.println(pav);
        for(Technika obj: map.values()) {
            System.out.println(obj);
        }
    }

    public static Map<Integer, Technika> skaitytiTechnika(String failas) {
        Map<Integer, Technika> objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String pavadinimas = "";
                for(int i = 0; i < objektas.length-3; i++) {
                    pavadinimas += " " + objektas[i];
                }
                Integer id = Integer.parseInt(objektas[objektas.length-3]);
                Integer kiekis = Integer.parseInt(objektas[objektas.length-2]);
                Double kaina = Double.parseDouble(objektas[objektas.length-1]);
                Technika obj = new Technika(pavadinimas, id, kiekis, kaina);
                objektuMap.put(id, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }


    public static Map<Integer, Technika> skaitytiUzsakymus(String failas, Map<Integer, Technika> map) {
        Map<Integer, Technika> reikiaUzsakymu = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Integer id = Integer.parseInt(objektas[0]);
                Integer uzsakymuKiekis = Integer.parseInt(objektas[1]);
                Integer kiekLiko = map.get(id).getVntSkaicius() - uzsakymuKiekis;
                map.get(id).setVntSkaicius(kiekLiko);
                if(map.get(id).getVntSkaicius() < 0) {
                    reikiaUzsakymu.put(id, map.get(id));
                    map.remove(id);
                    Technika uzsakymas = reikiaUzsakymu.get(id);
                    uzsakymas.setVntSkaicius(Math.abs(uzsakymas.getVntSkaicius()));
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return reikiaUzsakymu;
    }
}
