package day52_Collections;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Mary");
        names.add("Brian");
        names.add("Paul");
        names.add("Henry");
        names.add("Frank");
        names.add("Frank");
        names.add("Frank");
        names.add("Frank");

        System.out.println(names);

        String[] arr = {"A", "A", "C", "D", "A"};
        LinkedHashSet <String> set1 = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set1);

        System.out.println("===============");

        Set <Integer> numbers = new TreeSet<>();




    }
}
