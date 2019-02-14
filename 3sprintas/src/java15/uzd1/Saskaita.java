package java15.uzd1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Saskaita {
    private String klientoVardas;
    private LocalDate saskaitosData;
    private BigDecimal suma;

    public Saskaita(String klientoVardas, LocalDate saskaitosData, BigDecimal suma) {
        this.klientoVardas = klientoVardas;
        this.saskaitosData = saskaitosData;
        this.suma = suma;
    }

    @Override
    public String toString() {
       return klientoVardas + " " + saskaitosData + " " + suma;
    }

    public String getKlientoVardas() {
        return klientoVardas;
    }

    public void setKlientoVardas(String klientoVardas) {
        this.klientoVardas = klientoVardas;
    }

    public LocalDate getSaskaitosData() {
        return saskaitosData;
    }

    public void setSaskaitosData(LocalDate saskaitosData) {
        this.saskaitosData = saskaitosData;
    }

    public BigDecimal getSuma() {
        return suma;
    }

    public void setSuma(BigDecimal suma) {
        this.suma = suma;
    }
}
