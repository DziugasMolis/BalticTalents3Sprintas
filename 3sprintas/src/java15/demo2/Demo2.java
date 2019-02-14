package java15.demo2;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo2 {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));

        // menesiai numeruojami nuo 0 - sausis .. 11 - gruodis, 12 - sekančių metų sausis ...
        System.out.println("dabar set 24men:");
        calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, 24);
        System.out.println(calendar.getTime());

        System.out.println("2016-03-31 add -1men:");
        calendar = new GregorianCalendar(2016, 2, 31);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.MONTH, -1);
        System.out.println(calendar.getTime());

        System.out.println("2016-03-31 roll false:");
        calendar = new GregorianCalendar(2016, 2, 31);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH, false);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH, false);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH, false);
        System.out.println(calendar.getTime());

        System.out.println("2016-03-31 roll -3:");
        calendar = new GregorianCalendar(2016, 2, 31);
        System.out.println(calendar.getTime());
        calendar.roll(Calendar.MONTH, -3);
        System.out.println(calendar.getTime());

    }
}
