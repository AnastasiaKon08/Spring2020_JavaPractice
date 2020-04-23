package MyPractice;
import java.util.Arrays;
import  java.util.Scanner;
public class Name_Array {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String s)
    {

        //your code here
        String[] arr = s.split(",");
        System.out.println(Arrays.toString(arr));
        // System.out.println("person name: " + arr[0]+ " last name: "+ arr[1] + " age: " + arr[2]);

    }//end person
}
