package java17.Programuotojai;

import java.util.Comparator;

public class Programuotojas implements Comparator<Programuotojas> {
    private String vardasPavarde;
    private Integer ivertinimas;

    public Programuotojas(String vardasPavarde, Integer ivertinimas) {
        this.vardasPavarde = vardasPavarde;
        this.ivertinimas = ivertinimas;
    }

    public String toString() {
        return vardasPavarde + " " + ivertinimas;
    }

    public String getVardasPavarde() {
        return vardasPavarde;
    }

    public void setVardasPavarde(String vardasPavarde) {
        this.vardasPavarde = vardasPavarde;
    }

    public Integer getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(Integer ivertinimas) {
        this.ivertinimas = ivertinimas;
    }

    @Override
    public int compare(Programuotojas o1, Programuotojas o2) {
        return 0;
    }
}
