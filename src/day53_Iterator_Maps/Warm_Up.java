package day53_Iterator_Maps;

import java.util.*;

public class Warm_Up {

    public static void main(String[] args) {
        String[] arr = {"T","R", "R", "E", "W", "S"};
        LinkedHashSet set = new LinkedHashSet(Arrays.asList(arr));
        System.out.println(set);

        System.out.println("==============================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5 ));
        list = Collections.synchronizedList(list); // thread- safe

        Set <Integer> set2 = new HashSet<>();
        set2 = Collections.synchronizedSet(set2);
        System.out.println(set2);


        System.out.println("===========================");

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("A", "I", "C", "K", "A", "K", "F"));
        LinkedHashSet<String> st = new LinkedHashSet<>(arrayList);

        System.out.println(st);





    }

    public synchronized  void append(){

    }

}
