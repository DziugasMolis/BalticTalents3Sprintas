package java20.Begimas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Begikas implements Comparable<Begikas>{
    private Integer begikoNr;
    private String vardas;
    private String pavarde;
    private String pradziosLaikas;
    private String pabaigosLaikas;
    private List<Integer> punktai;

    public Begikas(Integer begikoNr, String vardas, String pavarde, String pradziosLaikas, String pabaigosLaikas) {
        this.begikoNr = begikoNr;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.pradziosLaikas = pradziosLaikas;
        this.pabaigosLaikas = pabaigosLaikas;
        this.punktai = new ArrayList<>();
    }

    public String toString() {
        return vardas + " " + pavarde + " " + punktai.size() + " " + gautiBegimoLaika();
    }

    public String gautiBegimoLaika() {
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        long diff = 0;
        try {
            Date date1 = df.parse(getPradziosLaikas());
            Date date2 = df.parse(getPabaigosLaikas());
            diff = date2.getTime() - date1.getTime();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        long millis = diff % 1000;
        long second = (diff / 1000) % 60;
        long minute = (diff / (1000 * 60)) % 60;
        long hour = (diff / (1000 * 60 * 60)) % 24;

        return String.format("%02d:%02d:%02d.%d", hour, minute, second, millis);
    }

    public List<Integer> getPunktai() {
        return punktai;
    }

    public void setPunktai(List<Integer> punktai) {
        this.punktai = punktai;
    }

    public Integer getBegikoNr() {
        return begikoNr;
    }

    public void setBegikoNr(Integer begikoNr) {
        this.begikoNr = begikoNr;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPradziosLaikas() {
        return pradziosLaikas;
    }

    public void setPradziosLaikas(String pradziosLaikas) {
        this.pradziosLaikas = pradziosLaikas;
    }

    public String getPabaigosLaikas() {
        return pabaigosLaikas;
    }

    public void setPabaigosLaikas(String pabaigosLaikas) {
        this.pabaigosLaikas = pabaigosLaikas;
    }

    @Override
    public int compareTo(Begikas o) {
        Integer punktai = ((Integer)this.getPunktai().size())
                .compareTo(((Integer)o.punktai.size()));
        if(punktai != 0) {
            return punktai;
        }
        return this.gautiBegimoLaika().compareTo(o.gautiBegimoLaika());
    }
}
