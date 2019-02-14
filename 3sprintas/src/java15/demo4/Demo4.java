package java15.demo4;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Demo4 {

    public static void main(String... args) {

        LocalDate date = LocalDate.parse("2017-12-01");
        System.out.println(date);

        date = LocalDate.now();
        System.out.println(date);
        System.out.println("Year = " + date.getYear());
        System.out.println("Month = " + date.getMonth());
        System.out.println("MonthValue = " + date.getMonthValue());
        System.out.println("DayOfMonth = " + date.getDayOfMonth());
        System.out.println("DayOfWeek = " + date.getDayOfWeek());
        System.out.println("DayOfWeek value = " + date.getDayOfWeek().getValue());

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = date.get(weekFields.weekOfWeekBasedYear());
        System.out.println("weekNumber = " + weekNumber);

        LocalDate date2 = date.plusDays(30);
        System.out.println(date2);
    }
}
