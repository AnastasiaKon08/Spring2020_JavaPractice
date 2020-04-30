package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_RetainAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6,7 ,8, 9, 1, 2, 3, 4,5 ,6 ));
        list.retainAll(Arrays.asList(1, 2, 3)); // removes all the unmatching objects
        System.out.println(list);
    }
}
