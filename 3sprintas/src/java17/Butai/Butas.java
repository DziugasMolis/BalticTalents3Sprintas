package java17.Butai;

public class Butas {
    private Integer butoNr;
    private String butoAdresas;
    private Integer kambariuSk;
    private Double kvadratura;
    private Double nuomosKaina;

    public Butas(Integer butoNr, String butoAdresas, Integer kambariuSk, Double kvadratura, Double nuomosKaina) {
        this.butoNr = butoNr;
        this.butoAdresas = butoAdresas;
        this.kambariuSk = kambariuSk;
        this.kvadratura = kvadratura;
        this.nuomosKaina = nuomosKaina;
    }

    public String toString() {
        return getButoNr() + " " + getButoAdresas() + " " + getKambariuSk() + " "
                + getKvadratura() + " " + getNuomosKaina() + "\n";
    }

    public Integer getButoNr() {
        return butoNr;
    }

    public void setButoNr(Integer butoNr) {
        this.butoNr = butoNr;
    }

    public String getButoAdresas() {
        return butoAdresas;
    }

    public void setButoAdresas(String butoAdresas) {
        this.butoAdresas = butoAdresas;
    }

    public Integer getKambariuSk() {
        return kambariuSk;
    }

    public void setKambariuSk(Integer kambariuSk) {
        this.kambariuSk = kambariuSk;
    }

    public Double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(Double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Double getNuomosKaina() {
        return nuomosKaina;
    }

    public void setNuomosKaina(Double nuomosKaina) {
        this.nuomosKaina = nuomosKaina;
    }
}
