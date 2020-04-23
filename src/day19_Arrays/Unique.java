package day19_Arrays;

public class Unique {
    public static void main(String[] args) {
        String str = "AABCCEEEFFD";
         String result = "";



         for (int j = 0; j<=str.length()-1; j++) { // declares "A"

             int count = 0;

             for (int i = 0; i <= str.length() - 1; i++) { // changes the characters
                 if (str.charAt(i) == str.charAt(j)) { // checks "A" with other characters
                     count++;

                 }
             }
                 if (count == 1) {
                     result += str.charAt(j);
                 }

         }
        System.out.println(result);


        /*
        1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
	2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"

         */
    }
}
