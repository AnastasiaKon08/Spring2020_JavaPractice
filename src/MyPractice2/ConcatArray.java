package MyPractice2;

import java.lang.reflect.Array;
import java.util.*;

public class ConcatArray {

    public static void main(String[] args) {
        Integer [] arr1 = {1, 2, 3};
        Integer [] arr2 = {4, 5, 6};

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr1));

        for (int i=0; i< arr2.length; i++){
            list.add(arr2[i]);
        }

        System.out.println(list);
    }
}
