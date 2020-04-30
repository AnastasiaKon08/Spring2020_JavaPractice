package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RemoveAll {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 3, 3, 3, 3, 3, 3));

        Integer a =1;
        Integer b = 4;
        list.remove(a);
        list.remove(b);
        System.out.println(list);

        list.removeAll(Arrays.asList(3));

        System.out.println(list);

        System.out.println("=============================");

        String[] names = {"Anna", "John", "Sarah", "Rustem", "Haylie", "Rustem"};
        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
        System.out.println(nameList);
        nameList.removeAll(Arrays.asList("Rustem"));
        System.out.println(nameList);



    }
}
