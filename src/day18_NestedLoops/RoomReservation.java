package day18_NestedLoops;

import java.util.Scanner;
public class RoomReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalPrice = 0;
        System.out.println("What room would you like to reserve? ");
        System.out.println("We have: \nKing Bed ==> 120$\nQueen Bed ===> 100$ \nSingle Bed ==> 80$");

        while (true) {


            System.out.println("Please,enter your room ");

            String type = input.nextLine();


            while (!((type.equalsIgnoreCase("King Bed")) || type.equalsIgnoreCase("Queen Bed") || type.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Sorry, we don't have this available. please, try again");
                type = input.nextLine();

            }

           if (type.equalsIgnoreCase("King Bed")){
                totalPrice += 120;
            } else if (type.equalsIgnoreCase("Queen Bed")){
               totalPrice += 100;
            } else if (type.equalsIgnoreCase("Single Bed")){
               totalPrice += 80;
           }

            System.out.println("would you like to reserve another room?");
            String answer = input.next(); // answer+enter
            input.nextLine(); // takes out the "Enter"

            if (answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")){
                System.out.println("Your Total is "+ totalPrice);
                break;
            } else if (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes")){
                System.out.println("Invalid entry, please, re-enter");
                answer= input.next();
            }


        }

    }
}
/*
    Assignment:
    write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
                should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
                    calculate the total price
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */