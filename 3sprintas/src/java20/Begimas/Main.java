package java20.Begimas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java20/Begimas/Duomenys.txt";
        Map<Integer, Begikas> begikai = skaityti(failas);
        System.out.println(begikai);

        Map<Integer, Begikas> finisave = atrinktiFinisavusius(begikai);
        System.out.println(finisave);

        List<Begikas> list = new ArrayList<>(finisave.values());
        Collections.sort(list);
        Begikas pirmaVieta = list.get(0);
        System.out.println(pirmaVieta.getVardas() + " " +
                pirmaVieta.getPavarde() + " I vieta");
        System.out.println(list);
    }

    public static Map<Integer, Begikas> atrinktiFinisavusius(Map<Integer, Begikas> begikai) {
        Map<Integer, Begikas> atrinkti = new HashMap<>();
        for(Begikas obj: begikai.values()) {
            if(obj.getPunktai().contains(5)) {
                atrinkti.put(obj.getBegikoNr(),obj);
            }
        }
        return atrinkti;
    }

    public static Map<Integer, Begikas> skaityti(String failas) {
        Map<Integer, Begikas> objektuMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer kiekBegiku = Integer.parseInt(line);
            for(int i = 0; i < kiekBegiku; i++) {
                line = br.readLine();
                sudetiBegikus(objektuMap, line, i);
            }
            line = br.readLine();
            Integer kiekPunktu = Integer.parseInt(line);
            for(int i = 0; i < kiekPunktu; i++) {
                line = br.readLine();
                sudetiPunktus(objektuMap, line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }

    public static void sudetiBegikus(Map<Integer, Begikas> objektuMap, String line, Integer begikoNr) {
        String[] objektas = line.split(" ");
        String vardas = objektas[0];
        String pavarde = objektas[1];
        String pradzia = objektas[2];
        String pabaiga = objektas[3];
        Begikas obj = new Begikas(begikoNr + 1, vardas, pavarde, pradzia, pabaiga);
        objektuMap.put(begikoNr + 1, obj);
    }

    public static void sudetiPunktus(Map<Integer, Begikas> objektuMap, String line) {
        String[] objektas = line.split(" ");
        Integer trasosId = Integer.parseInt(objektas[0]);
        Integer begikuSk = Integer.parseInt(objektas[1]);
        for(int j = 2; j < begikuSk + 2; j++) {
            Integer begikasNr = Integer.parseInt(objektas[j]);
            objektuMap.get(begikasNr).getPunktai().add(trasosId);
        }
    }
}
