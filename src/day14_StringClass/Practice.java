package day14_StringClass;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();
        System.out.println("Enter second word");
        String word2 = input.next();
        System.out.println("Enter third word");
        String word3 = input.next();

        int length1 = word1.length();
        int length2 = word2.length();
        int length3 = word3.length();

        boolean allequal = (length1 == length2 && length2 ==3);
        boolean nonesame = (length1 != length2 || length2!= length3 || length1 != length3);
        if (allequal){
            System.out.println("All words are same length");
        } else if (nonesame){
            System.out.println("None of them are same");
        } else {
            System.out.println("Some of them are different and some are same");
        }


    }
}

/*
Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
 */