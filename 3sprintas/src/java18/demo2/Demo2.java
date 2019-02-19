package java18.demo2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Demo2 {

    public static void main(String[] args) {

        Staff staff = new Staff(
                "Jonas", "Babtai",
                BigDecimal.valueOf(1000),
                LocalDate.of(2016, 2, 29),
                LocalDate.of(2017, 1, 31));

        System.out.println(staff);

        System.out.println(staff.getName());
        System.out.println(staff.getAmount());
    }
}
