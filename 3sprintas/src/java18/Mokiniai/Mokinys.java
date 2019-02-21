package java18.Mokiniai;

import java.util.List;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private String klase;
    private Integer kiekPazymiu;
    private List<Integer> pazymiai;

    public Mokinys() {

    }

    public Mokinys(String vardas, String pavarde, String klase, Integer kiekPazymiu, List<Integer> pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.kiekPazymiu = kiekPazymiu;
        this.pazymiai = pazymiai;
    }

    public String toString() {
        return String.format("%20s %.2f %.0f",vardas + pavarde,
                gautiPazymiuVidurki(),Math.floor(gautiPazymiuVidurki()));
    }

    public Double gautiPazymiuVidurki() {
        Double suma = 0.0;
        for (Integer paz: pazymiai) {
            suma += paz;
        }
        return suma / kiekPazymiu;
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

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public Integer getKiekPazymiu() {
        return kiekPazymiu;
    }

    public void setKiekPazymiu(Integer kiekPazymiu) {
        this.kiekPazymiu = kiekPazymiu;
    }

    public List<Integer> getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(List<Integer> pazymiai) {
        this.pazymiai = pazymiai;
    }
}
