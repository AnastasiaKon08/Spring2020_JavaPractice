package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        LocalDate date = LocalDate.of(2020, 3, 20);
        LocalTime time = LocalTime.of(11, 25, 30);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        LocalDateTime dateTime2 = LocalDateTime.of(2020, 5, 13, 12,23);

        System.out.println(dateTime2);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        LocalDate date3 = LocalDate.of(2019, 3, 19);
        System.out.println(date3.format(dtf));

    }
}
