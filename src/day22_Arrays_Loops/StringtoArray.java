package day22_Arrays_Loops;
import java.util.Scanner;
import java.util.Arrays;

public class StringtoArray {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      String[] arr = new String[5];

      for(int i=0; i<arr.length; i++) {
          System.out.println("Enter a word");
          arr[i] = input.next();
      }

      for (String each : arr){
          char ch = each.charAt(0);
         char ch2 =  each.charAt(each.length()-1);
          System.out.println(ch+" "+ch2);
      }

       //; System.out.println(Arrays.toString(arr));








    }
}
/*
 1. Write a program that will take five Strings and save them into an array called arr.
        2. use for each loop to print out the first three letter of each element of arr, one per line. You can assume that every element of arr is at least 3 letters long.
            Example:
                arr -> ["apple", "banana"]
                prints: app
                        ban
 */