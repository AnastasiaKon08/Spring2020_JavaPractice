package day14_StringClass;
import java.util.Scanner;
public class Username_Check {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = input.next();
        System.out.println("Please, enter password: ");
        String password = input.next();

        String result = (username.equals("cybertek") && password.equals("cybertekschool"))? "You successfully logged in!": "Please, enter correct username and password and try again";
        System.out.println(result);
    }
}

/*
userName: cybertek
password: cybertekschool
 */