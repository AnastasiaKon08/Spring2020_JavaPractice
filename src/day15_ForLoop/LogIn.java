package day15_ForLoop;
import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter last name");
        String lastname = input.next();
        //String initials = firstName.substring(0,1) + lastname.substring(0,1);
        String initials = " "+ firstName.charAt(0) + lastname.charAt(0);

        initials = initials.toUpperCase();
        System.out.println(initials);


    }
}












/*

 */