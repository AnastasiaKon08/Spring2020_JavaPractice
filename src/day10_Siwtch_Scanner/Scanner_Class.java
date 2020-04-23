package day10_Siwtch_Scanner;
import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte number: ");
        int num1 =  input.nextInt();


        System.out.println("You have entered " + num1);

        if (num1%2 == 0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }


    }
}
