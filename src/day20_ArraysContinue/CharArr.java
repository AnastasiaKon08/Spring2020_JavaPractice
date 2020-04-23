package day20_ArraysContinue;

import java.util.Arrays;

public class CharArr {
    public static void main(String[] args) {
        String name = "Anastasia";
        char[] myName = name.toCharArray();
        System.out.println(Arrays.toString(myName));


        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean bool = Arrays.equals(char1, char2);
        System.out.println(bool);
    }


    }

