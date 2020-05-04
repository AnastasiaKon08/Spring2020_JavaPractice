package day33_CustomClass;

import java.util.ArrayList;

public class SpecialCharacters {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> alph =  new ArrayList<>();
        ArrayList<Character> digits =  new ArrayList<>();
        ArrayList<Character> spChar =  new ArrayList<>();
        for (int i=0; i<str.length(); i++){
            if (Character.isAlphabetic(str.charAt(i))){
                alph.add(str.charAt(i));
            } else if (Character.isDigit(str.charAt(i)) ){
                digits.add(str.charAt(i));
            } else {
                spChar.add(str.charAt(i));
            }
        }
        System.out.println(alph);
        System.out.println(digits);
        System.out.println(spChar);
    }
}
/*
write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}
 */