package java19.Sokoladai;

public class Sokoladas {
    private String pavadinimas;
    private Integer ivertinimas;

    public Sokoladas(String pavadinimas, Integer ivertinimas) {
        this.pavadinimas = pavadinimas;
        this.ivertinimas = ivertinimas;
    }

    public String toString() {
        return pavadinimas + " " + ivertinimas;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(Integer ivertinimas) {
        this.ivertinimas = ivertinimas;
    }
}
