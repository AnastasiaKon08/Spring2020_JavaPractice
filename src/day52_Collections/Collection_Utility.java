package day52_Collections;

import java.util.*;

public class Collection_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8 , 7, 6, 5, 4));

        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);


        System.out.println("==================================");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5, 4,5 ,5 ,5 ,7, 8,9, 9,0, 4, 4, 5, 1, 2, 3, 2));

        TreeSet<Integer> sorted = new TreeSet<>();




    }
}
