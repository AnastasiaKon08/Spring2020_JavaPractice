package day31_BulkOperations;

import java.util.Arrays;
import java.util.ArrayList;

public class remove_Duplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 4, 5, 5, 4));

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each: list){
            if (!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);
    }
}
