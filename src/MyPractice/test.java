package MyPractice;
import java.util.Scanner;
import java.util.Arrays;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String sentence = input.nextLine();

        //TODO: Type your code below

        String [] arr = sentence.split(" ");
        String [] rev = new String[arr.length];
        // System.out.println(Arrays.toString(arr));
        int j=0;
        for (int i = arr.length-1; i<=0; i--){
            rev[j]=arr[i];
            j++;
        }

        System.out.println(Arrays.toString(rev));



        }
    }



