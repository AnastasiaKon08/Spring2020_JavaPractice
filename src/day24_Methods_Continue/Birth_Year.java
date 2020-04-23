package day24_Methods_Continue;

import java.awt.print.Pageable;
import java.util.Scanner;

public class Birth_Year {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
       // int year = input.nextInt();

        // Age(year);
        PrintHelloCybertek();
    }


    public static void Age(int age) {
        if (age > 2020) {
            System.out.println("You are not born yet!");
        } else {
            System.out.println("Your age is " + (2020 - age));
        }
    }

    public static void PrintHello(){
        System.out.println("Hello");
    }

    public static void PrintCybertek(){
        System.out.println("Cybertek");
    }

    public static void PrintHelloCybertek() {
        PrintHello();
        PrintCybertek();
    }
}