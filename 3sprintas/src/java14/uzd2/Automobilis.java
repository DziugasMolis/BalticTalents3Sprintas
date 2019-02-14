package java14.uzd2;

public class Automobilis implements  Comparable<Automobilis>{
    private String numeris;
    private String marke;
    private String vardas;
    private String pavarde;

    public Automobilis(String numeris, String marke, String vardas, String pavarde) {
        this.numeris = numeris;
        this.marke = marke;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public String toString() {
        return numeris + " " + marke
                + " " + vardas + " " + pavarde;
    }

    public String getNumeris() {
        return numeris;
    }

    public void setNumeris(String numeris) {
        this.numeris = numeris;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
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

    @Override
    public int compareTo(Automobilis o) {
        int comp = getVardas().compareTo(o.getVardas());
        if(comp != 0) {
            return comp;
        }

        comp = getPavarde().compareTo(o.getPavarde());
        if (comp != 0) return comp;

        comp = getMarke().compareTo(o.getMarke());
        if (comp != 0) return comp;

        return getNumeris().compareTo(o.getNumeris());
    }
}
