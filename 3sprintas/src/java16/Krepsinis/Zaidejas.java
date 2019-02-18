package java16.Krepsinis;

public class Zaidejas {
    private Integer numeris;
    private String vardas;
    private String pavarde;

    public Zaidejas(Integer numeris, String vardas, String pavarde) {
        this.numeris = numeris;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String toString() {
        return numeris + " " + vardas + " " + pavarde + " ";
    }

    public String gautiVardaPavarde() {
        return vardas + " " + pavarde;
    }

    public Integer getNumeris() {
        return numeris;
    }

    public void setNumeris(Integer numeris) {
        this.numeris = numeris;
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
}
