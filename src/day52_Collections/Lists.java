package day52_Collections;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("====================");

        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector <Integer> vector = new Vector<>();
        vector.add(10);


        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("=========================");

        Stack<String> names = new Stack<>();
        names.add("Mary");
        names.add("Brian");
        names.add("Paul");
        names.add("Henry");
        names.add("Frank");

        System.out.println(names);

        String firstOut = names.pop();  // Frank
        System.out.println(firstOut);

        System.out.println(names);





     }


}
