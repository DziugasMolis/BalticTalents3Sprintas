package java18.demo2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Staff {

    private Man man;

    private Salary salary;

    public Staff(String name, String address, BigDecimal amount, LocalDate hired, LocalDate fired) {
        this.man = new Man(name, address);
        this.salary = new Salary(amount.doubleValue(), hired, fired);
    }


    public String getName() {
        return man.getName();
    }

    public void setName(String name) {
        man.setName(name);
    }

    public String getAddress() {
        return man.getAddress();
    }

    public void setAddress(String address) {
        man.setAddress(address);
    }

    public BigDecimal getAmount() {
        return BigDecimal.valueOf(salary.getAmount());
    }

    public void setAmount(BigDecimal amount) {
        salary.setAmount(amount.doubleValue());
    }

    public LocalDate getHired() {
        return salary.getHired();
    }

    public void setHired(LocalDate hired) {
        salary.setHired(hired);
    }

    public LocalDate getFired() {
        return salary.getFired();
    }

    public void setFired(LocalDate fired) {
        salary.setFired(fired);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "man=" + man +
                ", salary=" + salary +
                '}';
    }
}
