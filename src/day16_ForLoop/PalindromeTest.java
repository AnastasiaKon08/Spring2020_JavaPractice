package day16_ForLoop;
import java.util.Scanner;


public class PalindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String reverse = "";

        int lastIndex = word.length()-1;

        for (int i = lastIndex; i>=0; i--) {
            reverse += word.charAt((i));

        }
        // System.out.print(reverse);

        boolean palindrome =(word.equalsIgnoreCase(reverse));
        System.out.println(palindrome);








    }
}
