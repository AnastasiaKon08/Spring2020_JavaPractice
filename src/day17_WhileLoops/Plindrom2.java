package day17_WhileLoops;

public class Plindrom2 {
    public static void main(String[] args) {


        String str = "Anna";

        String reversedStr = "";

        int index = str.length()-1; // returns last index number

        while (index>=0){
           reversedStr += str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);

        if (reversedStr.equalsIgnoreCase(str)){
            System.out.println("It's palindrome!");
        } else {
            System.out.println("It's not a palindrome");
        }



    }
}
