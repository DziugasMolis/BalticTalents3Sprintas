package java16.Krepsinis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String zaidejuFailas = new File("").getAbsolutePath() + "/src/java16/Krepsinis/zaidejai.txt";
        String taskuFailas = new File("").getAbsolutePath() + "/src/java16/Krepsinis/taskai.txt";
        Map<Integer, Zaidejas> zaidejuMap = skaitytiZaidejus(zaidejuFailas);
//        System.out.println(zaidejuList);
        Map<Integer, Statistika> rezultatai = skaitytiRezultatus(taskuFailas, zaidejuMap);
//        System.out.println(rezultatai);
        Spausdinti(new TreeMap<>(rezultatai), zaidejuMap);
        Zaidejas daugiausiaTasku = zaidejuMap.get(rastiDaugiausiaTaskuPelniusi(rezultatai));
        Zaidejas daugiasiaTritaskiu = zaidejuMap.get(rastiDaugiausiaImetusiuTritaskiu(rezultatai));
        Zaidejas taikliausias = zaidejuMap.get(rastiTaikliausia(rezultatai));
        System.out.println("Daugiausia tasku pelne: " + daugiausiaTasku + " " + rezultatai.get(daugiausiaTasku.getNumeris()).getTaskai());
        System.out.println("Daugiausia imete tritaskiu: " + daugiasiaTritaskiu + " " + rezultatai.get(daugiausiaTasku.getNumeris()).getTritaskiai());
        System.out.println("Taikliausias: " + taikliausias + " " + rezultatai.get(taikliausias.getNumeris()).getTikslumas());
    }

    public static void Spausdinti(Map<Integer, Statistika> rezultatai, Map<Integer, Zaidejas> zaidejuMap) {
        System.out.println("*******************************************************************************");
//        System.out.println("|Nr.| Vardas pavarde | Baudos | Dvit. | Trit. | Taskai |Nepat.|Tikslumas|");
        System.out.println(String.format("|%3s|%22s|%8s|%7s|%7s|%8s|%6s|%9s|",
                "Nr.", "Vardas pavarde", "Baudos", "Dvit.", "Trit.", "Taskai", "Nepat.", "Tikslumas"));
        System.out.println("*******************************************************************************");
        for (Map.Entry<Integer, Statistika> entry : rezultatai.entrySet()) {
//            System.out.println(entry.getKey() + " " + zaidejuMap.get(entry.getKey()).gautiVardaPavarde()+ " " + entry.getValue());
            System.out.println(String.format("|%3s|%22s|%8s|%7s|%7s|%8s|%6s|%9.0f|",
                    entry.getKey(), zaidejuMap.get(entry.getKey()).gautiVardaPavarde(),
                    entry.getValue().getBaudos(), entry.getValue().getDvitaskiai(),
                    entry.getValue().getTritaskiai(), entry.getValue().getTaskai(),
                    entry.getValue().getNepataikyti(), entry.getValue().getTikslumas()));
        }
        System.out.println("*******************************************************************************");
    }

    public static Integer rastiDaugiausiaTaskuPelniusi(Map<Integer, Statistika> stats) {
        Integer max = 0;
        Integer maxNumeris = 0;
        for (Map.Entry<Integer, Statistika> entry : stats.entrySet()) {
            if(max < entry.getValue().getTaskai()) {
                max = entry.getValue().getTaskai();
                maxNumeris = entry.getKey();
            }
        }
        return maxNumeris;
    }

    public static Integer rastiDaugiausiaImetusiuTritaskiu(Map<Integer, Statistika> stats) {
        Integer max = 0;
        Integer maxNumeris = 0;
        for (Map.Entry<Integer, Statistika> entry : stats.entrySet()) {
            if(max < entry.getValue().getTritaskiai()) {
                max = entry.getValue().getTritaskiai();
                maxNumeris = entry.getKey();
            }
        }
        return maxNumeris;
    }

    public static Integer rastiTaikliausia(Map<Integer, Statistika> stats) {
        Double max = 0.0;
        Integer maxNumeris = 0;
        for (Map.Entry<Integer, Statistika> entry : stats.entrySet()) {
            if(max < entry.getValue().getTikslumas()) {
                max = entry.getValue().getTikslumas();
                maxNumeris = entry.getKey();
            }
        }
        return maxNumeris;
    }

    public static Map<Integer, Zaidejas> skaitytiZaidejus(String failas) {
        Map<Integer,Zaidejas> objektuMasyvas = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Integer numeris = Integer.parseInt(objektas[0]);
                String vardas = objektas[1];
                String pavarde = objektas[2];
                Zaidejas obj = new Zaidejas(numeris, vardas, pavarde);
                objektuMasyvas.put(numeris, obj);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static Map<Integer, Statistika> skaitytiRezultatus(String failas, Map<Integer, Zaidejas> zaidejasList) {
        Map<Integer, Statistika> rezultatai = sukurtiTusciaMapa(zaidejasList);
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Integer numeris = Integer.parseInt(objektas[0]);
                Integer taskai = Integer.parseInt(objektas[1]);
                if (zaidejasList.containsKey(numeris)) {
                    koreguotiStatistika(rezultatai.get(numeris), taskai);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return rezultatai;
    }

    public static void koreguotiStatistika(Statistika obj, Integer taskai) {
        switch (taskai) {
            case 0: {
                obj.setNepataikyti(obj.getNepataikyti() + 1);
                break;
            }
            case 1: {
                obj.setBaudos(obj.getBaudos() + 1);
                obj.setTaskai(obj.getTaskai() + 1);
                break;
            }
            case 2: {
                obj.setDvitaskiai(obj.getDvitaskiai() + 1);
                obj.setTaskai(obj.getTaskai() + 2);
                break;
            }
            case 3: {
                obj.setTritaskiai(obj.getTritaskiai() + 1);
                obj.setTaskai(obj.getTaskai() + 3);
                break;
            }
        }
    }

    public static Map<Integer, Statistika> sukurtiTusciaMapa(Map<Integer, Zaidejas> zaidejuMap) {
        Map<Integer, Statistika> naujasMap = new HashMap<>();

        for (Map.Entry<Integer, Zaidejas> entry : zaidejuMap.entrySet()) {
            naujasMap.put(entry.getKey(), new Statistika());
        }
        return naujasMap;
    }
}
