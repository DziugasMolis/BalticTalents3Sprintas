package java15.uzd2;

public class Employee implements Comparable<Employee> {

    private String vardas;

    private String pavarde;

    private String departamentas;

    Double alga;

    public Employee(String vardas, String pavarde, String departamentas, Double alga) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.departamentas = departamentas;
        this.alga = alga;
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

    public String getDepartamentas() {
        return departamentas;
    }

    public void setDepartamentas(String departamentas) {
        this.departamentas = departamentas;
    }

    public Double getAlga() {
        return alga;
    }

    public void setAlga(Double alga) {
        this.alga = alga;
    }

    @Override
    public String toString() {
        return " Vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", departamentas='" + departamentas + '\'' +
                ", alga=" + alga;
    }

    @Override
    public int compareTo(Employee o) {

        int comp = getVardas().compareTo(o.getVardas());
        if (comp != 0) return comp;

        comp = getPavarde().compareTo(o.getPavarde());
        if (comp != 0) return comp;

        comp = getDepartamentas().compareTo(o.getDepartamentas());
        if (comp != 0) return comp;

        return getAlga().compareTo(o.getAlga());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (pavarde != null && pavarde.equals(employee.pavarde)) {
            return true;
        }
        if (vardas != null && !vardas.equals(employee.vardas)) {
            return true;
        }
        if (departamentas != null && !departamentas.equals(employee.departamentas)) {
            return true;
        }
        if (alga != null && alga.equals(employee.alga)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
//        int result = (int) (id ^ (id >>> 32));
        int result = 0;
        result = 31 * result + (vardas != null ? vardas.hashCode() : 0);
        result = 31 * result + (departamentas != null ? departamentas.hashCode() : 0);
        result = 31 * result + (alga != null ? alga.hashCode() : 0);
        return result;
    }
}
