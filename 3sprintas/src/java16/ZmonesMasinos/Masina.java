package java16.ZmonesMasinos;

public class Masina {
    private String marke;
    private String numeriai;

    public Masina(String marke, String numeriai) {
        this.marke = marke;
        this.numeriai = numeriai;
    }

    public String toString() {
        return marke + " " + numeriai;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getNumeriai() {
        return numeriai;
    }

    public void setNumeriai(String numeriai) {
        this.numeriai = numeriai;
    }
}
