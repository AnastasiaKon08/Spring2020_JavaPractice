package day11_Scanner_Continue;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        float a = input.nextFloat();
        System.out.println("You have entered: " + a);

        System.out.println("Enter true or false: ");
        boolean b = input.nextBoolean();

        System.out.println(b);

        System.out.println("Enter your sentence: ");
        String srt = input.next();

        System.out.println(srt);










    }
}
