package day08_IfStatements2;
import java.util.Scanner;
public class Days_Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your month?");
        byte month = input.nextByte();

        boolean days28 = month ==2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean days31 = !days30 && !days28;

        if (days28){
            System.out.println("This month has 28 days");
        } else if (days30){
            System.out.println("This month has 30 days");
        } else {
            System.out.println("This month has 31 days");
        }



    }
}


/*
28 days: 2
30 days: 4,6,9,11
31 days: 1,3,5,7,8,10,12
 */