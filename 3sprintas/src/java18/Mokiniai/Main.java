package java18.Mokiniai;

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
        String mokiniuFailas = new File("").getAbsolutePath() + "/src/java18/Mokiniai/Duomenys.txt";
        Map<String, List<Mokinys>> mokiniai = skaitytiMokinius(mokiniuFailas);
//        System.out.println(mokiniai);
        Spausdinti(mokiniai);
        Mokinys maxVidurkis = rastiDidziausiaVidurki(mokiniai);
        System.out.println("Didziausias vidurkis: " + maxVidurkis.getVardas() + " " +
                maxVidurkis.getPavarde() + " is " + maxVidurkis.getKlase());

        Mokinys minVidurkis = rastiMaziausiaVidurki(mokiniai);
        System.out.println("Maziausias vidurkis: " + minVidurkis.getVardas() + " " +
                minVidurkis.getPavarde() + " is " + minVidurkis.getKlase());
    }

    public static Mokinys rastiDidziausiaVidurki(Map<String, List<Mokinys>> mokiniai) {
        Double max = 0.0;
        Mokinys maxObj = null;
        for(String key: mokiniai.keySet()) {
            for(Mokinys obj: mokiniai.get(key)) {
                if(obj.gautiPazymiuVidurki() > max) {
                    max = obj.gautiPazymiuVidurki();
                    maxObj = obj;
                }
            }
        }
        return maxObj;
    }

    public static Mokinys rastiMaziausiaVidurki(Map<String, List<Mokinys>> mokiniai) {
        Double min = 10.0;
        Mokinys minObj = null;
        for(String key: mokiniai.keySet()) {
            for(Mokinys obj: mokiniai.get(key)) {
                if(obj.gautiPazymiuVidurki() < min) {
                    min = obj.gautiPazymiuVidurki();
                    minObj = obj;
                }
            }
        }
        return minObj;
    }

    public static void Spausdinti(Map<String, List<Mokinys>> mokiniai) {
        for(String key: mokiniai.keySet()) {
            System.out.println("Klasė " + key + ":");
            for(Mokinys obj: mokiniai.get(key)) {
                System.out.println(obj);
            }
        }
    }

    public static Map<String, List<Mokinys>> skaitytiMokinius(String failas) {
        Map<String, List<Mokinys>> objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                String klase = objektas[2];
                Integer kiekPazymiu = Integer.parseInt(objektas[3]);
                List<Integer> pazymiai = new ArrayList<>();
                for (int i = 4; i < objektas.length; i++) {
                    pazymiai.add(Integer.parseInt(objektas[i]));
                }
                Mokinys obj = new Mokinys(vardas, pavarde, klase, kiekPazymiu, pazymiai);
                if(objektuMap.containsKey(klase)) {
                    objektuMap.get(klase).add(obj);
                } else {
                    objektuMap.put(klase, new ArrayList<>());
                    objektuMap.get(klase).add(obj);
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
}
