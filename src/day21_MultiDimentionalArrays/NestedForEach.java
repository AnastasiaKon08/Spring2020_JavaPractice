package day21_MultiDimentionalArrays;
import java.util.Arrays;

public class NestedForEach {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        for (int each : arr) {
          //  System.out.println(each);
        }
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        for (int[] each1Darray : arr2D) {
            for (int eachElement : each1Darray) {
                System.out.println(eachElement);
            }
        }

        char [] [] ch2D = { {'A', 'B'}, {'C', 'D', 'E'}};
        for (char [] eachch : ch2D){
            for (char eachL : eachch){
                System.out.println(eachL);
            }
        }








    }
}
