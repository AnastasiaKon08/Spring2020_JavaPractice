package day17_WhileLoops;
import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int maxNum = -1999999999; // any number the user provided will be greater than this number

        int minNum = 1999999999;
        for (int i = 1; i<=5; i++) {
            System.out.println("Enter a number");
            int num = input.nextInt();

            if (num > maxNum) {
                maxNum = num;
            }

            if (num < minNum) {
                minNum = num;
            }
        }

            System.out.println("Maximum number is " + maxNum);
        System.out.println("Minimum number is " + minNum);






    }
}

/*
1. write a program that can ask the user "enter a number" five times and return the maximum number
				hint: you will nedd for loop and if statement
	2. write a program that can ask the user "enter a number" five times and return the minimum number
				hint: you will nedd for loop and if statement
 */