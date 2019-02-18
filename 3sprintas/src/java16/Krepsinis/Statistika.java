package java16.Krepsinis;

public class Statistika {
    private Integer baudos;
    private Integer dvitaskiai;
    private Integer tritaskiai;
    private Integer taskai;
    private Integer nepataikyti;
    private Double tikslumas;

    public Statistika() {
        this.baudos = 0;
        this.dvitaskiai = 0;
        this.tritaskiai = 0;
        this.taskai = 0;
        this.nepataikyti = 0;
        this.tikslumas = 0.0;
    }
    public Statistika(Integer baudos, Integer dvitaskiai, Integer tritaskiai, Integer taskai, Integer nepataikyti, Double tikslumas) {
        this.baudos = baudos;
        this.dvitaskiai = dvitaskiai;
        this.tritaskiai = tritaskiai;
        this.taskai = taskai;
        this.nepataikyti = nepataikyti;
        this.tikslumas = tikslumas;
    }

    public String toString() {
        return getBaudos() + " " + getDvitaskiai() + " " + getTritaskiai() + " " +
                getTaskai() + " " + getNepataikyti() + " " + getTikslumas();
    }

    public Integer getBaudos() {
        return baudos;
    }

    public void setBaudos(Integer baudos) {
        this.baudos = baudos;
    }

    public Integer getDvitaskiai() {
        return dvitaskiai;
    }

    public void setDvitaskiai(Integer dvitaskiai) {
        this.dvitaskiai = dvitaskiai;
    }

    public Integer getTritaskiai() {
        return tritaskiai;
    }

    public void setTritaskiai(Integer tritaskiai) {
        this.tritaskiai = tritaskiai;
    }

    public Integer getTaskai() {
        return taskai;
    }

    public void setTaskai(Integer taskai) {
        this.taskai = taskai;
    }

    public Integer getNepataikyti() {
        return nepataikyti;
    }

    public void setNepataikyti(Integer nepataikyti) {
        this.nepataikyti = nepataikyti;
    }

    public Double getTikslumas() {

        Integer visiMetimai = getNepataikyti() + getBaudos()
                + getDvitaskiai() + getTritaskiai();
        Integer taiklusMetimai = getBaudos() + getDvitaskiai() + getTritaskiai();
        if(visiMetimai > 0 && getNepataikyti().equals(0)) {
            return 100.0;
        } else if(taiklusMetimai > 0 && visiMetimai > 0){
            return Math.ceil(taiklusMetimai*100.0/visiMetimai);
        }
        return 0.0;
    }

    public void setTikslumas(Double tikslumas) {
        this.tikslumas = tikslumas;
    }
}
