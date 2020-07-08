package practice_7_08;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_Duplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("hkjsgfggaeirfbgd"));
    }
    public static String removeDup(String s){
        return new LinkedHashSet<String>(Arrays.asList(s.split(""))).toString().replace("[", "").replace("]", "").replace(", ", "");

    }
}
