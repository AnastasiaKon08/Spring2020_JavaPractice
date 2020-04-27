package day27_DataTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEEE dd/MMMM/yyyy");
        LocalDate date2 = LocalDate.of(1999, 12,25);
        String str = date2.format(dtf2);
        System.out.println(str);

        LocalDate date3 = LocalDate.now();
        System.out.println(date3.format(dtf2));
    }
}
