package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Collection_Methods {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        Collections.swap(list, 0, 4);
        System.out.println(list);

        System.out.println("==========================");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Aurora", "Alice", "Ilia", "Mark", "Ilia"));
        /*
        names.set(2, "Daniel");
        names.set(4, "Egor");
         */

        Collections.replaceAll(names, "Ilia", "Daniel");
        System.out.println(names);

    }
}
