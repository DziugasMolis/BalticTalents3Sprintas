package java16.ZmonesMasinos;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private String masinosNumeriai;

    public Zmogus(String vardas, String pavarde, String masinosNumeriai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.masinosNumeriai = masinosNumeriai;
    }

    public String toString() {
        return vardas + " " + pavarde + " " + masinosNumeriai;
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

    public String getMasinosNumeriai() {
        return masinosNumeriai;
    }

    public void setMasinosNumeriai(String masinosNumeriai) {
        this.masinosNumeriai = masinosNumeriai;
    }
}
