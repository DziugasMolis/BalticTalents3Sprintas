package java17.Programuotojai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        String programuotojuFailas = new File("").getAbsolutePath() + "/src/java17/Programuotojai/Duomenys.txt";
        List<Programuotojas> list = skaitytiProgamuotojus(programuotojuFailas);
        Integer programuotojuSkaicius = gautiKiekProgramuotoju(programuotojuFailas);
        Collections.sort(list, (o1, o2) -> o1.getIvertinimas().compareTo(o2.getIvertinimas()));
        atspausdintiAtrinktus(list, programuotojuSkaicius);
        //        System.out.println(list);
    }

    public static void atspausdintiAtrinktus(List<Programuotojas> list, Integer progSkaicius) {
        for(int i = 0; i < list.size(); i++) {
            if(i < progSkaicius) {
                System.out.println(list.get(i));
            }
        }
    }

    public static Integer gautiKiekProgramuotoju(String failas) {
        Integer kiekis = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            kiekis = Integer.parseInt(line.split(" ")[0]);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return kiekis;
    }

    public static List<Programuotojas> skaitytiProgamuotojus(String failas) {
        List<Programuotojas> objektuList = new ArrayList<>();
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer kiekis = Integer.parseInt(line.split(" ")[1]);
            line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                String vardasPavarde = objektas[0];
                Integer ivertinimas = Integer.parseInt(objektas[1]);
                Programuotojas obj = new Programuotojas(vardasPavarde, ivertinimas);
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
}
