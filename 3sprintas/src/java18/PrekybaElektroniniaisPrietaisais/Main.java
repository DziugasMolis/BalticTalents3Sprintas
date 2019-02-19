package java18.PrekybaElektroniniaisPrietaisais;

import java17.Programuotojai.Programuotojas;

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
        String telefonuFailas = new File("").getAbsolutePath() + "/src/java18/PrekybaElektroniniaisPrietaisais/Duomenys.txt";
        Map<Integer,Telefonas> telefonai = skaitytiTelefonus(telefonuFailas);
        Integer populiariausioId = gautiPopuliariausia(telefonai);
        System.out.println("Populiariausias: " + telefonai.get(populiariausioId));

    }

    public static Integer gautiPopuliariausia(Map<Integer,Telefonas> telefonai) {
        Integer maxId = 0;
        Integer max = 0;
        for(Telefonas obj: telefonai.values()) {
           if(obj.getPardavimuSkaicius() > max) {
               max = obj.getPardavimuSkaicius();
               maxId = obj.getId();
           }
        }
        return maxId;
    }

    public static Map<Integer, Telefonas> skaitytiTelefonus(String failas) {
        Map<Integer, Telefonas>  objektuMap = new HashMap<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer telefonuSkaicius = Integer.parseInt(line);
            for(int i = 0; i < telefonuSkaicius; i++) {
                line = br.readLine();
                if(line != null) {
                    objektas = line.split(" ");
                    Integer id = Integer.parseInt(objektas[0]);
                    String pav = objektas[1] + objektas[2] + objektas[3];
                    Double kaina = Double.parseDouble(objektas[4]);
                    Telefonas obj = new Telefonas(id, pav, kaina);
                    objektuMap.put(id, obj);
                }
            }
            line = br.readLine();
            Integer pardavimuEiluciuSkaicius=Integer.parseInt(line);
            for(int i = 0; i < pardavimuEiluciuSkaicius; i++) {
                line = br.readLine();
                if(line != null) {
                    objektas = line.split(" ");
                    Integer telefonoId = Integer.parseInt(objektas[0]);
                    Integer pardavimuSkaicius = Integer.parseInt(objektas[1]);
                    objektuMap.get(telefonoId).setPardavimuSkaicius
                            (objektuMap.get(telefonoId).getPardavimuSkaicius() + pardavimuSkaicius);
                }
            }
//            line = br.readLine();

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }
}
