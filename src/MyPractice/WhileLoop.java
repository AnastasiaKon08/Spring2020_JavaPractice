package MyPractice;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello");
        String answer = input.next();

        while (answer.equals("hello")) {
            System.out.println("Hi, how are you?");
            answer = input.next();
        }
        System.out.println("Goodbye!");
        }
    }

