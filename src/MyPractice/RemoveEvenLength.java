package MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveEvenLength {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"));
        list.removeIf( p-> p.length()%2==0);
        System.out.println(list);

    }
}
/*
    Write a method removeEvenLength that takes a Set of strings as a parameter and that removes all of the strings of even length from the set. For example, if your method is passed a set containing the following elements:

        ["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
        Your method should modify the set to store the following elements (the order of the elements does not matter):

        ["foo", "bar", "spoon", "!"]

 */