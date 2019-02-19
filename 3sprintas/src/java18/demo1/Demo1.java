package java18.demo1;

import java.math.BigDecimal;

public class Demo1 {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Jonas");
        employee.setAddress("Babtai");
        employee.setSalary(BigDecimal.valueOf(1000));
        employee.setPosition("Boss");

        System.out.println(employee);

        print(employee);
    }

    static void print(Man man) {
        System.out.println(man);
    }
}
