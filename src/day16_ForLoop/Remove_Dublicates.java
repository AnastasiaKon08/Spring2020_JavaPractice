package day16_ForLoop;
import java.util.Scanner;

public class Remove_Dublicates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String str = input.nextLine();
                    //0123
        String result = "";

        for (int i =0; i<= str.length()-1; i++){
            /*
        }
            if (result.contains(""+str.charAt(i))){
                result+= str.charAt(i);

 */
        if (result.contains(""+str.charAt(i))){
            continue;
        }
            result+= str.charAt(i);


        }


        System.out.println(result);





    }
}
