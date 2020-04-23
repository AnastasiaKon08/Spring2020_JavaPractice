package day11_Scanner_Continue;
import java.util.Scanner;
public class Warm_up {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Please, provide your salary: ");
        int salary = input.nextInt();
        float stateTaxRate = 0.04f;
        float federalTaxRate = 0.22f;
        System.out.println("Your salary after tax is: " + (int)(salary- salary*stateTaxRate- salary*federalTaxRate));

    }
}

/*
2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
        3. write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
 */