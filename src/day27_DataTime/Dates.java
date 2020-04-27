package day27_DataTime;
import java.time.LocalDate;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1= LocalDate.of(2020, 10, 25);
        System.out.println(date1);

        LocalDate birthday = LocalDate.of(1996, 04, 8);
        System.out.println(birthday);

        boolean result1 = date1.isAfter(birthday);
        System.out.println(result1);

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2);

        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3);

        boolean result4 = birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("========================");

        LocalDate now = LocalDate.now();
        String str = now.toString();
        System.out.println("Today is " + now);

        LocalDate birthday2 = LocalDate.of(1990, 04, 25);
        int month = birthday2.getMonthValue();
        int day = birthday2.getDayOfMonth();


    }


}
