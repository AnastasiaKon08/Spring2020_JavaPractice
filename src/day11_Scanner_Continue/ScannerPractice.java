package day11_Scanner_Continue;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name ");
        String name = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();
        System.out.println("Are you employed? Enter \"true\" if yes, and \"false\" if not");
        boolean b = input.nextBoolean();

        int salary = 0;
        if (b==true){
            System.out.println("What is your salary? ");
            salary = input.nextInt();
            System.out.println("Your salary is "+ salary);
        }

        System.out.println("Summary: \nFull name: "+ name +" "+ lastName +"\nEmployed: " + b+ "\nSalary: "+ salary );



 /*
 Task: Scanner_Practice1
    1. ask the user enter first name
    2. ask user to enter last name
    3. ask the user employeed or not? true ==> employeed, false ==> unemployeed
    4. if he is employeed , ask the salary
    4. if he is not employeed set the salary to 0
    output:
        full name:
        employeeed status:
        salary:

  */




    }
}
