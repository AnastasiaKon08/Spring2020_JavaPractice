package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x%2 != 0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 ,9 ,10));
        list.removeIf(oddNumber);

        System.out.println(list);

        System.out.println("==========================");

        Predicate<Integer> lessThan5 = y -> y<5;

        ArrayList<Integer> list2  = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 ,9 ,10));

        list2.removeIf(lessThan5);
        System.out.println(list2);


        System.out.println("==========================");
        Predicate<String> startswithA = s -> !s.startsWith("A");
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aurora", "Alice", "Ilia", "Masha", "Mark", "Ilia"));

        names.removeIf(startswithA);
        System.out.println(names);

        System.out.println("==========================");
        ArrayList<String> names2 = new ArrayList<>(Arrays.asList("Aurora", "Alice", "Ilia", "Masha", "Mark", "Ilia"));

        Predicate<String> startswithAorI = m -> m.startsWith("A") || m.startsWith("I");
        names2.removeIf(startswithAorI);
        System.out.println(names2);

        System.out.println("==========================");
        Predicate<Character> digits = c -> Character.isDigit(c);
        ArrayList<Character> chars = new ArrayList<>(Arrays.asList('A', 'B', '3', '4', '5', '0', '&'));
        chars.removeIf(digits);
        System.out.println(chars);


        System.out.println("==========================");
        Predicate<Integer> greaterThan5 = p -> p>5;
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7,8 ,9 ,10));
        list3.removeIf(greaterThan5);
        System.out.println(list3);









    }

}
