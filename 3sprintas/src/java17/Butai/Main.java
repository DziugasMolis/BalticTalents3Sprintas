package java17.Butai;

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
        String butuFailas = new File("").getAbsolutePath() + "/src/java17/Butai/Duomenys.txt";
        String kriterijuFailas = new File("").getAbsolutePath() + "/src/java17/Butai/Kriterijai.txt";

        List<Butas> butai = skaitytiButus(butuFailas);
        Kriterijai krit = skaitytiKriterijus(kriterijuFailas);
//        System.out.println(butai);
//        butai.forEach(butas -> System.out.println(butas));
        System.out.println(atfiltruotiButus(butai, krit));

    }

    public static List<Butas> atfiltruotiButus(List<Butas> butai, Kriterijai krit) {
        List<Butas> atrinktiButai = new ArrayList<>();
        for(Butas obj: butai) {
            if(obj.getKambariuSk() >= krit.getMinKambariuSkaicius() &&
            obj.getKambariuSk() <= krit.getMaxKambariuSkaicius() &&
            obj.getKvadratura() >= krit.getMinKvadratai() &&
            obj.getKvadratura() <= krit.getMaxKvadratai() &&
            obj.getNuomosKaina() >= krit.getMinKaina() &&
            obj.getNuomosKaina() <= krit.getMaxKaina()) {
                atrinktiButai.add(obj);
            }
        }

        return atrinktiButai;
    }

    public static List<Butas> skaitytiButus(String failas) {
        List<Butas> objektuList = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Integer butoNr = Integer.parseInt(objektas[0]);
                String adresas = objektas[1] + objektas[2] + objektas[3];
                Integer kambariuSk = Integer.parseInt(objektas[4]);
                Double kvadratuSk = Double.parseDouble(objektas[5]);
                Double nuomosKaina = Double.parseDouble(objektas[6]);
                Butas obj = new Butas(butoNr,adresas,kambariuSk,kvadratuSk,nuomosKaina);
                objektuList.add(obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuList;
    }

    public static Kriterijai skaitytiKriterijus(String failas) {
        Kriterijai krit = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute1 = br.readLine();
            String[] kambariuKrit = eilute1.split(" ");
            Integer minKambariu = Integer.parseInt(kambariuKrit[0]);
            Integer maxKambariu = Integer.parseInt(kambariuKrit[1]);

            String eilute2 = br.readLine();
            String[] kvadratuKrit = eilute2.split(" ");
            Double minKvadratu = Double.parseDouble(kvadratuKrit[0]);
            Double maxKvadratu = Double.parseDouble(kvadratuKrit[1]);

            String eilute3 = br.readLine();
            String[] nuomosKrit = eilute3.split(" ");
            Double minNuoma = Double.parseDouble(nuomosKrit[0]);
            Double maxNuoma = Double.parseDouble(nuomosKrit[1]);
            krit = new Kriterijai(minKambariu, maxKambariu,
                    minKvadratu, maxKvadratu, minNuoma, maxNuoma);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return krit;
    }
}
