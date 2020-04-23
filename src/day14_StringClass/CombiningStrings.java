package day14_StringClass;
import java.util.Scanner;

public class CombiningStrings {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String one = input.next();
        System.out.println("Enter second word");
        String two = input.next();
        String result = one.concat(" "+two).concat(" "+two).concat(" "+one);
        System.out.println(result);







    }
}



/*
1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
	2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
	3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */