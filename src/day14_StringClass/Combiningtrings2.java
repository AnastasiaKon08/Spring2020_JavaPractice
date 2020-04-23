package day14_StringClass;
import java.util.Scanner;
public class Combiningtrings2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter first word");
        String one = input.next();
        System.out.println("Enter second word");
        String two = input.next();

        String result = one.substring(1,one.length()).concat(two.substring(1,two.length()));
        System.out.println(result);

         */
        System.out.println("Enter your word");
        String word = input.next(); //Cybertek

        String middleCharacter = "";

        int totalChar = word.length();
        int middleNumber = totalChar/2; // 5/2 == 2

        if (totalChar%2 != 0){
            middleCharacter+= word.charAt(middleNumber);
        } else {
            middleCharacter = middleCharacter + word.charAt(middleNumber-1)+ word.charAt(middleNumber);
        }



        System.out.println(middleCharacter);









    }
}


/*
 Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
 */