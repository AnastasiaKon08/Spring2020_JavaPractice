package day11_Scanner_Continue;
import java.util.Scanner;
public class NextLine_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = (int)input.nextInt(); // 30+Enter
        System.out.println("Your age is " + age);

        input.nextLine();  // Takes out the "enter"
        System.out.println("Enter your full name: ");
        String name = input.nextLine(); //
        System.out.println("Your age is " + name);









    }
}
