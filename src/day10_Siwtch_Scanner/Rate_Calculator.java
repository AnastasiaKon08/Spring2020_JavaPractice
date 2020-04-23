package day10_Siwtch_Scanner;
import java.util.Scanner;

public class Rate_Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();
        System.out.println("How many hours do you work per week? ");
        byte hours = scan.nextByte();
        System.out.println("How many weeks per year do you work? ");
        byte numberofweek = scan.nextByte();
       int rate = (salary/numberofweek)/hours;
        System.out.println("Your hourly rate is " + rate);
    }
}

/*
write a program for the rate calculater: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
 */