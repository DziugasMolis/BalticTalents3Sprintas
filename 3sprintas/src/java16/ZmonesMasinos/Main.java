package java16.ZmonesMasinos;

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
        String masinuFailas = new File("").getAbsolutePath() + "/src/java16/ZmonesMasinos/Masinos.txt";
        String zmoniuFailas = new File("").getAbsolutePath() + "/src/java16/ZmonesMasinos/DarbuotojuDuomenys.txt";

        List<Zmogus> zmones = skaitytiZmones(zmoniuFailas);
        List<Masina> masinos = skaitytiMasinas(masinuFailas);
//        System.out.println(zmones);
//        System.out.println(masinos);

        Map<String, Map<String, String>> apjungtiDuomenys = apjungtiDuomenys(zmones, masinos);
//        System.out.println(apjungtiDuomenys);
//        testMap();
    }

    public static void testMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c",3);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (map.get("e") != null) {
                System.out.println(map.get("a"));
//                System.out.println(entry.getKey() + "/" + entry.getValue());
            }
//        }
    }

    public static Map<String, Map<String, String>> apjungtiDuomenys(List<Zmogus> zmones, List<Masina> masinos) {
        Map<String, Map<String, String>> data = new HashMap<>();

//        Susidedame zmones
        for(Zmogus obj : zmones) {
            data.put(obj.getVardas() + obj.getPavarde(), new HashMap<>());
        }

//        Susidedame i vidini Map raktus(masinos numerius)
        for (Map.Entry<String, Map<String,String>> entry : data.entrySet())
        {
            for(int i = 0; i < zmones.size(); i++) {
                if(entry.getKey().equals(zmones.get(i).getVardas()+zmones.get(i).getPavarde())) {
                    entry.getValue().put(zmones.get(i).getMasinosNumeriai(), "");
                }
            }

        }

        for (Map.Entry<String, Map<String,String>> entry : data.entrySet())
        {
            for(int i = 0; i < masinos.size(); i++) {
                if(entry.getValue().get(masinos.get(i).getNumeriai()) != null) {
                    entry.getValue().put(masinos.get(i).getNumeriai(),masinos.get(i).getMarke());
                }
            }
            System.out.println(entry.getKey() + "/" + entry.getValue());
        }


        return data;
    }

    public static ArrayList<Zmogus> skaitytiZmones(String failas) {
        ArrayList<Zmogus>  objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
//                String masinosNumeriai = objektas[2];
                String masinosNumeriai = objektas.length == 3 ? objektas[2] : "";
                Zmogus obj = new Zmogus(vardas, pavarde, masinosNumeriai);
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

    public static ArrayList<Masina> skaitytiMasinas(String failas) {
        ArrayList<Masina>  objektuMasyvas = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String marke = objektas[0];
                String masinosNumeriai = objektas[1];
                Masina obj = new Masina(marke, masinosNumeriai);
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
}
