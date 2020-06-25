package day53_Iterator_Maps;

import java.util.*;

public class Iterating_Collections2 {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("John", "Sam",  "Sam", "Saul", "Liam", "Mark", "Saul", "Ozgur", "Ozgur" ));
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String str = it.next();
            if (str.contains("S") && str.contains("m")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("======================");
        LinkedHashSet<String> R = new LinkedHashSet<>(Arrays.asList("John", "Sam",  "Sam", "Saul", "Liam", "Mark", "Saul", "Ozgur", "Ozgur"));
        R.retainAll(Arrays.asList("Sam", "Liam", "Mark"));
        System.out.println(R);


        System.out.println("======================");
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2, 3, 4, 5, 6, 7, 8 ));
        boolean result = list.containsAll(Arrays.asList(5, 6, 7, 8));
        System.out.println(result);




    }
}
