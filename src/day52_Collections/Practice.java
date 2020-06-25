package day52_Collections;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice {
    public static void main(String[] args) {
        String str = "ABABABCDEF";
        String[] arr = str.split("");

        // remove duplicates, don't change the order
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        System.out.println(set);

        String result = "";
        for (String eachChar : set){
            result+= eachChar;
        }

        System.out.println(result);
    }
}
