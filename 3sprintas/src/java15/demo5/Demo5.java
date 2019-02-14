package java15.demo5;

import java.time.LocalDateTime;

public class Demo5 {

    public static void main(String... args) {

        LocalDateTime dateTime = LocalDateTime.parse("2017-12-01T23:59:59.999");
        System.out.println(dateTime);

        dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        dateTime = dateTime.plusDays(10);
        System.out.println(dateTime);

        dateTime = dateTime.plusYears(1);
        System.out.println(dateTime);

        dateTime = dateTime.plusSeconds(3600);
        System.out.println(dateTime);
    }
}
