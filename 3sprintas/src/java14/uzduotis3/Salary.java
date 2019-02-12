package java14.uzduotis3;

import java14.data.Employee;

public class Salary {
    private Employee employee;
    private Double atlyginimas;

    public Salary(Employee employee, Double atlyginimas) {
        this.employee = employee;
        this.atlyginimas = atlyginimas;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Double getAtlyginimas() {
        return atlyginimas;
    }

    public void setAtlyginimas(Double atlyginimas) {
        this.atlyginimas = atlyginimas;
    }

    public String toString() {
        return employee.toString();
    }
}
