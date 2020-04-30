package day31_BulkOperations;
import java.util.ArrayList;
import java.util.Arrays;
public class Bulk_AddAll {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();

        /* list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(45);

         */
        Integer[] arr = {20, 30, 40, 50, 35, 200};
        list.addAll(Arrays.asList(arr));
        System.out.println(list);

        System.out.println("======================");
        String[] names = {"Anna", "John", "Sarah", "Haylie", "Rustem"};
        ArrayList <String> name = new ArrayList<>();

        name.addAll( Arrays.asList(names));
        name.add("Osman");
        System.out.println(name);
        name.remove("Sarah");
        System.out.println(name);

        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(arr));
        System.out.println(numList);


    }
}
