package day24_Methods_Continue;

import Resources.Library;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String str = "Anastasia";

        String result =Library.Reverse(str);
        System.out.println(result);

        int[] arr = {2847, 6794, 3586, 347, 5492};
        int[] f = Library.sortDescending(arr);
        System.out.println(Arrays.toString(f));
    }
}
