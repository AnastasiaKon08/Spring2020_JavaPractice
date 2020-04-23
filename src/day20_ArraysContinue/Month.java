package day20_ArraysContinue;
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] months = {"Jan", "Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        /*
        String[] months2 = new String[12];
        months2[0] = "Jan";
         */

        String result = "";
        System.out.println("Enter a number");
        int num = input.nextInt();

        while (num>12 || num<=0){
            System.out.println("Invalid entry");
            System.out.println("Please, reenter");
            num = input.nextInt();
        }
            result = months[num-1];


        System.out.println(result);





    }
}
