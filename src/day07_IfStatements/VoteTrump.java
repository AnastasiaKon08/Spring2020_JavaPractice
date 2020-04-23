package day07_IfStatements;
import java.util.Scanner;
public class VoteTrump {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();
        System.out.println("Are you a citizen?");
        String citizen = input.next();

        boolean eligible = age>=18 && citizen.equalsIgnoreCase("yes");

        if (eligible){
            System.out.println("eligible");
        } else {
            System.out.println(" you're not eligible");
        }
    }
}
