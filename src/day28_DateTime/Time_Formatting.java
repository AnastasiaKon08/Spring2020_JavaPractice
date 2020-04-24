package day28_DateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time_Formatting {
    public static void main(String[] args) {
        LocalTime time1 = LocalTime.of(16, 30);
        System.out.println(time1);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(time1.format(dtf));

        LocalTime time2 = LocalTime.of(00, 00);
        System.out.println(time2.format(dtf));

    }
}
