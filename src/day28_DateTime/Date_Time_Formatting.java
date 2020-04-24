package day28_DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time_Formatting {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2015, 6, 13, 20, 34, 45);
        System.out.println(dateTime1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EE MMMM/dd/yyyy hh:mm:ss a");
        System.out.println(dateTime1.format(dtf));
    }
}
