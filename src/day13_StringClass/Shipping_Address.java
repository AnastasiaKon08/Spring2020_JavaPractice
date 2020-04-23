package day13_StringClass;
import java.util.Scanner;
public class Shipping_Address {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter building number: ");
        String buildingNum = input.next(); //112A

         input.nextLine(); // Takes out Enter from Scanner memory
        System.out.println("Enter Street address");
        String streetAddress = input.nextLine();

        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = input.next();

        input.nextLine(); // Takes out Enter from Scanner memory (use after next method, before nextLine
        System.out.println("What is your full name?");
        String fullName= input.nextLine();

        String result = "Ship to:" + fullName + "\n\t\t"+ buildingNum + " " + streetAddress + "\n\t\t"+ city+ ", " + state + " "+ zipCode;

        System.out.println(result);







    }
}

/*
2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */