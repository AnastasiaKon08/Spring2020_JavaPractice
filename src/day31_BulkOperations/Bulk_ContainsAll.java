package day31_BulkOperations;
import java.util.Arrays;
import java.util.ArrayList;

public class Bulk_ContainsAll {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);

        boolean r1 = list.contains(10);

        boolean r2 = list.containsAll( Arrays.asList(10, 20, 60) ); //false
        System.out.println(r2);

        Integer[] data = {10, 30, 40 };
        boolean r3 = list.containsAll(Arrays.asList(data));
                                     // CollectionType
        System.out.println(r3);

    }
}
