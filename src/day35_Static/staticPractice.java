package day35_Static;

import java.util.Scanner;

public class staticPractice {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = scan.nextInt();

        System.out.println("Enter a number 2");
        int num2 =scan.nextInt();

        System.out.println("sum is " + (num1+num2));
    }

    public void method1(){
        // Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1");
        int num1 = scan.nextInt();

        System.out.println("Enter a number 2");
        int num2 =scan.nextInt();

        System.out.println("Multiplication is " + (num1*num2));
    }
}
