package Practice_4_20;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*
        toCharArray(): returns char array
        split(str): splits the string with given str
         */
        String str = "Cybertek";
        char[] ch1 = str.toCharArray();
        System.out.println(str.length()==ch1.length); // true


        String str1 = "ABC";
        String str2 = "BAC";

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2)); // true

        System.out.println("=======================");

        String sentence = "I like to learn Java";
         String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int total = words.length;
        System.out.println(total);
        String[] wordsRev = new String[total];


        for (int i=total-1; i>= 0; i--){
            System.out.print(words[i]+ " ");

        }

    }
}
