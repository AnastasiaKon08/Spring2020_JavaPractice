package day21_MultiDimentionalArrays;
import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Java";
        char[] chars = name.toCharArray();

        System.out.println(chars[3]);

        String str = "I like Java";
        String [] arr = str.split(" ");
        System.out.println( Arrays.toString(arr));


        String sentence = "Today is great day";
        String [] arr1 = sentence.split(" ");
        String result = "";

        System.out.println(Arrays.toString(arr1));

        for (int i = arr1.length-1; i>=0; i--){
            String eachword= arr1[i];
            result+= eachword+ " ";

        }
        System.out.println(result);


        String str2 = "ABCD";
        String result2 ="";
        String eachword2 ="";
        String[] arr2 = str2.split(" ");
        for (int i =arr2.length-1; i>=0; i--){
            eachword2 = arr2[i];
            result2+= eachword2+" ";

        }
        System.out.println(result2);

    }
}
