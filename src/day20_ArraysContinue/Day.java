package day20_ArraysContinue;
import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] days = {"Mon", "Tues", "Wed", "Thur", "Friday", "Saturday", "Sun" };
        String result = "";
        int count = 1;
        System.out.println("Enter a number");
        int num = input.nextInt();

        while (num > 6 || num < 1 ) {
            System.out.println("Invalid entry. Please, reenter");
            num = input.nextInt();
            count++;

        if (count == 3) {
            System.out.println("You have reached the maximum attempts allowed");
            System.exit(0);
        }


    }
        result = days[num-1];
        System.out.println(result);









    }
}
