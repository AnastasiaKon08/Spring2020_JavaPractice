package day21_MultiDimentionalArrays;
import java.util.Arrays;
public class MultiDem_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        int[] [] arr2D = {   {1, 2, 3}, {4, 5, 6} };
               // index number - 0          1
        System.out.println(arr2D.length);

        int[] arr1D = arr2D[0]; // {1, 2 ,3};
        System.out.println(Arrays.toString(arr1D));

        int num = arr2D[1] [2];
        System.out.println(num);

                           // 0    1        0   1   2        3     4   5
        char[] [] ch2D = {  {'A', 'B'},  {'D', 'E', 'F'} , {'G', 'H', 'I'}       };
                    //index    0                   1               2
        char ch1 = ch2D[1][0];
        System.out.println(ch1);

        char[] arr2 = ch2D[2];
        System.out.println(Arrays.toString(arr2));







    }
}
