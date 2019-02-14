package java15.demo6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Demo6 {

    public static void main(String... args) {

        DateTimeFormatter germanFormatter =
                DateTimeFormatter
                        .ofLocalizedDate(FormatStyle.MEDIUM)
                        .withLocale(Locale.GERMAN);

        LocalDate xmas = LocalDate.parse("24.12.2014", germanFormatter);
        System.out.println(xmas);

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MMM d yyyy");

        xmas = LocalDate.parse("Dec 24 2014", formatter);
        System.out.println(xmas);

        formatter = DateTimeFormatter.ofPattern("yy MMMM d").withLocale(Locale.US);
        System.out.println(xmas.format(formatter));

        formatter = DateTimeFormatter.ofPattern("yyyy MMMM d").withLocale(Locale.FRANCE);
        System.out.println(xmas.format(formatter));

    }
}
