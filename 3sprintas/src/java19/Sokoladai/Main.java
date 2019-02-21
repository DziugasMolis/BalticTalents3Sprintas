package java19.Sokoladai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java19/Sokoladai/Duomenys.txt";
        Map<String, List<Sokoladas>> sokoladai = skaityti(failas);
        System.out.println(sokoladai);
        rikiuoti(sokoladai);
        System.out.println(sokoladai);
    }

    public static void rikiuoti(Map<String, List<Sokoladas>> sokoladai) {
        for(String key: sokoladai.keySet()) {
            Collections.sort(sokoladai.get(key),
                    (o1, o2) -> o1.getIvertinimas().compareTo(o2.getIvertinimas()));
        }
    }

    public static Map<String, List<Sokoladas>> skaityti(String failas) {
        Map<String, List<Sokoladas>> objektuMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                String[] eil = gautiSutvarkytaEilute(line);
                String gamykla = eil[0];
                Integer kiekSokoladu = Integer.parseInt(eil[1]);
                objektuMap.put(gamykla, new ArrayList<>());
                for(int i = 0; i < kiekSokoladu; i++) {
                    line = br.readLine();
                    Sokoladas obj = sukurtiObjekta(line);
                    objektuMap.get(gamykla).add(obj);
                }

                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }

    public static String[] gautiSutvarkytaEilute(String line) {
        String[] sutvarkytaEilute = new String[2];
        String[] objektas = line.split(" ");
        String gamykla = "";
        for (int i = 0; i < objektas.length - 1; i++) {
            gamykla += " " + objektas[i];
        }
        sutvarkytaEilute[0] = gamykla;
        sutvarkytaEilute[1] = objektas[objektas.length-1];
        return sutvarkytaEilute;
    }

    public static Sokoladas sukurtiObjekta(String eilute) {
        String[] objektas = eilute.split(" ");
        String sokoladoPavadinimas = "";
        for (int i = 0; i < objektas.length - 1; i++) {
            sokoladoPavadinimas += " " + objektas[i];
        }
        Integer ivertinimas = Integer.parseInt(objektas[objektas.length - 1]);
        return new Sokoladas(sokoladoPavadinimas, ivertinimas);
    }
}
