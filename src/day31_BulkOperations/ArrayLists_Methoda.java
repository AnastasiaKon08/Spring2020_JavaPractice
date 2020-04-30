package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists_Methoda {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        boolean r1 = list.contains("C");
        System.out.println(r1);

        ArrayList <String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("C");
        list2.add("B");
        list2.add("D");

        Collections.sort(list);
        Collections.sort(list2); // list2: A, B, C, D

        boolean r2 = list.equals(list2);
        System.out.println(r2);

        System.out.println("===============================");

        ArrayList <Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(1000);
        list3.add(100);
        list3.add(1056);
        list3.add(1023);

        Collections.sort(list3);

        ArrayList<Integer> Revlist = new ArrayList<>();
        for (int i = list3.size()-1; i>=0; i--){
            Revlist.add(list3.get(i));
        }
        System.out.println(Revlist);

        Revlist.clear();
        Revlist.isEmpty();
        System.out.println(Revlist);



    }
}
