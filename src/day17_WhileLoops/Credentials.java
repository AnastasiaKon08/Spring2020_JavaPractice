package day17_WhileLoops;
import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();
        System.out.println("Enter password");
        String password = input.next();

        int count =1;


        while (!(username.equals("cybertek") && password.equals("cybertek123"))) {
            System.out.println("Username or password is incorrect. Please, try again");
            System.out.println("Enter username");
            username = input.next();
            System.out.println("Enter password");
            password = input.next();


            count++;
            if (count == 3 && !(username.equals("cybertek") && password.equals("cybertek123"))){
                System.out.println("Your account is locked");
                break;
            }

        }

             if (username.equals("cybertek") && password.equals("cybertek123")){
                 System.out.println("You successfully logged in");
             }











    }
}
