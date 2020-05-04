package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class EctractChars2 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        char[] arr = str.toCharArray();
        Character [] ch = new Character[arr.length];
        for (int i=0; i<arr.length; i++){
            ch[i] =arr[i];
            }

        ArrayList<Character> alph =  new ArrayList<>(Arrays.asList(ch));
        alph.removeIf(p -> !Character.isLetter(p));
        System.out.println(alph);

        ArrayList<Character> digits =  new ArrayList<>(Arrays.asList(ch));
        digits.removeIf(t-> !Character.isDigit(t));
        System.out.println(digits);

        ArrayList<Character> spChar =  new ArrayList<>(Arrays.asList(ch));
        spChar.removeAll(alph);
        spChar.removeAll(digits);
        System.out.println(spChar);


    }
}
