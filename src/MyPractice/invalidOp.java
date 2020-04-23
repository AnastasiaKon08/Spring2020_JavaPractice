package MyPractice;
import java.util.Scanner;
public class invalidOp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        System.out.println(word);

        if (word.length() <= 2) {
            System.out.println("invalid");
            System.exit(0);

        } else {

            int index = word.length() - 1;
            int middleIndex = index / 2;
            String middle = "" + word.charAt(middleIndex - 1) + "" + word.charAt(middleIndex) + "" + word.charAt(middleIndex + 1);


            if (word.length() % 2 != 0) {
                System.out.println(middle);
            } else {
                System.out.println("invalid");
            }


        }
    }
}


