package b15_Exceptions;

import java.util.Scanner;

public class Login {


    public static final String USERID = "googleUser";
    public static final String PASSWORD = "java123";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Id: ");
        String userID = sc.next();

        System.out.println("Enter password: ");
        String password = sc.next();

        if (!userID.equals(USERID)){
            throw new RuntimeException("User Id not found  " + userID);
        }


        if (password.equals(PASSWORD)){
            throw new RuntimeException("Invalid password " + password);
        }

        System.out.println("Welcome " + userID);



    }
}
