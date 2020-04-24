package day28_DateTime;

import java.time.LocalDate;

public class WarmUp {
    public static void main(String[] args) {
        String[] friends = {"John", "Aaron", "Daniel"};

        LocalDate JohnBirthday = LocalDate.of(2020, 3, 5);
        LocalDate AaronBirthday = LocalDate.of(2000, 10, 12);
        LocalDate DanielBirthday = LocalDate.of(1995, 5, 6);

        LocalDate[] Birthdays = {JohnBirthday, AaronBirthday, DanielBirthday};

        for (int i =0; i<friends.length; i++){
            String name = friends[i];
            LocalDate birthday = Birthdays[i];
            System.out.println(name +"'s birthday is "+ birthday);

        }
     /*   int a = 100;
        int b =200;
        int c =300;
        int[] arr = {a, b, c};

      */



    }
}
