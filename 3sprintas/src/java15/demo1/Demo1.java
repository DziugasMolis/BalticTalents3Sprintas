package java15.demo1;

import java.util.Date;

public class Demo1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        date = new Date("01/02/2017 GMT");
        System.out.println(date);

        System.out.println(date.before(new Date()) ? "praeityje" : "ateityje");

        System.out.println(date.equals(new Date(1483315200000L))  ? "lygu" : "nelygu");
    }
}
