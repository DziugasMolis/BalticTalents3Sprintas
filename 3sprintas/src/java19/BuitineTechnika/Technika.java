package java19.BuitineTechnika;

public class Technika {
    private String pavadinimas;
    private Integer kodas;
    private Integer vntSkaicius;
    private Double vntKaina;

    public Technika(String pavadinimas, Integer kodas, Integer vntSkaicius, Double vntKaina) {
        this.pavadinimas = pavadinimas;
        this.kodas = kodas;
        this.vntSkaicius = vntSkaicius;
        this.vntKaina = vntKaina;
    }

    public String toString() {
        return pavadinimas + " " + kodas + " " + vntSkaicius +
                " " + vntKaina;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getKodas() {
        return kodas;
    }

    public void setKodas(Integer kodas) {
        this.kodas = kodas;
    }

    public Integer getVntSkaicius() {
        return vntSkaicius;
    }

    public void setVntSkaicius(Integer vntSkaicius) {
        this.vntSkaicius = vntSkaicius;
    }

    public Double getVntKaina() {
        return vntKaina;
    }

    public void setVntKaina(Double vntKaina) {
        this.vntKaina = vntKaina;
    }
}
